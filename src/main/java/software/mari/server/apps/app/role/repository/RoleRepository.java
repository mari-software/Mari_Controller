package software.mari.server.apps.app.role.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import software.mari.server.apps.app.role.model.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

}
