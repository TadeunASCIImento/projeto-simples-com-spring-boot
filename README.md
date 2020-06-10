# Uma simples agenda de cadastro de contatos.

Esse projeto foi desenvolvido em caráter de aprendizado no
desenvolvimento de aplicações com o Spring Framework.

Foram utilizadas as seguintes tecnologias no desenvolvimento:

 1 - Spring Boot
    ° Para inicialização e configuração das dependências do projeto.

 1 - Para o formulário de inserção dos dados:

     ° HTML, CSS ,Thymeleaf e Bootstrap.

2 - Para a lista onde são apresentados os dados:

     ° HTML, CSS ,Thymeleaf e Bootstrap.

3 - A entidade Contato que representa a tabela no banco de dados:

    ° Persistida e mapeada usando o conceito ORM, utilizando a JPA/Hibernate.
      Validação dos campos do formulário com Hibernate-Validator.
      Além do projeto Lombok, para geração dos getters,setters,construtores,
      métodos equals e hashcode, com a intenção de tornar a classe mais legível.

4 -  Para o banco de dados:

    ° Foi utilizado o banco de dados H2, a escolha se deu pelo simples motivo,
      da facilidade dos testes da aplicação sem a necessidade de instalar,
      um servidor de banco de dados pelo fato de o H2 ser um banco de dados em memória
