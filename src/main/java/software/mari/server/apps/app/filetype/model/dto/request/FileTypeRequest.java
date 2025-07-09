package software.mari.server.apps.app.filetype.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileTypeRequest {
  @NotBlank
  private String name;

  @NotBlank
  private String description;
}
