@tag
Feature: Creation CRA ADMIN
  Nous allons creer un CRA en tant qu administrateur

  @tag1
  Scenario: Creation CRA ADMIN Valide
    Given URL HORMIGA 
    When Saisir login
    And Saisir PW
    And Remember Me
    And Se connecter
    And Cliquer sur Activity
    And Cliquer sur Timesheet
    And Cliquer sur Create CRA
    And Selectionner developer list 
    And Selectionner project list
    And Calendrier
    And Cliquer Next1
    And Cliquer Next2
    And Cliquer Next3
    And Cliquer Next4
    And Cliquer Next5
    And Cliquer Next6
    And Cliquer Save
    And Confirmer Save
    Then Creation CRA valide