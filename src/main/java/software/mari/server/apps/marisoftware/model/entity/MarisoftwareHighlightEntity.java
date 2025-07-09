package software.mari.server.apps.marisoftware.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.mari.server.apps.app.filetype.model.entity.FileTypeEntity;
import software.mari.server.config.model.BaseEntityConfig;

@Entity
@Table(name = "marisoftware_highlight")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MarisoftwareHighlightEntity extends BaseEntityConfig {
  @Column(name = "url", nullable = false, columnDefinition = "TEXT")
  private String url;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "filetype_id", nullable = false)
  private FileTypeEntity fileType;
}
