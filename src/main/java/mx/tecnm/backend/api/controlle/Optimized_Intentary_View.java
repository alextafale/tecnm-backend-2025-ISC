package mx.tecnm.backend.api.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Collections;

import mx.tecnm.backend.api.repositor.OptimizedIntentaryViewRepository;

@RestController
@RequestMapping("/api/vista_inventario_optimizado")
public class Optimized_Intentary_View {

    @Autowired
    private OptimizedIntentaryViewRepository optimizedIntentaryViewRepository;

    @GetMapping("/all")
    public ResponseEntity<List<?>> getAllOptimizedIntentaryViews() {
        try {
            List<?> views = optimizedIntentaryViewRepository.findAll();
            return ResponseEntity.ok(views);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Collections.emptyList());
        }
    }


}