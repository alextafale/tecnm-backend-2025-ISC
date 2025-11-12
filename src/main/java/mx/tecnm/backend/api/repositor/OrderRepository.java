package mx.tecnm.backend.api.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.tecnm.backend.api.entit.Orders_Entities;

public interface OrderRepository extends JpaRepository<Orders_Entities, Long>{

    

}
