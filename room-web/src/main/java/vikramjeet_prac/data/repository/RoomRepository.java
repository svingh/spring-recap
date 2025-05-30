package vikramjeet_prac.data.repository;

import vikramjeet_prac.data.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface RoomRepository extends JpaRepository<RoomEntity, UUID> {

}