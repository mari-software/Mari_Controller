package software.mari.server.apps.app.gender.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import software.mari.server.apps.app.gender.modal.entity.GenderEntity;

public interface GenderRepository extends JpaRepository<GenderEntity, Long> {

}
