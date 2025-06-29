# Evidencia GA7-220501096-AA3-EV01

## 🧩 Nombre oficial

**Codificación de módulos del software Stand-alone, web y móvil de acuerdo al proyecto a desarrollar**

---

## 📌 Descripción de la evidencia

Esta evidencia corresponde al desarrollo del módulo funcional del sistema **TareAppSpring**, utilizando el framework **Spring Boot** bajo arquitectura por capas. 

El objetivo principal fue **codificar los componentes del proyecto**, implementando una API RESTful que permite la gestión de tareas desde el backend, sin necesidad de interfaz gráfica.

---

## ⚙️ Funcionalidad incluida

- Crear tareas nuevas (POST)
- Ver todas las tareas (GET)
- Editar una tarea por su ID (PUT)
- Eliminar una tarea (DELETE)

El módulo está organizado en:

- `Modelo`: entidad `Tarea.java`
- `Repositorio`: interfaz `Repositorio.java` (Spring Data JPA)
- `Controlador`: clase REST `Controlador.java`
- `Servicio`: interfaz + clase de implementación para la lógica de negocio

---

## 💡 Consideraciones técnicas

El desarrollo se realizó utilizando el lenguaje **Java 17**, el framework **Spring Boot**, y conexión a base de datos **MySQL**. Las pruebas de los endpoints se ejecutaron con **Postman** y la configuración del entorno está contenida en el archivo `application.properties`.

La estructura general del código se encuentra en la carpeta:

TareAppSpring/codigo/


---

## 📦 Entrega

- ✅ El código fuente funcional está completo y estructurado.
- ✅ El repositorio incluye control de versiones con Git.
- ❌ No se requiere documento en PDF para esta evidencia, solo la codificación funcional.

---

## 👤 Autora

**Michelle Rojas**  
Formación: Análisis y Desarrollo de Software – SENA  
Evidencia realizada con enfoque en **Java + Spring Boot**

---

## ✅ Justificación del enfoque

Aunque no se usaron algunas herramientas indicadas inicialmente (como IDEs o editores específicos), se aplicaron conceptos fundamentales del desarrollo backend con Java, arquitectura modular y uso de frameworks robustos como Spring Boot.

La solución cumple con los objetivos del componente formativo y demuestra competencias técnicas en codificación, persistencia, pruebas e integración.

