package software.mari.server.apps.app.platform.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import software.mari.server.config.model.BaseEntityConfig;

@Entity
@Table(name = "app_platform")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlatformEntity extends BaseEntityConfig {

  @Column(name = "name", nullable = false, unique = true, columnDefinition = "TEXT", length = 50)
  private String name;

  @Column(name = "description", nullable = false, columnDefinition = "TEXT")
  private String description;
}
