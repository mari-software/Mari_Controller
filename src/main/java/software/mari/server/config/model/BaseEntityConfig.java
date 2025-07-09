package software.mari.server.config.model;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

@MappedSuperclass
public abstract class BaseEntityConfig {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", updatable = false, nullable = false)
  private Long id;

  @Column(name = "create_at", nullable = false, updatable = false)
  private OffsetDateTime createAt;

  @Column(name = "update_at", nullable = false)
  private OffsetDateTime updateAt;

  @PrePersist
  protected void onCreate() {
    OffsetDateTime now = OffsetDateTime.now(); // full ISO with offset
    this.createAt = now;
    this.updateAt = now;
  }

  @PreUpdate
  protected void onUpdate() {
    this.updateAt = OffsetDateTime.now();
  }

  public Long getId() {
    return id;
  }

  public OffsetDateTime getCreateAt() {
    return createAt;
  }

  public OffsetDateTime getUpdateAt() {
    return updateAt;
  }
}
