package mx.tecnm.backend.api.entit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalles_pedido", schema = "ecommerce")
public class Order_Details_Entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precio")
    private double precio;

    @Column(name = "productos_id")
    private Long productos_id;

    @Column(name = "pedidos_id")
    private Long pedidos_id;

    public Order_Details_Entities() {
    }

    public Order_Details_Entities(Long id, int cantidad, double precio, Long productos_id, Long pedidos_id) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.productos_id = productos_id;
        this.pedidos_id = pedidos_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Long getProductos_id() {
        return productos_id;
    }

    public void setProductos_id(Long productos_id) {
        this.productos_id = productos_id;
    }

    public Long getPedidos_id() {
        return pedidos_id;
    }

    public void setPedidos_id(Long pedidos_id) {
        this.pedidos_id = pedidos_id;
    }
}
