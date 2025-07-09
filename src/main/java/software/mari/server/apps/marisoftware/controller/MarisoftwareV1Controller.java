package software.mari.server.apps.marisoftware.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import software.mari.server.apps.marisoftware.model.dto.request.MarisoftwareRequest;
import software.mari.server.apps.marisoftware.model.dto.response.MarisoftwareResponse;

import java.util.List;

@RestController
@RequestMapping("/mari-software/api/v1/marisoftwares")
@RequiredArgsConstructor
public class MarisoftwareV1Controller {

    @GetMapping
    public List<MarisoftwareResponse> find() {
        return null;
    }

    @GetMapping("/{id}")
    public List<MarisoftwareResponse> findById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/{name}")
    public List<MarisoftwareResponse> findByName(@PathVariable String name) {
        return null;
    }

    @PostMapping
    public MarisoftwareResponse create(@RequestBody MarisoftwareRequest request) {
        return null;
    }

    @PatchMapping("/{id}")
    public MarisoftwareResponse updateById(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteById(Long id) {
        return "Deleted Successfully";
    }

}
