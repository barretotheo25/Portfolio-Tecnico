create table contas(
	cod int primary key,
	mes_ano varchar,
	valor_total_estoque decimal (9,3),
	valor_total_bilheteria decimal (9,3),
	valor_total_funcionário decimal (8,2),
	lucro decimal (9,3),
	gastos_extras decimal (7,2)
);

insert into contas
(cod, mes_ano, valor_total_estoque, valor_total_bilheteria, valor_total_funcionário, lucro, gastos_extras)
values
(8496, 'Agosto_2016', 250000.500, 240000.000, 100000.00, 500000.450, 30000.00),
(4592, 'Agosto_2017', 300000.000, 200000.000, 110000.00, 410000.350, 15000.00),
(8513, 'Agosto_2018', 350000.000, 400000.000, 150000.00, 750000.900, 35000.00)
