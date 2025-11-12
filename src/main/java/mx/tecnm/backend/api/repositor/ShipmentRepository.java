package mx.tecnm.backend.api.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.tecnm.backend.api.entit.Shipments_Entities;

public interface ShipmentRepository extends JpaRepository<Shipments_Entities, Long> {

    
}
