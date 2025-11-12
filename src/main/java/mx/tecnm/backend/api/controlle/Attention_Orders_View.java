package mx.tecnm.backend.api.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Optional;

import mx.tecnm.backend.api.repositor.AttentionOrdersViewRepository;
import mx.tecnm.backend.api.entit.AttentionOrdersView;

@RestController
@RequestMapping("/api/ordenes_atencion")
public class Attention_Orders_View {

    @Autowired
    private AttentionOrdersViewRepository attentionOrdersViewRepository;

    @GetMapping("/all")
    public ResponseEntity<List<AttentionOrdersView>> getAllAttentionOrdersViews() {
        try {
            List<AttentionOrdersView> views = attentionOrdersViewRepository.findAll();
            return ResponseEntity.ok(views);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<AttentionOrdersView> getAttentionOrderViewById(@PathVariable Long id) {
        Optional<AttentionOrdersView> view = attentionOrdersViewRepository.findById(id);
        return view.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }
}