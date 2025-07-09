package software.mari.server.apps.app.filetype.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import software.mari.server.config.model.BaseEntityConfig;

@Entity
@Table(name = "app_filetype")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileTypeEntity extends BaseEntityConfig {
  @Column(name = "name", nullable = false, unique = true, columnDefinition = "TEXT", length = 50)
  private String name;

  @Column(name = "description", nullable = false, columnDefinition = "TEXT")
  private String description;
}
