
[README.md](https://github.com/user-attachments/files/22737100/README.md)
# 🛒 E-Commerce Project — TechLink

![GitHub repo size](https://img.shields.io/github/repo-size/usuario/ecommerce)
![GitHub contributors](https://img.shields.io/github/contributors/usuario/ecommerce)
![GitHub last commit](https://img.shields.io/github/last-commit/usuario/ecommerce)
![GitHub issues](https://img.shields.io/github/issues/usuario/ecommerce)
![License](https://img.shields.io/github/license/usuario/ecommerce)

## 🧩 Descripción del Proyecto
**TechLink E-Commerce** es una aplicación web desarrollada en **Java Spring Boot** con **Thymeleaf**, que permite la compra y venta de productos tecnológicos.  
El proyecto implementa un flujo completo de usuario: registro, autenticación, gestión de productos, carrito de compras y panel de administración.

---

## 🚀 Tecnologías Utilizadas
| Categoría | Tecnologías |
|------------|--------------|
| Backend | Java 17, Spring Boot, Spring Security, JPA (Hibernate) |
| Frontend | HTML5, CSS3, Bootstrap, Thymeleaf |
| Base de Datos | MySQL 8.3 |
| Herramientas | Maven, Git, IntelliJ IDEA |
| Servidor | Tomcat embebido |

---

## ⚙️ Características Principales
✅ Autenticación y registro de usuarios (Spring Security + BCrypt)  
✅ Roles de usuario (Administrador / Cliente)  
✅ CRUD completo de productos  
✅ Carrito de compras persistente  
✅ Gestión de pedidos y facturación  
✅ Diseño responsive con Bootstrap  
✅ Integración con base de datos MySQL  
✅ Arquitectura MVC  

---

## 🗂️ Estructura del Proyecto
```
📦 ecommerce
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java/com/proyecto/ecommerce
 ┃ ┃ ┃ ┣ 📂 controller
 ┃ ┃ ┃ ┣ 📂 model
 ┃ ┃ ┃ ┣ 📂 repository
 ┃ ┃ ┃ ┣ 📂 service
 ┃ ┃ ┃ ┗ 📂 security
 ┃ ┃ ┣ 📂 resources
 ┃ ┃ ┃ ┣ 📂 static (css, js, images)
 ┃ ┃ ┃ ┣ 📂 templates (Thymeleaf HTML)
 ┃ ┃ ┃ ┗ 📄 application.properties
 ┃ ┣ 📂 test
 ┃ ┗ 📄 pom.xml
 ┣ 📄 README.md
 ┗ 📄 .gitignore
```

---

## 🧠 Instalación y Configuración
### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/gsalazare/ecommerce.git
cd ecommerce
```

### 2️⃣ Configurar la base de datos MySQL
```sql
CREATE DATABASE ecommerce;
```

Actualizar el archivo `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3️⃣ Compilar y ejecutar
```bash
mvn clean install
mvn spring-boot:run
```

Luego accede desde tu navegador a:
```
http://localhost:8080
```

---

## 🤝 Contribuir
1. Haz un **fork** del repositorio  
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`)  
3. Realiza tus cambios y haz un commit (`git commit -m 'Agrega nueva funcionalidad'`)  
4. Haz push (`git push origin feature/nueva-funcionalidad`)  
5. Crea un **Pull Request**

---

## 🧾 Licencia
Este proyecto está bajo la licencia **MIT**.  
Puedes usarlo, modificarlo y distribuirlo libremente, siempre que se otorgue el crédito correspondiente.

---

## 👨‍💻 Autor
**Gianfranco Salazar Espino**  
📧 gsalazare92@gmail.com  
🌐 www.linkedin.com/in/gsalazare  
💼 Proyecto creado como parte del portafolio de desarrollo backend.
