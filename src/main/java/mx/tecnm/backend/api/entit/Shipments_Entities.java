package mx.tecnm.backend.api.entit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "envios", schema = "ecommerce")
public class Shipments_Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_entrega")
    private Date fecha_entrega;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "estado")
    private String estado;

    @Column(name = "numero_seguimiento")
    private String numero_seguimiento;

    @Column(name = "pedidos_id")
    private Long pedidos_id;

    @Column(name = "domicilios_id")
    private Long domicilios_id;

    public Shipments_Entities() {}

    public Shipments_Entities(Long id, Date fecha_entrega, Date fecha, String estado, String numero_seguimiento,
            Long pedidos_id, Long domicilios_id) {
        this.id = id;
        this.fecha_entrega = fecha_entrega;
        this.fecha = fecha;
        this.estado = estado;
        this.numero_seguimiento = numero_seguimiento;
        this.pedidos_id = pedidos_id;
        this.domicilios_id = domicilios_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero_seguimiento() {
        return numero_seguimiento;
    }

    public void setNumero_seguimiento(String numero_seguimiento) {
        this.numero_seguimiento = numero_seguimiento;
    }

    public Long getPedidos_id() {
        return pedidos_id;
    }

    public void setPedidos_id(Long pedidos_id) {
        this.pedidos_id = pedidos_id;
    }

    public Long getDomicilios_id() {
        return domicilios_id;
    }

    public void setDomicilios_id(Long domicilios_id) {
        this.domicilios_id = domicilios_id;
    }
}
