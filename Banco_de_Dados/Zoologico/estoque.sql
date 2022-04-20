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

insert into estoque
(codigo, cod_fornecedor, preco, quantidade, data_compra, marca, validade, produto)
values
(8434, '09.638.885/0001-23', 150.20, 50, '2022-01-23', 'rolex', '2025-05-14', 'Ração da galerinha dos leões'),
(8524, '09.638.885/0001-20', 500.70, 90, '2021-05-22', 'svarowski', '2028-02-18', 'Ração gold para macacos'),
(8462, '08.637.881/0002-15', 320.50, 40, '2020-12-05', 'versace', '2024-02-11', 'Ração para elefantes caridosos')
