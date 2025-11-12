package mx.tecnm.backend.api.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.tecnm.backend.api.entit.Order_Details_Entities;

public interface OrderDetailRepository extends JpaRepository<Order_Details_Entities, Long>{

    
}
