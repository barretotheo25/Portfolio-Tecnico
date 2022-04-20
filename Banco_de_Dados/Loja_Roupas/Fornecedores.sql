create table fornecedores(
cnpj varchar(18) primary key,
nome_fantasia varchar,
tipo_roupa varchar,
local varchar
);
insert into fornecedores
(cnpj, nome_fantasia, tipo_roupa, local)
values
('22.458.367/5555-66', 'Joãozinho importações', 'jeans', 'São Paulo'),
('09.638.887/0001-23', 'Lila Importadinhos', 'Vestidos', 'São Paulo'),
('55.555.555/0001-85', 'Kate', 'Shorts', 'São Paulo');
