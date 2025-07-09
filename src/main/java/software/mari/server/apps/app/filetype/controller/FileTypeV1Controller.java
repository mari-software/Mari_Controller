package software.mari.server.apps.app.filetype.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/filetype")
@RequiredArgsConstructor
public class FileTypeV1Controller {
  @GetMapping
  public String get() {
    return "These are the products";
  }

  @GetMapping("/{id}")
  public String getById() {
    return "These are the products by id";
  }

  @PostMapping
  public String postMethodName(@RequestBody String entity) {
    return entity;
  }

}
