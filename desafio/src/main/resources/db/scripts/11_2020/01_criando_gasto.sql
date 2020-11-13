-- Criando tabela inicial
CREATE TABLE Gasto (
    id int NOT NULL AUTO_INCREMENT,
    nomePessoa varchar(255) NOT NULL,
    descricao varchar(255),
    data date,
    valor decimal,
    PRIMARY KEY (id)
);