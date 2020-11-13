# desafio-backend
Desafio exactaworks

Projeto desenvolvido utilizando SpringBoot, Liquibase, JPA.

Para execução do banco foi utilizado o mysql, para criação do container foi utilizado o comando abaixo:

`docker run -d -p 3306:3306 --name=mysql -e MYSQL_ROOT_PASSWORD=desafio2020 -e MYSQL_DATABASE=desafio -e MYSQL_ROOT_HOST=% mysql:latest \
--default-authentication-plugin=mysql_native_password`

Após inicializado o container, executar o projeto do springboot.
