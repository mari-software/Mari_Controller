package software.mari.server.apps.app.filetype.controller;

import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import software.mari.server.apps.app.filetype.model.dto.request.FileTypeRequest;
import software.mari.server.apps.app.filetype.model.dto.response.FileTypeResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/filetypes")
@RequiredArgsConstructor
public class FileTypeV1Controller {

  @GetMapping
  public List<FileTypeResponse> find() {
    return null;
  }

  @GetMapping("/{id}")
  public FileTypeResponse findById(@PathVariable Long id) {
    return null;
  }

  @PostMapping
  public FileTypeResponse create(@RequestBody FileTypeRequest request) {
    return null;
  }

  @PatchMapping("/{id}")
  public FileTypeResponse updateById(@PathVariable Long id) {
    return null;
  }

  @DeleteMapping("/{id}")
  public String deleteById(Long id) {
    return "Deleted Successfully";
  }

}
