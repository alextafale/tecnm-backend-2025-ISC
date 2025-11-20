package mx.tecnm.backend.api.entit;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Entity
@Table(name = "envios", schema = "ecommerce")




public class Orders_Entities {
public enum EstadoEnvio {
    PENDIENTE,
    EN_TRANSITO,
    ENTREGADO,
    CANCELADO
}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_entrega")
    private Date fechaEntrega;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private EstadoEnvio estado;

    @Column(name = "numero_seguimiento")
    private String numeroSeguimiento;

    // Relación con domicilios
    @ManyToOne
    @JoinColumn(name = "domicilios_id", nullable = false)
    private Addresses_Entities domicilio;

    // Relación con pedidos
    @ManyToOne
    @JoinColumn(name = "pedidos_id", nullable = false)
    private Orders_Entities pedido;
}
