package mx.tecnm.backend.api.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import mx.tecnm.backend.api.repositor.PaymentMethodRepository;
import mx.tecnm.backend.api.entit.Payments_Methods_Entities;

@RestController
@RequestMapping("/api/metodos_pago")
public class Payment_Methods {

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Payments_Methods_Entities>> getAllPaymentMethods() {
        try {
            List<Payments_Methods_Entities> methods = paymentMethodRepository.findAll();
            return ResponseEntity.ok(methods);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payments_Methods_Entities> getPaymentMethodById(@PathVariable Long id) {
        Optional<Payments_Methods_Entities> method = paymentMethodRepository.findById(id);
        return method.map(ResponseEntity::ok)
                     .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Payments_Methods_Entities> createPaymentMethod(@RequestBody Payments_Methods_Entities method) {
        try {
            Payments_Methods_Entities savedMethod = paymentMethodRepository.save(method);
            return ResponseEntity.ok(savedMethod);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Payments_Methods_Entities> updatePaymentMethod(
            @PathVariable Long id,
            @RequestBody Payments_Methods_Entities method) {
        if (!paymentMethodRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        method.setId(id);
        Payments_Methods_Entities updatedMethod = paymentMethodRepository.save(method);
        return ResponseEntity.ok(updatedMethod);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaymentMethod(@PathVariable Long id) {
        if (!paymentMethodRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        try {
            paymentMethodRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}