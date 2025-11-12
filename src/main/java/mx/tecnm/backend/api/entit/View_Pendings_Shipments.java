package mx.tecnm.backend.api.entit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vista_envios_pendientes")
public class View_Pendings_Shipments{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seguimiento_formateado")
    private String seguimiento_formateado;

    @Column(name = "cliente")
    private String cliente;

    @Column(name = "email")
    private String email;
    
    @Column(name  = "direccion_completa")
    private String direccion_completa;

    @Column(name = "valor_pedido")
    private double valor_pedido;

    @Column(name = "dias_pendiente")
    private int dias_pendiente;

    public View_Pendings_Shipments() {}

    public View_Pendings_Shipments(Long id, String seguimiento_formateado, String cliente, String email,
            String direccion_completa, double valor_pedido, int dias_pendiente) {
        this.id = id;
        this.seguimiento_formateado = seguimiento_formateado;
        this.cliente = cliente;
        this.email = email;
        this.direccion_completa = direccion_completa;
        this.valor_pedido = valor_pedido;
        this.dias_pendiente = dias_pendiente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeguimiento_formateado() {
        return seguimiento_formateado;
    }

    public void setSeguimiento_formateado(String seguimiento_formateado) {
        this.seguimiento_formateado = seguimiento_formateado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion_completa() {
        return direccion_completa;
    }

    public void setDireccion_completa(String direccion_completa) {
        this.direccion_completa = direccion_completa;
    }

    public double getValor_pedido() {
        return valor_pedido;
    }

    public void setValor_pedido(double valor_pedido) {
        this.valor_pedido = valor_pedido;
    }

    public int getDias_pendiente() {
        return dias_pendiente;
    }

    public void setDias_pendiente(int dias_pendiente) {
        this.dias_pendiente = dias_pendiente;
    }
}
