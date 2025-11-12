package mx.tecnm.backend.api.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.tecnm.backend.api.entit.Payments_Methods_Entities;

public interface PaymentMethodRepository extends JpaRepository<Payments_Methods_Entities, Long>{

    

}
