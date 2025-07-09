package software.mari.server.apps.app.gender.modal.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenderRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

}
