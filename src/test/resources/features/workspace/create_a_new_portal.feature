# language: pt
@acceptance @regression @wip
Funcionalidade: Criação de portal
  A fim de melhorar a visibilidade dos meus dados.
  Como um usuário do SE Suite.
  Eu quero criar portais para meus diversos componentes.

  Cenario: Criação com sucesso do portal de Alerta de Tarefas do SE Ativo.
    Dado que eu realize o login no SE Suite com o usuário SoftExpert.
    Quando eu crio um novo potal com título 'Alerta de tarefas'
    E seleciono o portal Alerta de tarefas com layout Único
    Então eu devo ver que o título configurado está correto.
    E que o portal selecionado é apresentado corretamente.
