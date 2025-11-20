package mx.tecnm.backend.api.entit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //Genera los getters y setters automaticamente
@AllArgsConstructor //Genera el constructor con todos los argumentos
@Entity
@Table(name = "detalles_carrito", schema = "ecommerce")
public class Cart_Details_Entities {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "productos_id")
    private Long productos_id;

    @Column(name = "precio")
    private double precio;

    @Column(name = "usuarios_id")
    private Long usuarios_id;

    public Cart_Details_Entities() {
    }
}


