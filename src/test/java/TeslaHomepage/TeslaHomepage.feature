Feature: Fonctionnalités de la page d'accueil
  Scenario Outline: Vérification des éléments de la homepage
    Given je suis sur la homepage "https://www.tesla.com/fr_FR/"
    Then le titre doit être "Voitures électriques, énergie solaire et propre | Tesla France"
    And la description contient "Tesla accélère la transition mondiale vers une énergie durable en proposant desvéhicules électriques, des panneaux solaires et des solutions intégrées d'énergie renouvelable pour les particuliers et les entreprises."
    And Il existe plusieurs "<punchline>"
    And le menu de haut contient un lien "<titre>" menant vers "<url>"
    And le burger menu contient un lien "<lien>"
    Examples:
      |  punchline                                  |  titre    | url                                   |  lien                  |
      |  Model 3                                    |  Model S  | https://www.tesla.com/fr_FR/models    |  Véhicules disponibles |
      |  Model S                                    |  Model 3  | https://www.tesla.com/fr_FR/model3    |  Véhicules d'occasion  |
      |  Model X                                    |  Model X  | https://www.tesla.com/fr_FR/modelx    |  Reprise               |
      |  Model Y                                    |  Model Y  | https://www.tesla.com/fr_FR/modely    |  Cybertruck            |
      |  Systèmes d'énergie solaire et Powerwalls   |  Powerwall| https://www.tesla.com/fr_FR/powerwall |  Roadster              |
      |                                             |  Recharger| https://www.tesla.com/fr_FR/charging  |  Energie               |
      |                                             |           |                                       |  Essais                |
      |                                             |           |                                       |  Flottes et entreprises|
      |                                             |           |                                       |  Nous trouver          |
      |                                             |           |                                       |  Evénements            |
      |                                             |           |                                       |  Assistance            |