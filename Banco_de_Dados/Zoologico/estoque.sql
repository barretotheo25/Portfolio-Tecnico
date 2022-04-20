create table estoque(
	codigo int primary key,
	cod_fornecedor varchar references fornecedor (cnpj),
	preco decimal (5,2),
	quantidade int,
	data_compra date,
	marca varchar,
	validade date,
	produto varchar
)
