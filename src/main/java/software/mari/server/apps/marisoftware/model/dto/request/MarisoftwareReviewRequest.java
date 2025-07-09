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
public class MarisoftwareReviewRequest {

    @NotBlank
    private int rating;

    @NotBlank
    private String comment;

    @NotBlank
    private Long user_id;

    @NotBlank
    private Long marisoftware_id;

}
