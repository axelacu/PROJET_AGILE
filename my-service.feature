Feature: US_004 Destroy Cible
          Le tank tire sur une cible désignée et la détruit

  Scenario: Refus de tir pour stock d'obus nul
    Given Notre <stock> d'obus
    When L'état Major donne l'ordre de tir
    Then L'opérateur refuse le tir par manque de munitions avec le <message>

  Example:
  | stock | message |
  | 0     | "Je suis à sec"   |

  Scenario: Tirer et détruire cible
    Given Demande de destruction d'une <cible>
    When L'état Major donne l'ordre de tir
    Then La cible doit être détruite et <touche> mis à true

    Example:
      | cible          | touche |
      | "charAllemand" | true   |

  Scenario: Décrémenter stock d'obus
    Given Notre <stock> d'obus
    When un tir est effectué
    Then Notre <nouveauStock> est calculé

    Example:
    | stock | NouveauStock |
    | 10    | 9            |
