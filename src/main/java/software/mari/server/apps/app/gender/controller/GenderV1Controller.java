package software.mari.server.apps.app.gender.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import software.mari.server.apps.app.gender.modal.dto.request.GenderRequest;
import software.mari.server.apps.app.gender.modal.dto.response.GenderResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/genders")
@RequiredArgsConstructor
public class GenderV1Controller {

    @GetMapping
    public List<GenderResponse> find() {
        return null;
    }

    @GetMapping("/{id}")
    public List<GenderResponse> findById(@PathVariable Long id) {
        return null;
    }


    @PostMapping
    public GenderResponse create(@RequestBody GenderRequest request) {
        return null;
    }

    @PatchMapping("/{id}")
    public GenderResponse updateById(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteById(Long id) {
        return "Deleted Successfully";
    }

}
