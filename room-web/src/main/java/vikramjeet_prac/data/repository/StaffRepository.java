package vikramjeet_prac.data.repository;

import vikramjeet_prac.data.entity.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface StaffRepository extends JpaRepository<StaffMember, UUID> {
}