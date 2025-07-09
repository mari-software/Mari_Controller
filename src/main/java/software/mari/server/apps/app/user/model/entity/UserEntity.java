package software.mari.server.apps.app.user.model.entity;

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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.mari.server.apps.app.gender.modal.entity.GenderEntity;
import software.mari.server.apps.app.role.model.entity.RoleEntity;
import software.mari.server.config.model.BaseEntityConfig;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "app_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserEntity extends BaseEntityConfig {

  @Column(name = "name", nullable = false, unique = true, columnDefinition = "TEXT")
  private String name;

  @Column(name = "display_name", nullable = false, columnDefinition = "TEXT", length = 100)
  private String display_name;

  @Column(name = "age", nullable = false)
  @Min(5)
  @Max(150)
  private int age;

  @Email
  @Column(name = "email", nullable = false, unique = true)
  private String email;

  @Email
  @Column(name = "secondary_email", nullable = true, unique = false)
  private String secondary_email;

  @Column(name = "phone", nullable = true, unique = true, length = 50)
  private String phone;

  @Column(name = "password", nullable = false, columnDefinition = "TEXT")
  private String password;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "app_user_and_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
  @Builder.Default
  private Set<RoleEntity> app_role = new HashSet<>();

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "app_user_and_gender", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "gender_id"))
  @Builder.Default
  private Set<GenderEntity> app_gender = new HashSet<>();

  public void addRole(RoleEntity app_role) {
    this.app_role.add(app_role);
    app_role.getUser().add(this); // Assuming RoleEntity also has a ManyToMany back-reference
  }

  public void removeRole(RoleEntity app_role) {
    this.app_role.remove(app_role);
    app_role.getUser().remove(this);
  }
}
