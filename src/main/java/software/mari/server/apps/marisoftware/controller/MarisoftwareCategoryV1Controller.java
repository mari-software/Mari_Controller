package software.mari.server.apps.marisoftware.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import software.mari.server.apps.marisoftware.model.dto.request.MarisoftwareCategoryRequest;
import software.mari.server.apps.marisoftware.model.dto.response.MarisoftwareCategoryResponse;

import java.util.List;

@RestController
@RequestMapping("/mari-software/api/v1/categories")
@RequiredArgsConstructor
public class MarisoftwareCategoryV1Controller {

    @GetMapping
    public List<MarisoftwareCategoryResponse> find() {
        return null;
    }

    @GetMapping("/{id}")
    public List<MarisoftwareCategoryResponse> findById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/{name}")
    public List<MarisoftwareCategoryResponse> findByName(@PathVariable String name) {
        return null;
    }

    @PostMapping
    public MarisoftwareCategoryResponse create(@RequestBody MarisoftwareCategoryRequest request) {
        return null;
    }

    @PatchMapping("/{id}")
    public MarisoftwareCategoryResponse updateById(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteById(Long id) {
        return "Deleted Successfully";
    }

}
