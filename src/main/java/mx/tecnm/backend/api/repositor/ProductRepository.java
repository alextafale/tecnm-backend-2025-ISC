package mx.tecnm.backend.api.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.tecnm.backend.api.entit.Products_Entities;

public interface ProductRepository extends JpaRepository<Products_Entities,Long>{

    
}
