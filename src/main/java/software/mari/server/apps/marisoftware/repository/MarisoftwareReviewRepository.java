package software.mari.server.apps.marisoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import software.mari.server.apps.marisoftware.model.entity.MarisoftwareReviewEntity;

public interface MarisoftwareReviewRepository extends JpaRepository<MarisoftwareReviewEntity, Long> {

}
