package mx.tecnm.backend.api.repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.tecnm.backend.api.entit.ProductsPremiumView;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductsPremiumViewRepository extends JpaRepository<ProductsPremiumView, Long> {
    
}
