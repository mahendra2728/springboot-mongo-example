package com.pm.mongo.controller;

import com.pm.mongo.model.User;
import com.pm.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/api/")
public class UserRestController {

  @Autowired private UserRepository userRepository;

  @PostMapping("users")
  public User addUser(@RequestBody User user) {
    user.setUserdId(UUID.randomUUID().hashCode());
    return userRepository.save(user);
  }

  @GetMapping("users")
  public List<User> findAll(){
      return userRepository.findAll();
  }
}
