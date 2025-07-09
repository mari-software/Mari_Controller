package software.mari.server.apps.app.platform.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlatformRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

}
