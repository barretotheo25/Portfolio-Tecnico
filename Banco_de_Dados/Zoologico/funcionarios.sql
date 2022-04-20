create table funcionarios(
	pis varchar primary key,
	nome varchar,
	cpf varchar,
	carga_horaria int,
	salario decimal (6,2),
	email varchar,
	data_nascimento date,
	cargo varchar
)

insert into funcionarios
(pis, nome, cpf, carga_horaria, salario, email, data_nascimento, cargo)
values
('170.33259.50-4', 'Marilha', '102.227.489-90', 12, 1500.50, 'marilhasilvadaconceicao@gmail.com', '1968-08-22', 'Cuida do leão'),
('174.33459.20-1', 'Marcos Silva', '102.227.649-29', 8, 1100.50, 'marquinhoscatchau@gmail.com', '1985-04-15', 'Catador de lixo')
