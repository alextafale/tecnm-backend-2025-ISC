package mx.tecnm.backend.api.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.tecnm.backend.api.repositor.OrderDetailRepository;
import java.util.List;
import java.util.Collections;

@RestController
@RequestMapping("/api/detalles_pedido")
public class Order_Details {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @GetMapping("/all")
    public ResponseEntity<List<?>> getAllOrderDetails() {
        try {
            List<?> orderDetails = orderDetailRepository.findAll();
            return ResponseEntity.ok(orderDetails);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Collections.emptyList());
        }
    }
}