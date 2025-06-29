package TareaControlador;

import Modelo.Usuario;
import Modelo.Tarea;
import TareaRepositorio.UsuarioRepository;
import TareaRepositorio.Repositorio;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private Repositorio tareaRepositorio;

    // Página principal: login
    @GetMapping("/")
    public String mostrarLogin() {
        return "login";
    }

    // Procesar login
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session) {
        Usuario usuario = usuarioRepository.findByUsernameAndPassword(username, password);
        if (usuario != null) {
            session.setAttribute("usuarioLogueado", usuario);
            return "redirect:/tareas-vista";
        } else {
            return "redirect:/?error=true";
        }
    }

    // Mostrar lista de tareas y formulario
    @GetMapping("/tareas-vista")
    public String mostrarVistaTareas(HttpSession session, Model model) {
        if (session.getAttribute("usuarioLogueado") == null) {
            return "redirect:/";
        }

        List<Tarea> listaTareas = tareaRepositorio.findAll();
        model.addAttribute("listaTareas", listaTareas);
        return "tareas-vista";
    }

    // Crear nueva tarea desde formulario
    @PostMapping("/tareas-vista")
    public String crearTarea(@RequestParam String titulo,
                             @RequestParam String descripcion,
                             @RequestParam boolean completada,
                             HttpSession session) {
        if (session.getAttribute("usuarioLogueado") == null) {
            return "redirect:/";
        }

        Tarea nueva = new Tarea();
        nueva.setTitulo(titulo);
        nueva.setDescripcion(descripcion);
        nueva.setCompletada(completada);
        tareaRepositorio.save(nueva);

        return "redirect:/tareas-vista";
    }

    // Mostrar formulario para editar tarea
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicion(@PathVariable Long id, Model model, HttpSession session) {
        if (session.getAttribute("usuarioLogueado") == null) {
            return "redirect:/";
        }

        Tarea tarea = tareaRepositorio.findById(id).orElse(null);
        model.addAttribute("tarea", tarea);
        return "editar-tarea";
    }

    // Procesar edición de tarea
    @PostMapping("/editar")
    public String editarTarea(@RequestParam Long id,
                              @RequestParam String titulo,
                              @RequestParam String descripcion,
                              @RequestParam boolean completada,
                              HttpSession session) {
        if (session.getAttribute("usuarioLogueado") == null) {
            return "redirect:/";
        }

        Tarea tarea = tareaRepositorio.findById(id).orElse(null);
        if (tarea != null) {
            tarea.setTitulo(titulo);
            tarea.setDescripcion(descripcion);
            tarea.setCompletada(completada);
            tareaRepositorio.save(tarea);
        }

        return "redirect:/tareas-vista";
    }

    // Eliminar tarea
    @GetMapping("/eliminar/{id}")
    public String eliminarTarea(@PathVariable Long id, HttpSession session) {
        if (session.getAttribute("usuarioLogueado") == null) {
            return "redirect:/";
        }

        tareaRepositorio.deleteById(id);
        return "redirect:/tareas-vista";
    }

    // Cerrar sesión
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
