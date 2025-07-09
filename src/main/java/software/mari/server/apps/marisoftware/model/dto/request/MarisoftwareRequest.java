package software.mari.server.apps.marisoftware.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarisoftwareRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String shortDescription;

    @NotBlank
    private String longDescription;

    @NotBlank
    private String icon;

    @NotBlank
    private int major_version;

    @NotBlank
    private int minor_version;

    @NotBlank
    private int patch_version;

    @NotBlank
    private String identifier_name;

    @NotBlank
    private Long user_id;

    @NotBlank
    private List<Long> category_ids;

}
