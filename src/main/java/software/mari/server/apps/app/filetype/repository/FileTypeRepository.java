package software.mari.server.apps.app.filetype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import software.mari.server.apps.app.filetype.model.entity.FileTypeEntity;

public interface FileTypeRepository extends JpaRepository<FileTypeEntity, Long> {

}
