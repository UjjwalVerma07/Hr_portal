package hr_portal.hr_portal.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import hr_portal.hr_portal.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
