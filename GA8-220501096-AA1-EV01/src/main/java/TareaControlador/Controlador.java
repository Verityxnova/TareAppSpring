// Paquete donde se encuentra la clase Controlador
package TareaControlador;

// Importación de la clase Tarea (modelo de datos)
import Modelo.Tarea;
// Importación de la interfaz Repositorio (acceso a la base de datos)
import TareaRepositorio.Repositorio;
// Importaciones necesarias para el uso de anotaciones y manejo de solicitudes HTTP
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Esta clase es un controlador REST que gestiona las solicitudes relacionadas con tareas
@RestController
@RequestMapping("/api/tareas") // Ruta base para todas las solicitudes
public class Controlador {

    // Inyección del repositorio de tareas para acceder a la base de datos
    @Autowired
    private Repositorio repositorio;

    // Método GET para obtener la lista completa de tareas
    @GetMapping
    public List<Tarea> obtenerTareas() {
        return repositorio.findAll(); // Retorna todas las tareas almacenadas
    }

    // Método POST para crear una nueva tarea
    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return repositorio.save(tarea); // Guarda la nueva tarea y la retorna
    }

    // Método PUT para actualizar una tarea existente según su ID
    @PutMapping("/{id}")
    public Tarea actualizarTarea(@PathVariable Long id, @RequestBody Tarea tareaActualizada) {
        // Busca la tarea por ID. Si existe, la actualiza; si no, lanza una excepción.
        return repositorio.findById(id)
                .map(tarea -> {
                    tarea.setTitulo(tareaActualizada.getTitulo());           // Actualiza el título
                    tarea.setDescripcion(tareaActualizada.getDescripcion()); // Actualiza la descripción
                    tarea.setCompletada(tareaActualizada.isCompletada());    // Actualiza el estado de completada
                    return repositorio.save(tarea); // Guarda los cambios
                })
                .orElseThrow(() -> new RuntimeException("Tarea no encontrada con ID: " + id));
    }

    // Método DELETE para eliminar una tarea según su ID
    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        repositorio.deleteById(id); // Elimina la tarea de la base de datos
    }
}
