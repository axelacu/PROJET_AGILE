@Test1
Feature: US_01
  As a tank I want to add a targer to my cannon

  Scenario Outline: le soldat ajoute une cible supplementaire dans la liste de cible du tank
    Given L'ajout d'une cible comprend un <cible>
    When le soldat l'ajoute
    Then renvoi vrai car cible ajouté

    Examples:
      |cible|boolean|
      |"maison"|true|

  Scenario Outline: le soldat ajoute une cible deja existante
    Given L'ajout d'une cible comprend un <cible>
    When le soldat l'ajoute mais deja existante dans la liste
    Then renvoi faux car cible non ajouté

    Examples:
      |cible|boolean|
      |"maison"|false|