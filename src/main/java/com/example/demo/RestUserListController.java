package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class RestUserListController {
  @PostMapping("/user")
  public List<User> getListOfUsers() {
    List<User> userList = new ArrayList<>();
    User user1 = new User("srinadh1304@gmail.com", "srinadh", "tadiparthi", "pass", "pass", "Administrator");
    User user2 = new User("chandra@gmail.com", "chandra", "tadiparthi", "pass", "pass", "Administrator");
    userList.add(user1);
    userList.add(user2);
    return userList;
  }
}
