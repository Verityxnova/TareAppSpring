package TareaRepositorio;

import Modelo.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfaz que maneja la persistencia de objetos Tarea.
 * Hereda de JpaRepository para aprovechar los métodos CRUD de Spring Data JPA.
 */
@Repository
public interface Repositorio extends JpaRepository<Tarea, Long> {
    // Se pueden agregar métodos personalizados si se necesita, como por ejemplo:
    // List<Tarea> findByCompletadaTrue();
}
