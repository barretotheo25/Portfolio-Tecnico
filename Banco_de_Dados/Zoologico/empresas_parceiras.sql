create table empresas_parceiras(
	cod int primary key,
	nome varchar,
	aluguel decimal (7,2),
	email varchar,
	funcao varchar
);

insert into empresas_parceiras
(cod, nome, aluguel, email, funcao)
values
(2508, 'Juninho Cachorro-quentes', 5000.00, 'juninhocahorrao@gmail.com', 'Vender cachorro_quentes'),
(2208, 'Mario dos crepezão', 4000.00, 'mariovendedorvidafelizcrepes@yahoo.com', 'Vender crepes deliciosos'),
(2105, 'Claudia do sorvetinho', 10000.00, 'claudiasorvetesltda@outlook.com', 'Vender sorvetes para alegrar as crianças');
