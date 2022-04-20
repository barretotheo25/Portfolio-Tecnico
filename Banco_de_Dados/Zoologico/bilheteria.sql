create table bilheteria(
	n_pulseira int primary key,
	esta_zoo boolean,
	cod_visitante varchar references visitantes (cpf)
)
