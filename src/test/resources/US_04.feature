@Test4
Feature: US_004 Destroy Cible
          Le tank tire sur une cible désignée et la détruit

  Scenario Outline: Refus de tir pour stock d'obus nul
    Given Notre tank et une <cible> tire avec un stock nul
    When L'état Major donne l'ordre de tir
    Then L'opérateur refuse le tir par manque de munitions et <touche> mis à false
    Examples:
      | cible          | touche |
      | "charAllemand" | false  |

  Scenario Outline: Tirer et détruire cible
    Given Demande de destruction d'une <cible>
    When L'état Major donne l'ordre de tir
    Then La cible doit être détruite et <touche> mis à true
    Examples:
      | cible | touche |
      | "charAllemand" | true   |

  Scenario Outline: Décrémenter stock d'obus
    Given Notre tank tire avec un <stock> d'obus
    When L'état Major donne l'ordre de tir
    Then Notre <nouveauStock> est calculé
    Examples:
      | stock | nouveauStock |
      | 10    | 9        |
