Feature: Acceder aux évènements
  Scenario Outline: Participer aux évènements qui m'intéressent ou qui sont près de chez moi
    Given je suis sur la homepage "https://www.tesla.com/fr_FR/"
    Then Je clique sur le menu burger
    And Cliquer sur evenement menant vers "https://www.tesla.com/fr_FR/events"
    And Choisir un lieu dans le monde avec input
    And La page contient une liste de 15 ou moins evenements
    And Un lien affiche tous les evenements
    And Un lien affiche plus d'evenements
    And Le formulaire Soyez informé contient les champs "<champ>"
    And Remplir tous les champs du formulaire sauf email
    And Appuyer du bouton du formulaire
    And Un message textuel "obligatoire" apparait
    And Chercher un evenement à "Londres, Royaume-Uni"
    And Le premier résultat se trouve à "Royaume-Uni"
    And Chercher un evenement au "Japon"
    And Au click d'inscription, redirection vers url contenant "https://auth.tesla.com/"
    Examples:
      |  champ                   |
      |  Prénom                  |
      |  Nom                     |
      |  email                   |
      |  téléphone               |
      |  région                  |
      |  code postal             |
      |  recevoir les news tesla |
      |  Suivant                 |