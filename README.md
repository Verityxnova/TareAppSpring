# TareAppSpring

Aplicación web desarrollada con **Spring Boot** como parte de la evidencia **GA8-220501096-AA1-EV01** del componente formativo **“Desarrollar software a partir de la integración de sus módulos componentes”** del programa de formación en Análisis y Desarrollo de Software.

---

## 📌 Descripción

**TareAppSpring** es una aplicación web funcional que permite gestionar tareas mediante operaciones CRUD a través de una interfaz visual. Incluye un módulo de autenticación de usuarios, vistas dinámicas con Thymeleaf, persistencia con JPA, y conexión a base de datos MySQL.

---

## 🎯 Funcionalidades implementadas

- Iniciar sesión con usuario y contraseña
- Visualizar lista de tareas registradas
- Agregar nuevas tareas desde la vista
- Editar tareas existentes
- Eliminar tareas registradas
- Cerrar sesión de forma segura

---

## 🛠️ Tecnologías utilizadas

| Tecnología      | Descripción                           |
|-----------------|----------------------------------------|
| Java 17         | Lenguaje principal                     |
| Spring Boot 3.x | Framework backend                      |
| Spring Data JPA | Acceso a datos con Hibernate           |
| Thymeleaf       | Motor de plantillas HTML               |
| MySQL           | Base de datos relacional               |
| Maven           | Gestión de dependencias                |
| Bootstrap 5     | Estilos de interfaz (front-end)        |
| Git y GitHub    | Control de versiones y repositorio     |
| Postman         | Pruebas de servicios REST (si aplica)  |

---

## 📂 Estructura del proyecto

TareAppSpring/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── Modelo/ # Clases Usuario y Tarea
│ │ │ ├── TareaRepositorio/ # Repositorios JPA
│ │ │ └── TareaControlador/ # Controlador Login + CRUD
│ │ └── resources/
│ │ ├── templates/ # Vistas HTML (login, vista tareas, editar)
│ │ └── application.properties
├── pom.xml
└── README.md


---

## ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio:

git clone https://github.com/Verityxnova/TareAppSpring


2. Crear la base de datos en MySQL:

CREATE DATABASE tareapp_db;


3. Insertar un usuario manualmente para autenticación:

INSERT INTO usuario (nombre, username, password) VALUES ('Michelle', 'michelle', '1234');


4. Verificar credenciales en application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/tareapp_db
spring.datasource.username=root
spring.datasource.password=tu_contraseña


5. Ejecutar TareAppSpringApplication.java desde tu IDE.

6. Acceder desde navegador:

http://localhost:8090


🧪 Pruebas realizadas:
Validación de inicio de sesión correcto y fallido
Visualización de tareas cargadas desde la base de datos
Prueba de registro, edición y eliminación de tareas
Redirección y cierre de sesión

📄 Evidencia y entrega
Esta aplicación corresponde a la evidencia:
GA8-220501096-AA1-EV01
“Desarrollar software a partir de la integración de sus módulos componentes”

Incluye:
Código fuente completo (/src, pom.xml, README.md)
Documento técnico con introducción, casos de uso, historias de usuario, diagramas UML y pruebas
Control de versiones en GitHub

✅ Justificación técnica
Aunque no se utilizaron todas las herramientas gráficas propuestas inicialmente, se cumplieron de forma completa los requerimientos técnicos de la evidencia, desarrollando una solución modular, funcional, documentada y basada en buenas prácticas.
El uso de Spring Boot, Thymeleaf, MySQL y control de sesiones demuestra la correcta integración de los módulos de software según el componente formativo.