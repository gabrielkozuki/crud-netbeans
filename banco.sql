create schema if not exists projeto_ianes;
use projeto_ianes;

create table if not exists tb_alunos (
	Id_aluno int primary key auto_increment,
    Nome_aluno varchar(50),
    Email_aluno varchar(100),
    Curso_aluno varchar(50)
);