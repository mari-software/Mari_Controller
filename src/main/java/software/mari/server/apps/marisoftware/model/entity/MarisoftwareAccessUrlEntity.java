package software.mari.server.apps.marisoftware.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.mari.server.apps.app.platform.model.entity.PlatformEntity;
import software.mari.server.config.model.BaseEntityConfig;

@Entity
@Table(name = "marisoftware_accessurl")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MarisoftwareAccessUrlEntity extends BaseEntityConfig {
  @Column(name = "url", nullable = false, columnDefinition = "TEXT")
  private String url;

  @Column(name = "file_size", nullable = true, columnDefinition = "INT")
  private int fileSize; // Store as KB

  @ManyToOne
  @JoinColumn(name = "platform_id", nullable = false)
  private PlatformEntity platform;

  @ManyToOne
  @JoinColumn(name = "marisoftware_id", nullable = false)
  private MarisoftwareEntity marisoftware;
}
