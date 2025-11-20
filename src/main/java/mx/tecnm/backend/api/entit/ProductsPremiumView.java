package mx.tecnm.backend.api.entit;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "vista_productos_premium", schema = "ecommerce")
public class ProductsPremiumView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private String precio;

    @Column(name = "nombre_categoria")
    private String nombre_categoria;

    @Column(name = "marca")
    private String marca;

    public ProductsPremiumView() {
    }

}
