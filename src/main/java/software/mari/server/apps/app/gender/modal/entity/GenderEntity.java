package software.mari.server.apps.app.gender.modal.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import software.mari.server.apps.app.user.model.entity.UserEntity;
import software.mari.server.config.model.BaseEntityConfig;

@Entity
@Table(name = "app_gender")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GenderEntity extends BaseEntityConfig {

  @Column(name = "name", nullable = false, unique = true, length = 10)
  private String name;

  @Column(name = "description", nullable = false, columnDefinition = "TEXT")
  private String description;

}
