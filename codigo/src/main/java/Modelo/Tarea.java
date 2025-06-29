package Modelo;

// Importaciones para la persistencia de datos con JPA
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

/**
 * Clase que representa una Tarea dentro del sistema.
 * Es una entidad JPA que será almacenada en la base de datos.
 */
@Entity // Marca esta clase como una entidad de base de datos
public class Tarea {

    // Identificador único de la tarea (clave primaria)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremental
    private Long id;

    // Título de la tarea (no puede ser nulo)
    @Column(nullable = false)
    private String titulo;

    // Descripción de la tarea (hasta 500 caracteres)
    @Column(length = 500)
    private String descripcion;

    // Indica si la tarea ha sido completada o no (no puede ser nulo)
    @Column(nullable = false)
    private boolean completada;

    // Constructor vacío requerido por JPA
    public Tarea() {
    }

    // Constructor con todos los atributos menos el ID (porque es autogenerado)
    public Tarea(String titulo, String descripcion, boolean completada) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    // Métodos Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
