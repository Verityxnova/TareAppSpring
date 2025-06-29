package com.tareapp;

// Importaciones necesarias para la configuración del proyecto Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Clase principal que arranca la aplicación Spring Boot.
 * Configura el escaneo de componentes, entidades y repositorios.
 */
@SpringBootApplication
// Indica a Spring dónde buscar los componentes (@RestController, @Service, etc.)
@ComponentScan(basePackages = {"TareaControlador", "TareaRepositorio", "Modelo"})

// Indica a Spring Data JPA dónde buscar las interfaces repositorio
@EnableJpaRepositories(basePackages = {"TareaRepositorio"})

// Indica a Spring dónde buscar las clases anotadas con @Entity
@EntityScan(basePackages = {"Modelo"})
public class TareAppSpringApplication {

    /**
     * Método principal que arranca la aplicación.
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        SpringApplication.run(TareAppSpringApplication.class, args);
    }
}
