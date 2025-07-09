package software.mari.server.apps.marisoftware.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import software.mari.server.apps.marisoftware.model.dto.request.MarisoftwareReviewRequest;
import software.mari.server.apps.marisoftware.model.dto.response.MarisoftwareReviewResponse;

import java.util.List;

@RestController
@RequestMapping("/mari-software/api/v1/reviews")
@RequiredArgsConstructor
public class MarisoftwareReviewV1Controller {

    @GetMapping
    public List<MarisoftwareReviewResponse> find() {
        return null;
    }

    @GetMapping("/{id}")
    public List<MarisoftwareReviewResponse> findById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/{name}")
    public List<MarisoftwareReviewResponse> findByName(@PathVariable String name) {
        return null;
    }

    @PostMapping
    public MarisoftwareReviewResponse create(@RequestBody MarisoftwareReviewRequest request) {
        return null;
    }

    @PatchMapping("/{id}")
    public MarisoftwareReviewResponse updateById(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteById(Long id) {
        return "Deleted Successfully";
    }

}
