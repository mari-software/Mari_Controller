package software.mari.server.apps.marisoftware.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarisoftwareCategoryRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

}
