create table proprietario(
    id bigint not null auto_increment,
    nome VARCHAR(60) not null,
    email VARCHAR(255) not null,
    telefone VARCHAR(20) not null,

    primary key (id)
);


alter table proprietario
    add constraint uk_proprietario unique (email);