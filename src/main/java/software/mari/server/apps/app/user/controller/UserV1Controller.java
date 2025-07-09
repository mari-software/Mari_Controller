package software.mari.server.apps.app.user.controller;

import org.springframework.web.bind.annotation.*;
import software.mari.server.apps.app.user.model.dto.request.UserRequest;
import software.mari.server.apps.app.user.model.dto.response.UserResponse;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserV1Controller {

  @GetMapping
  public List<UserResponse> find() {
    return null;
  }

  @GetMapping("/{id}")
  public List<UserResponse> findById(@PathVariable Long id) {
    return null;
  }

  @GetMapping("/{name}")
  public List<UserResponse> findByName(@PathVariable String name) {
    return null;
  }

  @PostMapping
  public UserResponse create(@RequestBody UserRequest request) {
    return null;
  }

  @PatchMapping("/{id}")
  public UserResponse updateById(@PathVariable Long id) {
    return null;
  }

  @DeleteMapping("/{id}")
  public String deleteById(Long id) {
    return "Deleted Successfully";
  }

}
