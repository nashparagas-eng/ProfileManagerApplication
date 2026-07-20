package ph.edu.dlsu.lbycpob.profilemanagerapplication.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ph.edu.dlsu.lbycpob.profilemanager.dto.Dtos;
import ph.edu.dlsu.lbycpob.profilemanager.dto.Dtos.*;
import ph.edu.dlsu.lbycpob.profilemanager.model.Profile;
import ph.edu.dlsu.lbycpob.profilemanager.service.ProfileService;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public List<Dtos.ProfileListItem> listProfiles() {
        return profileService.listProfiles().stream().map(ProfileListItem::of).toList();
    }

    @GetMapping("/{id}")
    public ProfileDetail getProfile(@PathVariable UUID id) {
        Profile profile = profileService.getProfile(id);
        return ProfileDetail.of(profile, profileService.getFriendsOf(id));
    }

    @GetMapping("/lookup")
    public ProfileDetail lookupProfile(@RequestParam String query) {
        Profile profile = profileService.lookupFirstMatch(query);
        return ProfileDetail.of(profile, profileService.getFriendsOf(profile.getId()));
    }

    @PostMapping
    public ProfileDetail createProfile(@RequestBody NewProfileRequest request) {
        Profile created = profileService.createProfile(request.name());
        return ProfileDetail.of(created, List.of());
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deleteProfile(@PathVariable UUID id) {
        Profile profile = profileService.getProfile(id);
        profileService.deleteProfile(id);
        return Map.of("deletedName", profile.getName());
    }
