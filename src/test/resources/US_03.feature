@Test3
Feature: US_03
  I want to move the tank beast
  Scenario Outline: le soldat veut bouger le tank
    Given le soldat desir faire avancer le tank
    When le soldat allume le moteur
    Then renvoi l'<etat> du tank

    Examples:
      |etat|
      |1|