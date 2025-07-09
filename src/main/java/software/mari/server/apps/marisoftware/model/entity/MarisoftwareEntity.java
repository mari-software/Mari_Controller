package software.mari.server.apps.marisoftware.model.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.mari.server.apps.app.filetype.model.entity.FileTypeEntity;
import software.mari.server.apps.app.user.model.entity.UserEntity;
import software.mari.server.config.model.BaseEntityConfig;

@Entity
@Table(name = "marisoftware")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MarisoftwareEntity extends BaseEntityConfig {
  @Column(name = "name", nullable = false, columnDefinition = "VARCHAR", length = 150)
  private String name;

  @Column(name = "short_description", nullable = false, columnDefinition = "VARCHAR", length = 150)
  private String shortDescription;

  @Column(name = "long_description", nullable = false, columnDefinition = "TEXT")
  private String longDescription;

  @Column(name = "icon", nullable = false, columnDefinition = "TEXT")
  private String icon;

  @Column(name = "major_version", nullable = false, columnDefinition = "INT")
  private int major_version;

  @Column(name = "minor_version", nullable = false, columnDefinition = "INT")
  private int minor_version;

  @Column(name = "patch_version", nullable = false, columnDefinition = "INT")
  private int patch_version;

  @Column(name = "identifier_name", nullable = false, unique = true, columnDefinition = "VARCHAR", length = 200)
  private String identifier_name;

  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private UserEntity userEntity;

  @ManyToMany
  @JoinTable(name = "marisoftware_product_and_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
  private Set<MarisoftwareCategoryEntity> category = new HashSet<>();
}
