# Krusty Task Manager API

Esse é o repositório das APIs RESTFul da aplicação Krusty Task Manager.

[![Build Status](https://travis-ci.org/victorjordan95/krusty-api.svg?branch=master)](https://travis-ci.org/victorjordan95/krusty-api)


### Módulos

O projeto está dividido em módulos:

- `application`: módulo responsável por conter a classe de execução da aplicação
- `business`: módulo responsável por conter as regras de negócio da aplicação
- `controller`: módulo responsável por receber as requisições da aplicação
- `dto`: módulo responsável por conter os [DTOs](https://pt.wikipedia.org/wiki/Objeto_de_Transfer%C3%AAncia_de_Dados "_DTOs_") da aplicação
- `model`: módulo responsável por realizar os acessos ao banco de dados
- `service`: módulo responsável por representar a camada de serviço da aplicação


### Configurações por ambiente

As configurações que são relacionadas ao ambiente em que a aplicação está são externalizadas através de variáveis de ambiente.

Atualmente, são utilizadas três variáveis de ambiente:

- `JDBC_DATABASE_URL`: define o endereço e o banco de dados a ser utilizado pela aplicação
- `JDBC_DATABASE_USERNAME`: define o nome do usuário do banco de dados a ser utilizado pela aplicação
- `JDBC_DATABASE_PASSWORD`: define a senha do usuário do banco de dados a ser utilizado pela aplicação


### Integração Contínua

Para integração contínua é utilizado o [Travis CI](hhttps://travis-ci.org/ "Travis CI") com o [Heroku](https://www.heroku.com/ "Heroku") (deploy)
