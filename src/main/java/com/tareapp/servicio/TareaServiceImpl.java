package com.tareapp.servicio;

import Modelo.Tarea;
import TareaRepositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementación de la interfaz TareaService.
 * Contiene la lógica de negocio para gestionar las tareas.
 */
@Service
public class TareaServiceImpl implements TareaService {

    @Autowired
    private Repositorio repositorio;

    /**
     * Obtiene todas las tareas desde el repositorio.
     * 
     * @return Lista de tareas
     */
    @Override
    public List<Tarea> obtenerTodas() {
        return repositorio.findAll();
    }

    /**
     * Guarda o actualiza una tarea en el repositorio.
     * 
     * @param tarea Objeto Tarea a guardar
     * @return La tarea guardada
     */
    @Override
    public Tarea guardar(Tarea tarea) {
        return repositorio.save(tarea);
    }

    /**
     * Elimina una tarea del repositorio por su ID.
     * 
     * @param id Identificador de la tarea a eliminar
     */
    @Override
    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}
