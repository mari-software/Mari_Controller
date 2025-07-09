package software.mari.server.apps.app.user.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.mari.server.apps.app.role.model.dto.response.RoleResponse;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {

    private Long id;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    private String name;
    private String displayName;
    private int age;
    private String email;
    private String secondary_email;
    private String phone;
    private List<String> app_roles;
    private String gender;

}
