# Projeto Java/Spring

Projeto de API Rest para gerenciar um sistema de cadastro de Pessoas e seus respectivos Contatos, onde cada Pessoa pode ter vários Contatos. 
O principal objetivo é permitir que operações CRUD (Criar, Ler, Atualizar, Deletar) sejam realizadas na estrutura de Pessoas e Contatos.

## Requisitos
- JDK para executar o projeto.
- Maven.
- IDE (aqui usado o Eclipse).
- JPA/Hibernate para persistência de banco de dados MySQL.
- Spring Boot ((Versão 3.0.12).

## Instruções
- Clonar repositório.
- Exportar projeto como Maven dentro da IDE.
- Rodar a aplicação java e acessar o [Swagger/UI](http://localhost:8080/swagger-ui.html)

## Funcionalidades 
### 1. CRUD de Pessoas
### 2. CRUD de Contatos:

### Modelagem Sugerida
* Pessoa: deve conter, pelo menos, os seguintes campos:
* ID (único, não pode ser nulo)
* Nome (não pode ser nulo)
* Endereço (pode ser nulo)
* CEP (pode ser nulo)
* Cidade (pode ser nulo)
* UF (pode ser nulo)
* Contato: deve conter, pelo menos, os seguintes campos:
* ID (único, não pode ser nulo)
* Tipo contato (não pode ser nulo) [inteiro] (Utilize esse conceito: 0 Telefone, 1
Celular)
* Contato (não pode ser nulo)

![image](https://github.com/wca01/app-java-contatos/assets/105304356/f1de78ff-f213-4e69-abd5-a7826cc36ae4)


### Endpoints Necessários
- Pessoa:
* POST /api/pessoas (cria uma nova Pessoa)
* GET /api/pessoas/{id} (retorna os dados de uma Pessoa por ID)
*GET /api/pessoas/maladireta/{id} (retorna os dados de uma Pessoa por ID para
mala direta)

  ▪ No endpoint de mala direta, utilizar o conceito de DTO. Este conceito
cria uma classe diferente da classe Pessoa, com apenas os dados que
precisamos (pesquisar!). Dê preferência para a criação de Records (Java
17+).

▪ Utilizar os campos para o DTO: ID; Nome; Concatenação do Endereço,
CEP, Cidade, UF

• Exemplo:

{
“ID”: 1,
“Nome”: “Fulano”,
“MalaDireta”: “Rua A, 1 – CEP: 11111-000 – Cidade/UF”
}

* GET /api/pessoas (lista todas as Pessoas)
* PUT /api/pessoas/{id} (atualiza uma Pessoa existente)
* DELETE /api/pessoas/{id} (remove uma Pessoa por ID)

-Contato;
* POST /api/pessoas/{id}/contatos (adiciona um novo Contato a uma Pessoa)
* GET /api/contatos/{id} (retorna os dados de um Contato por ID)
* GET /api/pessoas/{idPessoa}/contatos (lista todos os Contatos de uma Pessoa)
* PUT /api/contatos/{id} (atualiza um Contato existente)
* DELETE /api/contatos/{id} (remove um Contato por ID)

![image](https://github.com/wca01/app-java-contatos/assets/105304356/43833b69-4c77-4112-a8b4-730044d66ba1)
