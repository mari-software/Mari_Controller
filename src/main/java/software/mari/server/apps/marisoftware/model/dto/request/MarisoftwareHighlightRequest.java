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
public class MarisoftwareHighlightRequest {

    @NotBlank
    private String url;

    @NotBlank
    private Long fileType_id;

}
