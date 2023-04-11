

use anotacao;

drop table fnc_funcionario;

create table fnc_funcionario(
    fnc_id bigint unsigned primary key auto_increment,
    fnc_nome varchar(100) not null,
    fnc_cpf bigint not null,
    fnc_data_hora_cadastro datetime not null,
    fnc_cargo varchar(20),
    fnc_email varchar(30) not null,
    fnc_senha varchar(150) not null
);

insert into fnc_funcionario(fnc_nome, fnc_cpf, fnc_data_hora_cadastro, fnc_email, fnc_senha) values ('Charles Smith', 12345678910, current_timestamp(), 'chsmith@email.com', 'pass123'), ('Ann Doe', 23456743212, current_timestamp, 'anndoe@email.com', '123456');