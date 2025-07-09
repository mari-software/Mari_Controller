package software.mari.server.apps.app.platform.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlatformResponse {

    private Long id;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    private String name;
    private String description;

}
