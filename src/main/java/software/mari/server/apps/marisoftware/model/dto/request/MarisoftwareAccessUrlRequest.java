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
public class MarisoftwareAccessUrlRequest {

    @NotBlank
    private String url;

    @NotBlank
    private int fileSize;

    @NotBlank
    private Long platform_id;

    @NotBlank
    private Long marisoftware_id;

}
