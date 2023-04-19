package com.ABAB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ABAB.model.GitHubConfiguration;
import com.ABAB.model.User;
import com.ABAB.service.GitHubConfigurationService;
import com.ABAB.service.UserService;

@RestController
@RequestMapping("/ABAB/api")
public class ABABController {
    
    @Autowired
    private GitHubConfigurationService gitHubConfigurationService;
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/configuration/{userName}/{password}/{url}")
    public ResponseEntity<GitHubConfiguration> getConfigurationByUserNameAndPasswordAndUrl(@PathVariable("userName") String userName, @PathVariable("password") String password, @PathVariable("url") String url) {
        GitHubConfiguration configuration = gitHubConfigurationService.getConfigurationByUserNameAndPasswordAndUrl(userName, password, url);
        return ResponseEntity.ok(configuration);
    }
    
    @GetMapping("/configuration/{repositoryName}")
    public ResponseEntity<GitHubConfiguration> getConfigurationByRepositoryName(@PathVariable("repositoryName") String repositoryName) {
        GitHubConfiguration configuration = gitHubConfigurationService.getConfigurationByRepositoryName(repositoryName);
        return ResponseEntity.ok(configuration);
    }
    
    @GetMapping("/configuration/{title}/{userName}/{url}")
    public ResponseEntity<GitHubConfiguration> getConfigurationByTitleAndUserNameAndUrl(@PathVariable("title") String title, @PathVariable("userName") String userName, @PathVariable("url") String url) {
        GitHubConfiguration configuration = gitHubConfigurationService.getConfigurationByTitleAndUserNameAndUrl(title, userName, url);
        return ResponseEntity.ok(configuration);
    }
    
    @GetMapping("/configuration")
    public ResponseEntity<List<GitHubConfiguration>> getAllConfigurations() {
        List<GitHubConfiguration> configurations = gitHubConfigurationService.getAllConfigurations();
        return ResponseEntity.ok(configurations);
    }
    
    @DeleteMapping("/configuration/{title}")
    public ResponseEntity<Void> deleteConfigurationByTitle(@PathVariable("title") String title) {
        gitHubConfigurationService.deleteConfigurationByTitle(title);
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/user/{username}")
    public ResponseEntity<User> findByUsername(@PathVariable("username") String username) {
        User user = userService.findByUsername(username);
        return ResponseEntity.ok(user);
    }
    
    @GetMapping("/user/email/{email}")
    public ResponseEntity<User> findByEmail(@PathVariable("email") String email) {
        User user = userService.findByEmail(email);
        return ResponseEntity.ok(user);
    }
    
    @GetMapping("/user/password/{password}")
    public ResponseEntity<User> findByPassword(@PathVariable("password") String password) {
        User user = userService.findByPassword(password);
        return ResponseEntity.ok(user);
    }
    
    @GetMapping("/user/{username}/{password}")
    public ResponseEntity<User> findByUsernameAndPassword(@PathVariable("username") String username, @PathVariable("password") String password) {
        User user = userService.findByUsername