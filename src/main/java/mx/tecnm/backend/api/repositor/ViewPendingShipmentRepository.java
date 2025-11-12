package mx.tecnm.backend.api.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.tecnm.backend.api.entit.View_Pendings_Shipments;
public interface ViewPendingShipmentRepository extends JpaRepository<View_Pendings_Shipments, Long> {

    

}
