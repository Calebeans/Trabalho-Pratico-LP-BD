/*
	Script para a criação do banco de dados para uma Loja de Peças Automotivas.
*/

create table cliente (
    id serial not null primary key,
	nome varchar(100),
	cpf varchar(13),
	telefone varchar(15),
	data_nascimento date,
	
	uf varchar(2),
	cep varchar(10),
	cidade varchar(50),
	rua varchar(50),
	numero int
);

create table funcionario (
	id serial not null primary key,
	nome varchar(100),
	cpf varchar(13),
	telefone varchar(15),
	data_nascimento date,
	
	usuario varchar(20),
	senha varchar(20),
	tipo_usuario char,
	
	salario decimal(18,4) check (salario >= 0),
	
	uf varchar(2),
	cep varchar(10),
	cidade varchar(50),
	rua varchar(50),
	numero int
);

create table venda(
	id serial not null primary key,
	valor decimal(18,4),
	data_venda timestamp,
	id_funcionario int,
	id_cliente int,
	foreign key (id_funcionario) references funcionario (id),
	foreign key (id_cliente) references cliente (id)
);

create table unidade(
	id serial not null primary key,
	descricao varchar(10)
);

create table produto(
	id serial not null primary key,
	nome varchar(100),
	preco decimal(18,4) check (preco >= 0),
	estoque int,
	id_unidade int,
	foreign key (id_unidade) references unidade (id)
);

create table itens_venda(
	id serial not null primary key,
	quantidade_produto decimal(4,0),
	id_venda int,
	id_produto int,
	foreign key (id_venda) references venda (id),
	foreign key (id_produto) references produto (id)
);

create table fornecedor(
	id serial not null primary key,
	nome varchar(100),
	telefone varchar(15),
	cnpj varchar(14),
	
	uf varchar(2),
	cep varchar(10),
	cidade varchar(50),
	rua varchar(50),
	numero int
);

create table compra(
	id serial not null primary key,
	data_requerimento timestamp,
	valor decimal(18,4),
	
	id_fornecedor int,
	foreign key (id_fornecedor) references fornecedor(id)
);

create table itens_compra(
	id serial not null primary key,
	quantidade decimal(4,0),
	
	id_compra int,
	id_produto int,
	
	foreign key (id_compra) references compra(id),
	foreign key (id_produto) references produto(id)
);