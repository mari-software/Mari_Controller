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
public class MarisoftwareAccessUrlResponse {

    private Long id;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    private String url;
    private int fileSize;
    private String platform_name;
    private Long marisoftware_id;
    private Long marisoftware_name;

}
