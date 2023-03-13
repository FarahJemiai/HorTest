@tag
Feature: Authentification
  Nous allons faire l authentification sur l application HORMIGA

  @tag1
  Scenario: Authentification valide
    Given Acceder a l URL de l application HORMIGA
    When Saisir le username
    And Saisir le password
    And Cliquer sur Remember ME
    And Cliquer sur le bouton SIGN IN
    Then Ouverture de la page d accueil