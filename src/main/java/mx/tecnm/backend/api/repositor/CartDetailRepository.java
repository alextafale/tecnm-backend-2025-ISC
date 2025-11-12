package mx.tecnm.backend.api.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.tecnm.backend.api.entit.Cart_Details_Entities;
public interface CartDetailRepository extends JpaRepository<Cart_Details_Entities, Long>{

}
