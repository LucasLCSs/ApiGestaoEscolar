create table aluno(
    id bigserial primary key,
    nome varchar(100) not null,
    turma_id int references turma(id)
);