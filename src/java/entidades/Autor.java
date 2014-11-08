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
 * Autor generated by hbm2java
 */
@Entity
@Table(name = "autor", schema = "public")
public class Autor implements java.io.Serializable {

    private int idAutor;
    private Pais pais;
    private String nombreAutor;
    private String descriAutor; //nombre del autor
    private Byte[] fotoAutor;
    private List<Libro> libros = new ArrayList();

    public Autor() {
    }

    public Autor(int idAutor, Pais pais) {
        this.idAutor = idAutor;
        this.pais = pais;
    }

    public Autor(int idAutor, Pais pais, String nombreAutor, String descriAutor, Byte[] fotoAutor, List<Libro> libros) {
        this.idAutor = idAutor;
        this.pais = pais;
        this.nombreAutor = nombreAutor;
        this.descriAutor = descriAutor;
        this.fotoAutor = fotoAutor;
        this.libros = libros;
    }

    public Autor(int idAutor, String nombreAutor, String descriAutor, Byte[] fotoAutor) {
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
        this.descriAutor = descriAutor;
        this.fotoAutor = fotoAutor;
    }

    @Id
    @GeneratedValue
    @Column(name = "id_autor", unique = true, nullable = false)
    public int getIdAutor() {
        return this.idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pais", nullable = true)
    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Column(name = "nombre_autor", length = 25)
    public String getNombreAutor() {
        return this.nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    @Column(name = "descri_autor", length = 50)
    public String getDescriAutor() {
        return this.descriAutor;
    }

    public void setDescriAutor(String descriAutor) {
        this.descriAutor = descriAutor;
    }

    @Column(name = "foto_autor", length = 254)
    public Byte[] getFotoAutor() {
        return this.fotoAutor;
    }

    public void setFotoAutor(Byte[] fotoAutor) {
        this.fotoAutor = fotoAutor;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "autor")
    public List<Libro> getLibros() {
        return this.libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}