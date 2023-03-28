use anotacao;

create table snt_anotacao (
 ant_id bigint unsigned not null auto_increment,
 ant_texto varchar(256) not null,
 ant_data_hora datetime not null,
 ant_usr_id bigint usigned not null,
 primary key (ant_id),
 foreign key ant_usr_fk (ant_usr_nome) references usr_usuario(usr_id)
);