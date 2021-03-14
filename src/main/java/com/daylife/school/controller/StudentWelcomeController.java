package com.daylife.school.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.daylife.school.model.User;

@RestController
@RequestMapping("/daylife")
public class StudentWelcomeController {

  @PostMapping(path = "/welcome", consumes = "application/json", produces = "application/json")
  public User welcomeStudent(@RequestBody User user) {
    user.setName(user.getName());
    user.setAge(user.getAge());
    return user;
  }

}
