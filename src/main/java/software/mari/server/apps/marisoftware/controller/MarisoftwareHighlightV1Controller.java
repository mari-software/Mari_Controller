package software.mari.server.apps.marisoftware.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import software.mari.server.apps.marisoftware.model.dto.request.MarisoftwareHighlightRequest;
import software.mari.server.apps.marisoftware.model.dto.response.MarisoftwareHighlightResponse;


import java.util.List;

@RestController
@RequestMapping("/mari-software/api/v1/highlights")
@RequiredArgsConstructor
public class MarisoftwareHighlightV1Controller {

    @GetMapping
    public List<MarisoftwareHighlightResponse> find() {
        return null;
    }

    @GetMapping("/{id}")
    public List<MarisoftwareHighlightResponse> findById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/{name}")
    public List<MarisoftwareHighlightResponse> findByName(@PathVariable String name) {
        return null;
    }

    @PostMapping
    public MarisoftwareHighlightResponse create(@RequestBody MarisoftwareHighlightRequest request) {
        return null;
    }

    @PatchMapping("/{id}")
    public MarisoftwareHighlightResponse updateById(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteById(Long id) {
        return "Deleted Successfully";
    }

}
