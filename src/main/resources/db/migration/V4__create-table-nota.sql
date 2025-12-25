create table nota(
    id bigserial primary key,
    aluno_id int references aluno(id),
    disciplina_id int references disciplina(id),
    valor decimal(5,2) not null
);