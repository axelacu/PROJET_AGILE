@Test2
Feature: US_02
  I want to add obus in my tank
  Scenario Outline: le soldat veut recharger le tank
    Given le soldat veut incrementer le nombre d'obus 1 fois
    When l'utilisateur chargeObus()
    Then renvoi le nombre d'obus <nbObus> du tank

    Examples:
      |nbObus|
      |1|
  Scenario Outline: le soldat veut recharger le tank qui a atteint sa capacité max
    Given le soldat veut incrementer le nombre d'obus 12
    When l'utilisateur chargeObus()
    Then renvoi le nombre d'obus <nbObus> du tank

    Examples:
      |nbObus|
      |capicité max|