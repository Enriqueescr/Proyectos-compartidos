# Sistema de Gestión de Empleados

## 📌 Ejercicio: Sistema de Gestión de Empleados

### 📋 Objetivo
Crear un sistema para gestionar diferentes tipos de empleados en una empresa, teniendo en cuenta su salario, cargo y otros factores específicos.

---

## 📌 Requisitos

### 📌 Clase Abstracta `Empleado`
Debe incluir:
- **Atributos privados**: `nombre`, `edad`, `salarioBase`.
- **Constructor** para inicializar los valores (con validaciones de edad y salario).
- **Métodos getter/setter** para los atributos.
- **Método abstracto `calcularSalario()`** para que cada tipo de empleado lo implemente a su manera.
- **Método `mostrarInfo()`** que muestre los datos generales del empleado.

### 📌 Subclases de `Empleado`
- **`Gerente`**:
  - Atributo adicional `bono`.
  - Su salario total es `salarioBase + bono`.
- **`Desarrollador`**:
  - Atributo adicional `horasExtra`.
  - Su salario total es `salarioBase + (horasExtra * 20€)`.

### 📌 Interfaz `TrabajadorRemoto`
- Debe contener el método `conectarseRemotamente()`.

### 📌 Clase `DesarrolladorRemoto`
- Debe **heredar de `Desarrollador`** e **implementar `TrabajadorRemoto`**.

---

## 📌 Manejo de Excepciones
- Si la edad del empleado es **menor de 18 años**, lanzar una excepción `IllegalArgumentException`.
- Si el `salarioBase` es **menor a 1000€**, lanzar una excepción `IllegalArgumentException`.
- Si un `DesarrolladorRemoto` **intenta conectarse sin internet**, lanzar una excepción personalizada `ConexionException`.

---

## 🚀 Implementación en `main()`
1. Crear una **lista de empleados** con diferentes tipos (`Gerente`, `Desarrollador`, `DesarrolladorRemoto`).
2. Recorrer la lista y **mostrar la información de cada empleado**.

---

## 🛠 Tecnologías y Herramientas
- Lenguaje: **Java**
- Paradigma: **Programación Orientada a Objetos (POO)**

---

## 📜 Licencia
Este proyecto está bajo la licencia MIT.

---

## 📞 Contacto
Para dudas o mejoras, contáctame en [tu email o perfil de GitHub].

