package software.mari.server.apps.app.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import software.mari.server.apps.app.user.model.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
  
}
