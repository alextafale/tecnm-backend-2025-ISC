package mx.tecnm.backend.api.entit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vista_productos_premium", schema = "ecommerce")
public class vista_productos_premium{
    

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "nombre_categoria")
    private String nombre_categoria;

    @Column(name = "marca")
    private String marca;

    public vista_productos_premium() {}

    public vista_productos_premium(String nombre, Double precio, String nombre_categoria, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.nombre_categoria = nombre_categoria;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
