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
