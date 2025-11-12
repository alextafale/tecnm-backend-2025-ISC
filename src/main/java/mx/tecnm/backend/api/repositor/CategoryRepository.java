package mx.tecnm.backend.api.repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.tecnm.backend.api.entit.Categorias;

@Repository
public interface CategoryRepository extends JpaRepository<Categorias, Long> {

}
