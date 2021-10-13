create database dbpadaria;
use dbpadaria;

create table tb_venda (
  id_venda int primary key auto_increment,
  ven_data_venda date,
  ven_valor_total double
);

create table tb_produto (
  id_produto int  primary key auto_increment,
  pro_nome varchar (100),
  pro_valor double,
  pro_estoque int
);

create table tbusuarios(
iduser int primary key auto_increment,
nome varchar(50) not null,
cpf varchar(14) not null unique,
telefone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null,
matricula int unique,
nivelHierarquico int,
endereco varchar(150) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
estado varchar(50) not null,
cep varchar(50) not null
);


describe tbusuarios;

-- CRUD
-- insere dados 

insert into dbinfox.tbusuarios(iduser, nome, cpf, telefone, login, senha, matricula, nivelHierarquico)
values (1, 'Anderson Ataide', '04723649441', '996662744', 'persel', 'persel00', 123, 1); 

insert into dbinfox.tbusuarios(iduser, nome, cpf, telefone, login, senha, matricula, nivelHierarquico)
values (2, 'Susy Gabrielle', '05515905482', '995215268', 'sussu', 'persel00', 124, 1);
insert into dbinfox.tbusuarios(iduser, nome, sobrenome, cpf, telefone, login, senha, matricula, nivelHierarquico)
values (3, 'Administrador', '99999999999', '999999999', 'admin', 'admin', 1, 3);
insert into dbinfox.tbusuarios(nome, sobrenome, cpf, telefone, login, senha, matricula, nivelHierarquico)
values ('teste', '11111111111', '999999999', 'admin2', 'admin', 2, 3);

-- exibe dados

select * from tbusuarios;

-- edicão de dados

update tbusuarios set telefone='98888-8888' where iduser=2;

-- deleção de dados

delete from tbusuarios  where iduser=2;

select * from tbusuarios where login='admin' and senha='admin';

ALTER TABLE tbusuarios DROP COLUMN sobrenome;

ALTER TABLE tbusuarios ADD endereco varchar(150) not null;

ALTER TABLE tbusuarios ADD bairro varchar(50) not null;

ALTER TABLE tbusuarios ADD cidade varchar(50) not null;

ALTER TABLE tbusuarios ADD estado varchar(50) not null;

ALTER TABLE tbusuarios ADD cep varchar(50) not null;

ALTER TABLE tbusuarios MODIFY cpf varchar(14);
