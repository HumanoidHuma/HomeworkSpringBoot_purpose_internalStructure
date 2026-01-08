package ru.netology.springBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springBootDemo.systemProfile.SystemProfile;

@RestController
@RequestMapping("/")
public class ProfileController {
    private SystemProfile profile;

    public ProfileController(SystemProfile systemProfile) {
        this.profile = systemProfile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}
