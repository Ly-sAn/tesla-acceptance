Feature: Configuration du modèle
  Scenario Outline: Configurer son modèle afin de choisir quel modèle commander
    Given je suis sur la page "https://www.tesla.com/fr_fr/models"
    Then Par defaut prix LOA est "847 €/mois"
    And A la selection du modele "<model>" prix LOA "<prixLOA>" carburant "<montantEcoCarburant>" montant total "<montantTotal>"
    And A la sélection option "Capacité de conduite entièrement autonome" prix augmente par mois "89"
    And Apres config, click logo gauche et vérifier si popup gauche existe
    And Dans popup selectionner "France"
    And Le lien "Localisations" contient url "https://www.tesla.com/fr_FR/findus/list"
    Examples:
      |  model        |  prixLOA      | montantEcoCarburant          |  montantTotal |
      |  Plaid+       |  1441 €/mois  | 108 €/mois                   |  157 097 €    |
      |  Plaid        |  1203 €/mois  | 108 €/mois                   |  134 495 €    |