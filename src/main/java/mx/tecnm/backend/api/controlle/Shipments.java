package mx.tecnm.backend.api.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import mx.tecnm.backend.api.repositor.ShipmentRepository;
import mx.tecnm.backend.api.entit.Shipments_Entities;

@RestController
@RequestMapping("/api/envios")
public class Shipments {
    
    @Autowired
    private ShipmentRepository shipmentRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Shipments_Entities>> getAllShipments() {
        try {
            List<Shipments_Entities> shipments = shipmentRepository.findAll();
            return ResponseEntity.ok(shipments);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shipments_Entities> getShipmentById(@PathVariable Long id) {
        Optional<Shipments_Entities> shipment = shipmentRepository.findById(id);
        return shipment.map(ResponseEntity::ok)
                       .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Shipments_Entities> createShipment(@RequestBody Shipments_Entities shipment) {
        try {
            Shipments_Entities savedShipment = shipmentRepository.save(shipment);
            return ResponseEntity.ok(savedShipment);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Shipments_Entities> updateShipment(
            @PathVariable Long id,
            @RequestBody Shipments_Entities shipment) {
        if (!shipmentRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        shipment.setId(id);
        Shipments_Entities updatedShipment = shipmentRepository.save(shipment);
        return ResponseEntity.ok(updatedShipment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteShipment(@PathVariable Long id) {
        if (!shipmentRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        try {
            shipmentRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}