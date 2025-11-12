package mx.tecnm.backend.api.controlle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import mx.tecnm.backend.api.entit.Categorias;
import mx.tecnm.backend.api.repositor.CategoryRepository;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/categorias")
public class Categories_Controller {
    
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello, World!";
    }


    @GetMapping("/all")
    public List<Categorias> getAllCategories() {
        return categoryRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categorias> getCategoryById(@PathVariable Long id) {
        Optional<Categorias> category = categoryRepository.findById(id);
        return category.map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Categorias createCategory(@RequestBody Categorias category) {
        return categoryRepository.save(category);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categorias> updateCategory(@PathVariable Long id, @RequestBody Categorias categoryDetails) {
        Optional<Categorias> optionalCategory = categoryRepository.findById(id);
        
        if (optionalCategory.isPresent()) {
            Categorias category = optionalCategory.get();
            category.setNombre(categoryDetails.getNombre());
            
            Categorias updatedCategory = categoryRepository.save(category);
            return ResponseEntity.ok(updatedCategory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}