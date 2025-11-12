package mx.tecnm.backend.api.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import mx.tecnm.backend.api.repositor.OrderRepository;
import mx.tecnm.backend.api.entit.Orders_Entities;

@RestController
@RequestMapping("/api/pedidos")
public class Orders {
    
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Orders_Entities>> getAllOrders() {
        try {
            List<Orders_Entities> orders = orderRepository.findAll();
            return ResponseEntity.ok(orders);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orders_Entities> getOrderById(@PathVariable Long id) {
        Optional<Orders_Entities> order = orderRepository.findById(id);
        return order.map(ResponseEntity::ok)
                    .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Orders_Entities> createOrder(@RequestBody Orders_Entities order) {
        try {
            Orders_Entities savedOrder = orderRepository.save(order);
            return ResponseEntity.ok(savedOrder);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Orders_Entities> updateOrder(
            @PathVariable Long id,
            @RequestBody Orders_Entities order) {
        if (!orderRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        order.setId(id);
        Orders_Entities updatedOrder = orderRepository.save(order);
        return ResponseEntity.ok(updatedOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        if (!orderRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        try {
            orderRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}