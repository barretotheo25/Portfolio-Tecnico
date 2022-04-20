create table clientes(
cpf varchar(14) primary key,
nome varchar,
email varchar,
endereço varchar,
telefone varchar
);
insert into clientes
(cpf, nome, email, endereço, telefone)
values
('255.655.525-52', 'William', 'will@gmail.com', 'Rua Tal', '(48)99999-9999'),
('452.468.345-89', 'José', 'jose@gmail.com', 'Avenida Tal', '(48)99999-8888');
