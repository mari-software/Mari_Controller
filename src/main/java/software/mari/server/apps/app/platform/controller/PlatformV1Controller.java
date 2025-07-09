package software.mari.server.apps.app.platform.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import software.mari.server.apps.app.gender.modal.dto.request.GenderRequest;
import software.mari.server.apps.app.gender.modal.dto.response.GenderResponse;
import software.mari.server.apps.app.platform.model.dto.request.PlatformRequest;
import software.mari.server.apps.app.platform.model.dto.response.PlatformResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/platforms")
@RequiredArgsConstructor
public class PlatformV1Controller {

    @GetMapping
    public List<PlatformResponse> find() {
        return null;
    }

    @GetMapping("/{id}")
    public List<PlatformResponse> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public PlatformResponse create(@RequestBody PlatformRequest request) {
        return null;
    }

    @PatchMapping("/{id}")
    public PlatformResponse updateById(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteById(Long id) {
        return "Deleted Successfully";
    }

}
