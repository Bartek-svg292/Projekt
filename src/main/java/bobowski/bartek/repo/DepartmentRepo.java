package bobowski.bartek.repo;

import bobowski.bartek.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepo extends JpaRepository<DepartmentEntity, Long> {

}
