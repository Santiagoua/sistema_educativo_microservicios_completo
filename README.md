# Sistema Educativo Distribuido - Microservicios

Este proyecto implementa un sistema educativo basado en microservicios usando **Spring Boot**, **Spring Cloud**, **MongoDB**, **JWT**, **Docker**, y otras herramientas modernas de desarrollo. Es parte de una evaluación académica final.

## 🧩 Microservicios

- `usuarios-servicio`: Gestión de usuarios (estudiantes, profesores).
- `asignaturas-servicio`: Administración de asignaturas.
- `matriculas-servicio`: Registro de matrículas entre usuarios y asignaturas.

## 🔄 Comunicación entre Microservicios

Se usa **Feign Client** para permitir que `matriculas-servicio` consulte:

- Datos de usuarios desde `usuarios-servicio`.
- Datos de asignaturas desde `asignaturas-servicio`.

## ⚙️ Configuración Centralizada

Se implementa un `config-server` conectado a un repositorio remoto en GitHub.  
Cada microservicio tiene su archivo `bootstrap.yml` para obtener configuración desde el servidor de configuración.

## 📡 Descubrimiento de Servicios

Se utiliza **Eureka Server** como registro de descubrimiento.  
Todos los microservicios se registran automáticamente.

## 🔐 Seguridad con JWT

- Registro e inicio de sesión mediante `/api/auth/`.
- Generación de token JWT.
- Endpoints protegidos por roles usando Spring Security.

## 🔍 Monitorización

Cada microservicio incluye **Spring Boot Actuator**:

- Endpoints habilitados: `/actuator/health`, `/actuator/info`, `/actuator/metrics`.

Se puede conectar a **Prometheus y Grafana** vía Docker Compose.

## ✅ Pruebas

- **Pruebas unitarias** con JUnit y Mockito (al menos 2 por microservicio).
- **Pruebas de integración** con WebTestClient.
- Verificadas también con Postman.

## 🔄 CI/CD con GitHub Actions

- Archivo `.github/workflows/test.yml` configurado.
- Ejecuta `mvn test` en cada push al repositorio.

## 🐳 Docker y Orquestación

- Dockerfile por cada microservicio.
- Archivo `docker-compose.yml` que levanta:

  - Los 3 microservicios.
  - MongoDB.
  - Eureka Server.
  - Config Server.
  - Prometheus y Grafana.
  - Gateway (opcional, si fue implementado).

## 🧪 Pruebas de ejemplo (Postman)

Ejemplo para registrar un usuario:

```http
POST http://localhost:8081/api/usuarios
Content-Type: application/json

{
  "nombre": "Carlos",
  "correo": "carlos@email.com"
}
Ejemplo para registrar una matrícula:

http
Copiar
Editar
POST http://localhost:8083/api/matriculas
Content-Type: application/json

{
  "usuarioId": "123",
  "asignaturaId": "456",
  "fecha": "2025-04-21"
}
🗂 Estructura general
pgsql
Copiar
Editar
sistema_educativo_microservicios/
├── usuarios-servicio/
├── asignaturas-servicio/
├── matriculas-servicio/
├── eureka-server/
├── config-server/
├── gateway-server/ (opcional)
├── .github/workflows/
├── docker-compose.yml
📌 Requisitos
JDK 17

Maven 3.8+

Docker y Docker Compose

MongoDB

Git

🚀 Ejecutar localmente
bash
Copiar
Editar
# Paso 1: Clona el proyecto
git clone https://github.com/tu-usuario/sistema_educativo_microservicios.git

# Paso 2: Ejecuta con Docker
docker-compose up --build
🧠 Autor
Proyecto académico desarrollado por Leon Santiago Urrego
Universidad / Curso: LENGUAJE DE PROGRAMACIÓN AVANZADO 2
