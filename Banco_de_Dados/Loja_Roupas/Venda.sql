create table venda(
data date,
cod_funcionarios varchar(14) references funcionarios,
cod_produto bigint references produtos,
cod_cliente varchar(14) references clientes
);
insert into venda
(data, cod_funcionarios, cod_produto, cod_cliente)
values
('2022-02-16', '55.55555.22-8', 654987, '255.655.525-52'),
('2022-02-17', '55.55555.22-8', 664494, '452.468.345-89');
