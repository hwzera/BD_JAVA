CREATE TABLE
    tb_user(
        id int not null auto_increment,
        username varchar(255),
        password varchar(255),
        status int,
        token double,
        PRIMARY KEY(id)
        );