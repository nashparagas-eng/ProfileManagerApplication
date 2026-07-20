package ph.edu.dlsu.lbycpob.profilemanagerapplication.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import ph.edu.dlsu.lbycpob.profilemanagerapplication.model.Friend;
import ph.edu.dlsu.lbycpob.profilemanagerapplication.model.Profile;
import ph.edu.dlsu.lbycpob.profilemanagerapplication.repository.FriendRepository;
import ph.edu.dlsu.lbycpob.profilemanagerapplication.repository.ProfileRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
