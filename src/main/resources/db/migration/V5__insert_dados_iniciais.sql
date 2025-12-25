INSERT INTO turma (id, nome) VALUES (1, '1º Ano A');
INSERT INTO turma (id, nome) VALUES (2, '2º Ano B');

INSERT INTO aluno (id, nome, turma_id) VALUES (1, 'João', 1);
INSERT INTO aluno (id, nome, turma_id) VALUES (2, 'Maria', 1);
INSERT INTO aluno (id, nome, turma_id) VALUES (3, 'Carlos', 2);


INSERT INTO disciplina (id, nome) VALUES (1, 'Matemática');
INSERT INTO disciplina (id, nome) VALUES (2, 'Português');

INSERT INTO nota (id, aluno_id, disciplina_id, valor) VALUES (1, 1, 1, 8.5);
INSERT INTO nota (id, aluno_id, disciplina_id, valor) VALUES (2, 1, 2, 7.0);
