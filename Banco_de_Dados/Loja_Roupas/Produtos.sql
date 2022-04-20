create table produtos(
cod_produto bigint primary key,
tecido varchar,
tamanho varchar,
modelo varchar,
estilo varchar,
marca varchar,
preco decimal(5,2),
cod_fornecedor varchar(18) references fornecedores(cnpj)
);

insert into produtos
(cod_produto, tecido, tamanho, modelo, estilo, marca, preco, cod_fornecedor)
values
(654987, 'Poliamida', 'M', 'Short', 'Sport', 'Rola Moça', 54.90, '55.555.555/0001-85'),
(664494, 'Algodão', 'G', 'Vestido', 'Gala', 'Lança Perfume', 350.00, '22.333.333/0001-22');
