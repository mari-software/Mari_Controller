package software.mari.server.apps.marisoftware.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import software.mari.server.apps.marisoftware.model.dto.request.MarisoftwareAccessUrlRequest;
import software.mari.server.apps.marisoftware.model.dto.response.MarisoftwareAccessUrlResponse;

import java.util.List;

@RestController
@RequestMapping("/mari-software/api/v1/access-urls")
@RequiredArgsConstructor
public class MarisoftwareAccessUrlV1Controller {

    @GetMapping
    public List<MarisoftwareAccessUrlResponse> find() {
        return null;
    }

    @GetMapping("/{id}")
    public List<MarisoftwareAccessUrlResponse> findById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/{name}")
    public List<MarisoftwareAccessUrlResponse> findByName(@PathVariable String name) {
        return null;
    }

    @PostMapping
    public MarisoftwareAccessUrlResponse create(@RequestBody MarisoftwareAccessUrlRequest request) {
        return null;
    }

    @PatchMapping("/{id}")
    public MarisoftwareAccessUrlResponse updateById(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteById(Long id) {
        return "Deleted Successfully";
    }

}
