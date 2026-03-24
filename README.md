# 🛒 Sistema de Mercado - CRUD com Spring Boot

📌 Descrição

Este projeto é uma API REST desenvolvida com Java + Spring Boot, utilizando arquitetura MVC, com autenticação baseada em JWT (JSON Web Token) e persistência de dados em PostgreSQL.

O sistema simula um mercado online, onde:

- Administradores gerenciam produtos (CRUD completo).
- Clientes podem se cadastrar, autenticar, visualizar produtos e realizar compras.

---
# 🚀 Tecnologias Utilizadas

- Java 25
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- JWT (JSON Web Token)
- PostgreSQL
- Maven

---


# 🏗️ Arquitetura

O projeto segue o padrão MVC (Model-View-Controller):

```text
src/
 ├── controller   → Camada de entrada (requisições HTTP)
 ├── service      → Regras de negócio
 ├── repository   → Acesso ao banco de dados
 ├── model        → Entidades (JPA)
 ├── dto          → Transferência de dados
 └── security     → Configurações de segurança e JWTsrc/
 ├── controller   → Camada de entrada (requisições HTTP)
 ├── service      → Regras de negócio
 ├── repository   → Acesso ao banco de dados
 ├── model        → Entidades (JPA)
 ├── dto          → Transferência de dados
 ├── security     → Configurações de segurança e JWT
```
---

# 🔐 Autenticação e Autorização

A autenticação é feita via JWT, onde:

- O usuário realiza login e recebe um token
- O token deve ser enviado no header:

Authorization: Bearer <token>

Perfis de Usuário:

- "ADMIN" → Pode cadastrar, listar e remover produtos
- "CLIENT" → Pode visualizar produtos e realizar compras

---

# 📦 Funcionalidades

👤 Cliente

- Cadastro de usuário
- Login
- Listagem de produtos
- Escolha/compra de produtos

🛠️ Administrador

- Cadastro de produtos
- Listagem de produtos
- Exclusão de produtos

---

# 🗄️ Banco de Dados

O sistema utiliza PostgreSQL.

Configuração (application.properties):
```text
spring.datasource.url=jdbc:postgresql://localhost:5432/mercado_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
---

# 🔒 Segurança

- Senhas criptografadas com BCrypt
- Autenticação stateless com JWT
- Filtros de segurança com Spring Security


---

# 👨‍💻 Autor
- Lucas Vieira
- Mateus Cipriano
- Desenvolvido para fins de estudo em Spring Boot + Segurança com JWT + Arquitetura MVC.

---

# 📜 Licença

Este projeto é de uso educacional.
