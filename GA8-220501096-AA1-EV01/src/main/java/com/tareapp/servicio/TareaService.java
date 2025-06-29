package com.tareapp.servicio;

import Modelo.Tarea;
import java.util.List;

/**
 * Interfaz que define los métodos del servicio para gestionar tareas.
 * Separa la lógica de negocio de la capa de acceso a datos.
 */
public interface TareaService {

    /**
     * Obtiene la lista completa de tareas.
     * 
     * @return Lista de objetos Tarea
     */
    List<Tarea> obtenerTodas();

    /**
     * Guarda una nueva tarea o actualiza una existente.
     * 
     * @param tarea Objeto Tarea a guardar
     * @return La tarea guardada con ID generado (si es nueva)
     */
    Tarea guardar(Tarea tarea);

    /**
     * Elimina una tarea por su ID.
     * 
     * @param id Identificador de la tarea a eliminar
     */
    void eliminar(Long id);
}
