# 🔗 Encurtador de URL - Java + PostgreSQL

Projeto desenvolvido para praticar integração entre Java e banco de dados PostgreSQL utilizando JDBC e padrão DAO.

## 📚 Objetivo

Criar a estrutura base de um encurtador de URLs, aplicando:

- Organização em pacotes (model, dao, config)
- Conexão com banco de dados PostgreSQL
- Inserção de dados utilizando PreparedStatement
- Separação de responsabilidades com padrão DAO

## 🛠 Tecnologias utilizadas

- Java 17
- Maven
- PostgreSQL
- JDBC
- IntelliJ IDEA

## 📂 Estrutura do Projeto

br.com.encurtador
│
├── config
│ └── Conexao.java
│
├── model
│ └── Link.java
│
├── dao
│ └── LinkDAO.java
│
└── Main.java


## ⚙️ Funcionalidades atuais

✔ Conexão com banco PostgreSQL  
✔ Criação da tabela `links`  
✔ Inserção de links no banco  
✔ Recuperação do ID gerado automaticamente

## 🚧 Próximos passos

- Geração automática do código curto
- Consulta de URL pelo código
- Implementação com Spring Boot
- Criação de API REST

## 👨‍💻 Autor

Projeto desenvolvido para fins de aprendizado e evolução profissional.
