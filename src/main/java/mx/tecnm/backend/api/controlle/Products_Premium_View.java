package mx.tecnm.backend.api.controlle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Collections;
import mx.tecnm.backend.api.repositor.ProductsPremiumViewRepository;

@RestController
@RequestMapping("/api/productos_premium")
public class Products_Premium_View {

    @Autowired
    private ProductsPremiumViewRepository productsPremiumViewRepository;

    @GetMapping("/all")
    public ResponseEntity<List<?>> getAllProductsPremiumViews() {
        try {
            List<?> views = productsPremiumViewRepository.findAll();
            return ResponseEntity.ok(views);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Collections.emptyList());
        }
    }


}