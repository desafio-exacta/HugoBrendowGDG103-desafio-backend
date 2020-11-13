CREATE TABLE Tag (
	id int NOT NULL AUTO_INCREMENT,
	gasto_tag int,
	descricao varchar(255),
	PRIMARY KEY (id),
	FOREIGN KEY (gasto_tag) REFERENCES Gasto(id) ON DELETE CASCADE
);
