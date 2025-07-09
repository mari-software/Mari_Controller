package software.mari.server.apps.app.user.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String displayName;

    @NotBlank
    private int age;

    @NotBlank
    private String email;

    private String secondary_email;

    @NotBlank
    private String phone;

    @NotBlank
    private String password;

    @NotBlank
    private List<Long> app_roles;

    @NotBlank
    private Long gender_id;

}
