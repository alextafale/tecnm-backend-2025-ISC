package mx.tecnm.backend.api.entit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vista_productos_gestion")
public class vista_productos_gestion{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name  = "precio")
    private Double precio;

    @Column(name  = "peso")
    private Double peso;

    @Column(name = "sku")
    private String sku;

    @Column(name  = "marca")
    private String marca;

    @Column(name = "categorias_id")
    private int categorias_id;

    public vista_productos_gestion() {}

    public vista_productos_gestion(Long id, String nombre, Double precio, Double peso, String sku, String marca,
            int categorias_id) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.sku = sku;
        this.marca = marca;
        this.categorias_id = categorias_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCategorias_id() {
        return categorias_id;
    }

    public void setCategorias_id(int categorias_id) {
        this.categorias_id = categorias_id;
    }
}
