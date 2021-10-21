#Author: daniela@hotmail.com

Feature: Iniciar sessao
Como usuario quero iniciar sessao para realizar cadastro pessoal 

  Background: Acessar o site
  Given que esteja no site "https://www.zara.com/br/"

  Scenario: Cadastro com dados validos
  And clicar no menu iniciar sessao
  And clicar no menu criar conta
  When preencher os dados solicitados
  Then o cadastro sera realizado com sucesso
  
  Scenario: Cadastro com dados invalidos
  When preencher os dados e forem invalidos
  Then o cadastro nao sera realizado
  
  Scenario: Validar botao CRIAR CONTA
  And clicar no menu iniciar sessao
  When clicar no botao criar conta
  Then serei direcionado para a tela de cadastro
  
  Scenario: Efetuar cadastro com dados de usuario já cadastrado 
  And clicar no menu iniciar sessao
  And clicar no menu criar conta
  When preencher os dados solicitados
  But o usuario ja possuir cadastro
  Then nao sera possivel realizar cadastro4
  
  
  Scenario: Cadastro com dados em branco
  When nao preencher e os dados ficarem em branco
  Then devo visualizar mensagens de campo obrigatorio
  And nao realizar cadastro
  
  Scenario: Efetuar cadastro sem aceitar politica de privacidade e cookies
  When clicar no botao criar conta com os dados preenchidos
  And nao selecionar a opcao Li e entendi a politica de privacidade e cookies
  Then serei informado que devo aceitar a politica de privacidade
  And o cadastro nao sera realizado
  
  
  
  