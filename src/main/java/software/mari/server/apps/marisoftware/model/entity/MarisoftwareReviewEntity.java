package software.mari.server.apps.marisoftware.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.mari.server.apps.app.user.model.entity.UserEntity;
import software.mari.server.config.model.BaseEntityConfig;

@Entity
@Table(name = "marisoftware_review")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MarisoftwareReviewEntity extends BaseEntityConfig {
  @Min(0)
  @Max(5)
  @Column(name = "rating", nullable = false)
  private int rating;

  @Column(name = "comment", nullable = false, columnDefinition = "TEXT", length = 200)
  private String comment;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private UserEntity user;

  @ManyToOne
  @JoinColumn(name = "marisoftware_id", nullable = false)
  private MarisoftwareEntity marisoftware;
}
