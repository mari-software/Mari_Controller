package software.mari.server.apps.marisoftware.model.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.mari.server.config.model.BaseEntityConfig;

@Entity
@Table(name = "marisoftware_category")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MarisoftwareCategoryEntity extends BaseEntityConfig {

  @Column(name = "name", nullable = false, unique = true, columnDefinition = "TEXT", length = 50)
  private String name;

  @Column(name = "description", nullable = false, columnDefinition = "TEXT")
  private String description;

  @ManyToMany(mappedBy = "category")
  private Set<MarisoftwareEntity> marisoftware = new HashSet<>();
}
