package mx.tecnm.backend.api.entit;

import jakarta.persistence.*;

@Entity
@Table(name = "domicilios" , schema = "ecommerce")
public class Addresses_Entities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @Column(name = "colonia")
    private String colonia;

    @Column(name = "cp")
    private int cp;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "usuarios_id", nullable = false)
    private Users usuario;

    public Addresses_Entities() {}

    public Addresses_Entities(Long id, String calle, int numero, String colonia, int cp,
                              String ciudad, String estado, Users usuario) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Users getUsuario() {
        return usuario;
    }

    public void setUsuario(Users usuario) {
        this.usuario = usuario;
    }
}
