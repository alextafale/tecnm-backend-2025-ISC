package mx.tecnm.backend.api.entit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vista_inventario_optimizado", schema = "ecommerce")
public class Optimized_Inventary_View{

    @Id
    @GeneratedValue  (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "total_productos")
    private int total_productos;

    @Column(name = "precio_promedio")
    private double precio_promedio;

    public Optimized_Inventary_View() {}

    public Optimized_Inventary_View(String categoria, int total_productos, double precio_promedio) {
        this.categoria = categoria;
        this.total_productos = total_productos;
        this.precio_promedio = precio_promedio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTotal_productos() {
        return total_productos;
    }

    public void setTotal_productos(int total_productos) {
        this.total_productos = total_productos;
    }

    public double getPrecio_promedio() {
        return precio_promedio;
    }

    public void setPrecio_promedio(double precio_promedio) {
        this.precio_promedio = precio_promedio;
    }
}
