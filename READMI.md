📚 API – Sistema de Gestão Escolar

Este projeto consiste em uma API REST para gerenciamento de turmas, alunos, disciplinas e notas, permitindo a geração do boletim escolar de um aluno.

O sistema foi desenvolvido seguindo boas práticas de arquitetura, utilizando Spring Boot, MVC, DTOs, MapStruct e Flyway para versionamento do banco de dados.

🛠️ Tecnologias Utilizadas

• Java 21

• Spring Boot

• Spring Web (REST)

• Spring Data JPA

• PostgreSQL

• Flyway (Migrations)

• MapStruct

• Lombok

• Maven

🏗️ Arquitetura

O projeto segue o padrão MVC:

• Controller → Camada de entrada (endpoints REST)

• Service → Regras de negócio

• Repository → Persistência de dados

• DTO → Transferência de dados

• Mapper (MapStruct) → Conversão entre Entidades e DTOs

🗄️ Banco de Dados

📌 Tipo

Banco de dados Relacional (PostgreSQL)

📌 Versionamento

O banco é versionado automaticamente pelo Flyway, localizado em:

- src/main/resources/db/migration

📌 Migrations

Versão	Descrição
- V1	Criação da tabela aluno
- V2	Criação da tabela turma
- V3	Criação da tabela disciplina
- V4	Criação da tabela nota
- V5	Inserção de dados iniciais
- 
🌱 Dados Iniciais

- O sistema já inicia com dados pré-carregados automaticamente através do Flyway (V5__insert_dados_iniciais.sql), permitindo o uso imediato da aplicação sem necessidade de inserts manuais.

🚀 Como Executar o Projeto

1️⃣ Configurar o banco PostgreSQL

Crie um banco de dados no PostgreSQL, por exemplo:

gestao_escolar

2️⃣ Ajustar application.properties
- spring.datasource.url=jdbc:postgresql://localhost:5432/gestao_escolar
- spring.datasource.username=postgres
- spring.datasource.password=postgres

- spring.jpa.hibernate.ddl-auto=validate
- spring.jpa.show-sql=true
- spring.jpa.properties.hibernate.format_sql=true

- spring.flyway.enabled=true
- spring.flyway.locations=classpath:db/migration

- spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

3️⃣ Executar a aplicação

./mvnw spring-boot:run

📌 Endpoints da API

🏫 Turmas

➕ Cadastrar Turma

- POST /turmas

{
"nome": "1º Ano A"
}

📄 Listar Turmas

- GET /turmas

👨‍🎓 Alunos
➕ Cadastrar Aluno

- POST /alunos

{
"nome": "João",
"turma": "1º Ano A",
"disciplina": "Matemática"
}

📄 Listar Alunos por Turma

- GET /alunos?turmaId=1

📘 Disciplinas

➕ Cadastrar Disciplina

- POST /disciplinas

{
"nome": "Matemática"
}

📄 Listar Disciplinas

- GET /disciplinas

📝 Notas

➕ Cadastrar Nota

- POST /notas

{
"disciplina": {
"nome": "Matemática"
},
"nota": 8.5
}

📊 Gerar Boletim do Aluno

- GET /notas?alunoId=1

📌 Exemplo de resposta:

{
"aluno": {
"nome": "João"
},
"turma": {
"nome": "1º Ano A"
},
"notas": [
{
"disciplina": {
"nome": "Matemática"
},
"nota": 8.5
},
{
"disciplina": {
"nome": "Português"
},
"nota": 7.0
}
]
}

📈 Diferenciais do Projeto

✔️ Uso de Flyway para versionamento do banco

✔️ Separação clara de camadas (MVC)

✔️ DTOs para evitar exposição de entidades

✔️ MapStruct para mapeamento automático

✔️ Código limpo e organizado

✔️ Dados iniciais automáticos