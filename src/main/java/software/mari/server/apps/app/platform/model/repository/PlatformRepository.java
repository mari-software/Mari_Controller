package software.mari.server.apps.app.platform.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import software.mari.server.apps.app.platform.model.entity.PlatformEntity;

public interface PlatformRepository extends JpaRepository<PlatformEntity, Long> {

}
