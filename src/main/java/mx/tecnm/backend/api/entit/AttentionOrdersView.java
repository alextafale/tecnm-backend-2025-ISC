package mx.tecnm.backend.api.entit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "vista_pedidos_atencion", schema = "ecommerce")
public class AttentionOrdersView{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name  = "usuarios_id")
    private Integer usuarios_id;

    @Column(name  = "importe_productos")
    private Double importe_productos;

    @Column(name = "importe_envio")
    private Double importe_envio;

    @Column(name = "fecha")
    private Date fecha;

public AttentionOrdersView() {

}
    public AttentionOrdersView(Long id, String numero, Integer usuarios_id, Double importe_productos,
            Double importe_envio, Date fecha) {
        this.id = id;
        this.numero = numero;
        this.usuarios_id = usuarios_id;
        this.importe_productos = importe_productos;
        this.importe_envio = importe_envio;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getUsuarios_id() {
        return usuarios_id;
    }

    public void setUsuarios_id(Integer usuarios_id) {
        this.usuarios_id = usuarios_id;
    }

    public Double getImporte_productos() {
        return importe_productos;
    }

    public void setImporte_productos(Double importe_productos) {
        this.importe_productos = importe_productos;
    }

    public Double getImporte_envio() {
        return importe_envio;
    }

    public void setImporte_envio(Double importe_envio) {
        this.importe_envio = importe_envio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    } 
}
