package entidades;
// Generated 14/07/2014 03:02:32 AM by Hibernate Tools 3.6.0


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,schema="public"
)
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private Tarjeta tarjeta;
     private Pais pais;
     private String loginName;
     private String nombreUsu;
     private String apellidoUsu;
     private String passUsu;
     private String direcUsu;
     private String emailUsu;
     private Boolean esSuperUsu;
     private Byte[] fotoUsu;
     private List<Comentario> comentarios = new ArrayList();
     private List<VentaCab> ventaCabs = new ArrayList();

    public Usuario() {
    }

	
    public Usuario(int idUsuario, Pais pais) {
        this.idUsuario = idUsuario;
        this.pais = pais;
    }
    public Usuario(int idUsuario, Tarjeta tarjeta, Pais pais, String loginName, String nombreUsu, String apellidoUsu, String passUsu, String direcUsu, String emailUsu, Boolean esSuperUsu, Byte[] fotoUsu, ArrayList<Comentario> comentarios, ArrayList<VentaCab> ventaCabs) {
       this.idUsuario = idUsuario;
       this.tarjeta = tarjeta;
       this.pais = pais;
       this.loginName = loginName;
       this.nombreUsu = nombreUsu;
       this.apellidoUsu = apellidoUsu;
       this.passUsu = passUsu;
       this.direcUsu = direcUsu;
       this.emailUsu = emailUsu;
       this.esSuperUsu = esSuperUsu;
       this.fotoUsu = fotoUsu;
       this.comentarios = comentarios;
       this.ventaCabs = ventaCabs;
    }
   
     @Id 

    @GeneratedValue
    @Column(name="id_usuario", unique=true, nullable=false)
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_tarj")
    public Tarjeta getTarjeta() {
        return this.tarjeta;
    }
    
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_pais", nullable=false)
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    
    @Column(name="login_name", length=15)
    public String getLoginName() {
        return this.loginName;
    }
    
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    
    @Column(name="nombre_usu", length=25)
    public String getNombreUsu() {
        return this.nombreUsu;
    }
    
    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    
    @Column(name="apellido_usu", length=25)
    public String getApellidoUsu() {
        return this.apellidoUsu;
    }
    
    public void setApellidoUsu(String apellidoUsu) {
        this.apellidoUsu = apellidoUsu;
    }

    
    @Column(name="pass_usu", length=15)
    public String getPassUsu() {
        return this.passUsu;
    }
    
    public void setPassUsu(String passUsu) {
        this.passUsu = passUsu;
    }

    
    @Column(name="direc_usu", length=50)
    public String getDirecUsu() {
        return this.direcUsu;
    }
    
    public void setDirecUsu(String direcUsu) {
        this.direcUsu = direcUsu;
    }

    
    @Column(name="email_usu", length=30)
    public String getEmailUsu() {
        return this.emailUsu;
    }
    
    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    
    @Column(name="es_super_usu")
    public Boolean getEsSuperUsu() {
        return this.esSuperUsu;
    }
    
    public void setEsSuperUsu(Boolean esSuperUsu) {
        this.esSuperUsu = esSuperUsu;
    }

    
    @Column(name="foto_usu", length=254)
    public Byte[] getFotoUsu() {
        return this.fotoUsu;
    }
    
    public void setFotoUsu(Byte[] fotoUsu) {
        this.fotoUsu = fotoUsu;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public List<Comentario> getComentarios() {
        return this.comentarios;
    }
    
    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public List<VentaCab> getVentaCabs() {
        return this.ventaCabs;
    }
    
    public void setVentaCabs(ArrayList<VentaCab> ventaCabs) {
        this.ventaCabs = ventaCabs;
    }




}


