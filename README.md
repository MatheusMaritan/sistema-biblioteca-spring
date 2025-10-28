# 📚 Sistema de Biblioteca

Projeto desenvolvido em **Java** com **Spring Boot**, utilizando **Spring Data JPA** para persistência de dados, **Lombok** para reduzir boilerplate de código e **MySQL Workbench** como administrador de banco de dados.  
O sistema permite realizar as operações básicas de um CRUD (Criar, Ler, Atualizar e Deletar) sobre os livros de uma biblioteca.

---

## 🚀 Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Lombok**
- **MySQL Workbench**
- **Maven**

---

## 🗂️ Estrutura do Projeto

/src<br>
├── /model → Contém as classes de entidade (ex: Livro.java<br>
├── /repository → Interfaces responsáveis pela comunicação com o banco de dados<br>
├── /service → Regras de negócio e tratamento de lógica entre Controller e Repository<br>
├── /controller → Endpoints da API (CRUD)<br>
└── /dto → Classes auxiliares para transferir dados entre as camadas<br>

---

## 🧱 Banco de Dados

Banco utilizado: **MySQL 8.0+**  
Administrador: **MySQL Workbench**

### Criação do banco:
```sql
CREATE DATABASE biblioteca_db;
USE biblioteca_db;

CREATE TABLE livro (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    editora VARCHAR(100),
    ano_publicacao INT,
    categoria VARCHAR(100)
);
```

---

## ⚙️ Configuração do application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca_db<br>
spring.datasource.username=SEU_USUARIO<br>
spring.datasource.password=SUA_SENHA<br>
spring.jpa.hibernate.ddl-auto=update<br>
spring.jpa.show-sql=true<br>

---

## 🧪 Testando a API

http://localhost:8080

Endpoints principais:

| Método | Endpoint       | Descrição                    |
|--------|----------------|------------------------------|
| GET    | /livros        | Lista todos os livros        |
| GET    | /livros/{id}   | Busca um livro pelo ID       |
| POST   | /livros        | Cadastra um novo livro       |
| PUT    | /livros/{id}   | Atualiza um livro existente  |
| DELETE | /livros/{id}   | Remove um livro              |

---

## 💡 Autor

Desenvolvido por: *Matheus Maritan*.<br>
💼 Estudante de Análise e Desenvolvimento de Sistemas.<br>
📧 Contato: [maritanmatheus@gmail.com]
