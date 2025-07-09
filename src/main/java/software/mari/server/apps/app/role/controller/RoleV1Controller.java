package software.mari.server.apps.app.role.controller;

import org.springframework.web.bind.annotation.*;
import software.mari.server.apps.app.platform.model.dto.request.PlatformRequest;
import software.mari.server.apps.app.platform.model.dto.response.PlatformResponse;
import software.mari.server.apps.app.role.model.dto.request.RoleRequest;
import software.mari.server.apps.app.role.model.dto.response.RoleResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/roles")
public class RoleV1Controller {

    @GetMapping
    public List<RoleResponse> find() {
        return null;
    }

    @GetMapping("/{id}")
    public List<RoleResponse> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public RoleResponse create(@RequestBody RoleRequest request) {
        return null;
    }

    @PatchMapping("/{id}")
    public RoleResponse updateById(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteById(Long id) {
        return "Deleted Successfully";
    }

}
