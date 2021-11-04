Feature: Sampleapp Tricentis

  @Tricentis @Tricentis_01
  Scenario: Validando a pagina Enter Vehicle Data, Author: Cesar Augusto, Category: Validando, Environment: Tricentis - Google Chrome
    Given O usuario acessa a aplicacao
    And O usuario valida pagina "Enter Vehicle Data"
    And O usuario valida campo "Make"
    And O usuario valida campo "Model"
    And O usuario valida campo "Cylinder Capacity"
    And O usuario valida campo "Engine Performance"
    When O usuario valida campo "Date of Manufacture"
    And O usuario valida campo "Number of Seats"
    And O usuario valida campo "Right Hand Drive"
    And O usuario valida campo "Number Of Seats"
    And O usuario valida campo "Fuel Type"
    And O usuario valida campo "Payload"
    And O usuario valida campo "Total Weight"
    And O usuario valida campo "List Price"
    And O usuario valida campo "License Plate Number"
    And O usuario valida campo "Annual Mileage"
    Then O usuario valida o botao next

  @Tricentis @Tricentis_02
  Scenario:  Preenchendo o fluxo, Author: Cesar Augusto, Category: Fluxo, Environment: Tricentis - Google Chrome
    Given O usuario acessa a aplicacao
    And O usuario seleciona o combobox do campo make com "Audi"
    And O usuario seleciona o combobox do campo model com "Scooter"
    And O usuario preenche o campo cylinder capacity com "600"
    And O usuario preenche o campo engine performance com "600"
    And O usuario preenche o campo Date of Manufacture com "10/02/2021"
    And O usuario seleciona o combobox do campo Number of Seats com "1"
    And O usuario seleciona a opcao yes no campo Right Hand Drive
    When O usuario seleciona o combobox do campo Number Of Seats com "1"
    And O usuario seleciona o combobox do campo Fuel Type com "Petrol"
    And O usuario preenche o campo Payload com "60"
    And O usuario preenche o campo Total Weight com "600"
    And O usuario preenche o campo List Price com "600"
    And O usuario preenche o campo License Plate Number com "10"
    And O usuario preenche o campo Annual Mileage com "100"
    And O usuario valida obrigatoriedade de campos na aba Enter Vehicle Data
    And O usuario clica no botao Next na aba Enter Vehicle Data
    And O usuario preenche o campo First Name com "Accenture"
    And O usuario preenche o campo Last Name com "Automation"
    And O usuario preenche o campo Date of Birth com "06/26/1993"
    And O usuario clica na opcao "Male"
    And O usuario preenche o campo Street Address com "Av: Orozimbo Maia"
    And O usuario seleciona o combobox do campo Country com "Brazil"
    And O usuario preenche o campo Zip Code com "13035070"
    And O usuario preenche o campo City com "13035070"
    Then O usuario seleciona o combobox do campo Occupation com "Employee"
    And O usuario clica no campo "Speeding"
    And O usuario preenche o campo Website com "http://sampleapp.tricentis.com/101/app.php"
    And O usuario valida obrigatoriedade de campos na aba Enter Insurant Data
    And O usuario clica no botao Next na aba Enter Insurant Data
    And O usuario preenche o campo Start Date com "11/10/2021"
    And O usuario seleciona o combobox do campo Insurance Sum com "3.000.000,00"
    And O usuario seleciona o combobox do campo Merit Rating com "Bonus 1"
    And O usuario seleciona o combobox do campo Damage Insurance com "Partial Coverage"
    And O usuario seleciona a opcao Euro Protection do campo Optional Products
    And O usuario seleciona o combobox do campo Courtesy Car com "Yes"
    And O usuario valida obrigatoriedade de campos na aba Enter Product Data
    And O usuario clica no botao Next na aba Enter Product Data
    And O usuario seleciona a opcao Unlimited
    And O usuario valida obrigatoriedade de campos na aba Select Price Option
    And O usuario clica no botao Next na aba Select Price Option
    And O usuario preenche o campo Email com "sampleapp@tricentis.com"
    And O usuario preenche o campo Phone com "19993997673"
    And O usuario preenche o campo Username com "sampleapp"
    And O usuario preenche o campo Password com "Sampleapp@123"
    And O usuario preenche o campo Confirm Password com "Sampleapp@123"
    And O usuario preenche o campo Comments com "Teste"
    And O usuario valida obrigatoriedade de campos na aba Send Quote
    And O usuario clica no botao Send na aba Send Quote
    Then O usuario valida mensagem Sending e-mail success










