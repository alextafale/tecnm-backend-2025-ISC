package mx.tecnm.backend.api.repositor;

import mx.tecnm.backend.api.entit.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

    

}
