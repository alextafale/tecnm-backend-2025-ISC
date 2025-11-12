package mx.tecnm.backend.api.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import java.util.List;

import mx.tecnm.backend.api.entit.Products_Entities;
import mx.tecnm.backend.api.repositor.ProductRepository;

@RestController
@RequestMapping("/api/productos")
public class Products {
    
    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello, World!";
    }
    

    @GetMapping
    public ResponseEntity<List<Products_Entities>> getAllProducts() {
        try {
            List<Products_Entities> products = productRepository.findAll();
            return ResponseEntity.ok(products);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Products_Entities> getProductById(@PathVariable Long id) {
        Optional<Products_Entities> producto = productRepository.findById(id);
        return producto.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Products_Entities> createProduct(@RequestBody Products_Entities product) {
        try {
            Products_Entities savedProduct = productRepository.save(product);
            return ResponseEntity.ok(savedProduct);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Products_Entities> updateProduct(
            @PathVariable Long id,
            @RequestBody Products_Entities product) {
        if (!productRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        product.setId(id);
        Products_Entities updatedProduct = productRepository.save(product);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        if (!productRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        try {
            productRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}