package mx.tecnm.backend.api.entit;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email", unique = true) 
    private String email;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE) 
    private Date fecha_nacimiento;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP) 
    private Date fecha_registro; 

    // Constructors
    public Users() {}

    public Users(String nombre, String email, String telefono, String sexo, 
                 Date fecha_nacimiento, String contrasena, Date fecha_registro) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contrasena = contrasena;
        this.fecha_registro = fecha_registro;
    }

    // Getters and Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", sexo='" + sexo + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", fecha_registro=" + fecha_registro +
                '}';
    }
}
