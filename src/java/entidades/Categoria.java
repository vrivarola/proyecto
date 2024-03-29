package entidades;
// Generated 14/07/2014 03:02:32 AM by Hibernate Tools 3.6.0


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categoria generated by hbm2java
 */
@Entity
@Table(name="categoria"
    ,schema="public"
)
public class Categoria  implements java.io.Serializable {


     private int idCat;
     private String descriCat;
     private List<Libro> libros = new ArrayList();

    public Categoria() {
    }

	
    public Categoria(int idCat) {
        this.idCat = idCat;
    }
    public Categoria(int idCat, String descriCat, List<Libro> libros) {
       this.idCat = idCat;
       this.descriCat = descriCat;
       this.libros = libros;
    }
   
     @Id 

    @GeneratedValue
    @Column(name="id_cat", unique=true, nullable=false)
    public int getIdCat() {
        return this.idCat;
    }
    
    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    
    @Column(name="descri_cat", length=50)
    public String getDescriCat() {
        return this.descriCat;
    }
    
    public void setDescriCat(String descriCat) {
        this.descriCat = descriCat;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="categoria")
    public List<Libro> getLibros() {
        return this.libros;
    }
    
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }




}


