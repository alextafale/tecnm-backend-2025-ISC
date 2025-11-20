package mx.tecnm.backend.api.entit;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "productos", schema = "ecommerce")
public class Products_Entities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double precio;
    private String sku;
    private String color;
    private String marca;
    private String descripcion;
    private double peso;
    private double alto;
    private double ancho;
    private double profundidad;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categorias categoria;
}
