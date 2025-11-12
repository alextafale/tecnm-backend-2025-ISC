package mx.tecnm.backend.api.entit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pedidos")
public class Orders_Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "fecha")
    private Date fecha;

    @Column(name  = "numero")
    private int numero;

    @Column(name = "importe_productos")
    private double importe_productos;

    @Column(name = "importe_envio")
    private double importe_envio;

    @Column(name = "usuarios_id")
    private Long usuarios_id;

    @Column(name = "metodos_pago_id")
    private Long metodos_pago_id;

    @Column(name = "fecha_hora_pago")
    private Date fecha_hora_pago;

    @Column(name = "importe_iva")
    private double importe_iva;

    @Column(name = "total")
    private double total;

    public Orders_Entities() {}

    public Orders_Entities(Long id, Date fecha, int numero, double importe_productos, double importe_envio,
            Long usuarios_id, Long metodos_pago_id, Date fecha_hora_pago, double importe_iva, double total) {
        this.id = id;
        this.fecha = fecha;
        this.numero = numero;
        this.importe_productos = importe_productos;
        this.importe_envio = importe_envio;
        this.usuarios_id = usuarios_id;
        this.metodos_pago_id = metodos_pago_id;
        this.fecha_hora_pago = fecha_hora_pago;
        this.importe_iva = importe_iva;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getImporte_productos() {
        return importe_productos;
    }

    public void setImporte_productos(double importe_productos) {
        this.importe_productos = importe_productos;
    }

    public double getImporte_envio() {
        return importe_envio;
    }

    public void setImporte_envio(double importe_envio) {
        this.importe_envio = importe_envio;
    }

    public Long getUsuarios_id() {
        return usuarios_id;
    }

    public void setUsuarios_id(Long usuarios_id) {
        this.usuarios_id = usuarios_id;
    }

    public Long getMetodos_pago_id() {
        return metodos_pago_id;
    }

    public void setMetodos_pago_id(Long metodos_pago_id) {
        this.metodos_pago_id = metodos_pago_id;
    }

    public Date getFecha_hora_pago() {
        return fecha_hora_pago;
    }

    public void setFecha_hora_pago(Date fecha_hora_pago) {
        this.fecha_hora_pago = fecha_hora_pago;
    }

    public double getImporte_iva() {
        return importe_iva;
    }

    public void setImporte_iva(double importe_iva) {
        this.importe_iva = importe_iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
