package entidades;
// Generated 14/07/2014 03:02:32 AM by Hibernate Tools 3.6.0


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tarjeta generated by hbm2java
 */
@Entity
@Table(name="tarjeta"
    ,schema="public"
)
public class Tarjeta  implements java.io.Serializable {


     private int idTarj;
     private String numeroTarj;
     private String codigo;
     private String tipo;
     private Double saldo;
     private List<Usuario> usuarios = new ArrayList();

    public Tarjeta() {
    }

	
    public Tarjeta(int idTarj) {
        this.idTarj = idTarj;
    }
    public Tarjeta(int idTarj, String numeroTarj, String codigo, String tipo, Double saldo, ArrayList usuarios) {
       this.idTarj = idTarj;
       this.numeroTarj = numeroTarj;
       this.codigo = codigo;
       this.tipo = tipo;
       this.saldo = saldo;
       this.usuarios = usuarios;
    }
   
     @Id 

    @GeneratedValue
    @Column(name="id_tarj", unique=true, nullable=false)
    public int getIdTarj() {
        return this.idTarj;
    }
    
    public void setIdTarj(int idTarj) {
        this.idTarj = idTarj;
    }

    
    @Column(name="numero_tarj", length=20)
    public String getNumeroTarj() {
        return this.numeroTarj;
    }
    
    public void setNumeroTarj(String numeroTarj) {
        this.numeroTarj = numeroTarj;
    }

    
    @Column(name="codigo", length=10)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @Column(name="tipo", length=20)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Column(name="saldo", precision=17, scale=17)
    public Double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tarjeta")
    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}


