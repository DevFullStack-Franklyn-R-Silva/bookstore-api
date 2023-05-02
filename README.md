# Book Store API
Este é um projeto de API backend para uma aplicação de Livraria desenvolvido em Java. A API utiliza H2 para o banco de dados em memória, validation para validação de dados e JPA para o mapeamento objeto-relacional. As duas classes principais do projeto são Livro e Categoria.

## Tecnologias Utilizadas
- Java
- H2
- Validation
- JPA
## Classes

### Livro

| Atributo    | Tipo     | Descrição                         |
| ----------- | -------- | --------------------------------- |
| id          | Integer  | Identificador único do livro      |
| titulo      | String   | Título do livro                   |
| nome_autor  | String   | Nome do autor do livro            |
| texto       | String   | Texto descritivo do livro         |
| categoria   | Categoria | Categoria à qual o livro pertence |

### Categoria

| Atributo  | Tipo          | Descrição                                |
| --------- | ------------- | ---------------------------------------- |
| id        | Integer       | Identificador único da categoria         |
| nome      | String        | Nome da categoria                        |
| descricao | String        | Descrição da categoria                   |
| livros    | List\<Livro\> | Lista de livros que pertencem a esta categoria |


## Executando o Projeto
Para executar o projeto, é necessário ter o Java e o Maven instalados na máquina. Após clonar o repositório, abra um terminal na pasta raiz do projeto e execute o seguinte comando:

```java
mvn spring-boot:run
```
Este comando irá compilar o projeto e iniciar o servidor. A API estará disponível no endereço http://localhost:8080.
Para testa no H2 http://localhost:8080/h2-console/

Testes
Para executar os testes automatizados do projeto, basta executar o seguinte comando na pasta raiz do projeto:

```java
mvn test
```
Este comando irá compilar o projeto e executar todos os testes definidos. Será exibido o resultado dos testes no terminal.




