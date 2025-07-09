package software.mari.server.apps.marisoftware.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarisoftwareReviewResponse {

    private Long id;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    private int rating;
    private String comment;
    private String user_name;
    private Long marisoftware_id;
}
