package software.mari.server.apps.app.user.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/users")
public class UserController {

  @GetMapping()
  public String getMethodName() {
    return "Users";
  }

}
