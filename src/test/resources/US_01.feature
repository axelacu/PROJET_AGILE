@Test1
Feature: US_01
  As a tank I want to add a targer to my cannon

  Scenario Outline: le soldat ajoute une cible supplementaire dans la liste de cible du tank
    Given L'ajout d'une cible comprend une <cible>
    When le soldat l'ajoute
    Then le nombre d'objet cible de <nombre>

    Examples:
      |cible|nombre|
      |"maison"|1|
      |"voiture"|1|

  Scenario Outline: le soldat ajoute une cible deja existante
    Given L'ajout d'une cible comprend un <cible>
    When le soldat l'ajoute mais deja existante dans la liste
    Then le nombre est de <nombre>

    Examples:
      |cible|nombre|
      |"maison"|1|