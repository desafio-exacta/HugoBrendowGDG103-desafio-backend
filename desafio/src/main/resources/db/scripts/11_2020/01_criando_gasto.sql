-- Criando tabela inicial
CREATE TABLE gasto (
    id int NOT NULL AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    descricao varchar(255),
    data date,
    valor decimal(10,2),
    PRIMARY KEY (id)
);
