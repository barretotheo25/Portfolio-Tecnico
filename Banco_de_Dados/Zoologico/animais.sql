create table animais(
	cod int primary key,
	nome varchar,
	setor varchar,
	observacoes varchar,
	especie varchar,
	ultima_visita_veterinario date,
	peso decimal (6,3),
	ano_nascimento date,
)

insert into animais
(cod, nome, setor, observacoes, especie, ultima_visita_veterinario, peso, ano_nascimento)
values
(8812, 'Julinha', 'Mamífero', 'Está grávida', 'Macaca', '2022-02-08', 2.500, '2022-01-15'),
(8422, 'Maurício', 'Mamífero', 'Está morrendo', 'Leão', '2021-10-20', 350.000, '2020-12-20')
