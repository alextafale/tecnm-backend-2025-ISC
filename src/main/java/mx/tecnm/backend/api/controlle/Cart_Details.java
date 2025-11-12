package mx.tecnm.backend.api.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tecnm.backend.api.entit.Cart_Details_Entities;
import mx.tecnm.backend.api.repositor.CartDetailRepository;
import java.util.List;
import java.util.Collections;

@RestController
@RequestMapping("/api/detalles_carrito")
public class Cart_Details {

    @Autowired
    private CartDetailRepository cartDetailRepository;

    @GetMapping()
    public ResponseEntity<List<Cart_Details_Entities>> getAllCartDetails() {

        return ResponseEntity.ok(cartDetailRepository.findAll());
    }
}