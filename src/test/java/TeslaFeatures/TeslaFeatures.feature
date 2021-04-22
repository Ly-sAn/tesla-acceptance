Feature: Caractéristiques Tesla Model 3
  Scenario Outline: Comprendre les différentes versions de la model et faire mon choix en fonction de mes envies
    Given je suis sur la page "https://www.tesla.com/fr_fr/model3"
    Then Pour la "<gamme>", les valeurs "<poids>", "<accélération>", "<autonomie>" correspondent
    Examples:
      | gamme                | poids    | accélération | autonomie |
      | Performance          | 1,844 kg | 3,3 secondes | 567 km    |
      | Grande Automonie AWD | 1,844 kg | 4,4 secondes | 580 km    |
      | Standard Plus        | 1,745 kg | 5,6 secondes | 448 km    |