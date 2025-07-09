package software.mari.server.apps.marisoftware.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarisoftwareResponse {

    private Long id;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    private String name;
    private String shortDescription;
    private String longDescription;
    private String icon;
    private int major_version;
    private int minor_version;
    private int patch_version;
    private String identifier_name;
    private String user_name;
    private List<String> categories;

}
