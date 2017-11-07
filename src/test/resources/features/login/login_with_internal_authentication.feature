# language: pt
Funcionalidade: Login com autenticação interna
  A fim de acessar a aplicação SE Suite
  Como um usuário com permissão de acesso interno
  Eu quero utilizar os meus dados de acesso para realizar o login.

  Esquema do Cenario: Login com sucesso usando autenticação interna para o usuário <usuario>
    Dado que eu acesso a pagina de login do SE Suite.
    Quando eu realizo o login utilizando como autenticação interna, o usuário <usuario> com a <senha>.
    Entao eu devo realizar o login com sucesso.

    Exemplos: 
      | usuario    | senha  |
      | softexpert | 111111 |
      | ctcbr      | 111111 |
      | andre      | 111111 |
