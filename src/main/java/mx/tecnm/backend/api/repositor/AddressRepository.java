package mx.tecnm.backend.api.repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.tecnm.backend.api.entit.Addresses_Entities;
public interface AddressRepository extends JpaRepository<Addresses_Entities, Long>{

    

}
