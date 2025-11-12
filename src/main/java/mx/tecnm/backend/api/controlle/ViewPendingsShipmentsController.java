package mx.tecnm.backend.api.controlle;

import mx.tecnm.backend.api.entit.View_Pendings_Shipments;
import mx.tecnm.backend.api.repositor.ViewPendingShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/vista_envios_pendientes")
public class ViewPendingsShipmentsController {

    @Autowired
    private ViewPendingShipmentRepository viewPendingsShipmentsRepository;

    @GetMapping
    public ResponseEntity<List<View_Pendings_Shipments>> getAllPendingsShipments() {
        List<View_Pendings_Shipments> pendings = viewPendingsShipmentsRepository.findAll();
        return ResponseEntity.ok(pendings);
    }
}
