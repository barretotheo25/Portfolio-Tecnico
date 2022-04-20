create table funcionarios(
num_carteira_trabalho varchar(14) primary key,
nome varchar,
cpf varchar,
salario decimal(7,2),
carga_horaria int,
cargo varchar
);
insert into funcionarios
(num_carteira_trabalho, nome, cpf, salario, carga_horaria, cargo)
values
('33.55555.22-8', 'Sheldon', '255.655.582-45', 1000.00, 6, 'Estagiário'),
('55.55555.22-8', 'Jessica', '638.885.319-53', 2000.00, 8, 'Estoquista');
