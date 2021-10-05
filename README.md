# Automação

Esta Automação foi feita utilizando a IDEA Intellij, Java 1.8, cucumber, Selenium e chromeDrive. Foram feitas duas suítes uma para demonstrar o processo de validação de conteúdo de uma pagina e a outra o fluxo da aplicação.


# Projeto
 
A automação é composta por Features, Stepdefs, Runner, Objetos e Relatorio.

Features, contem informações do que se trata a automação e os BDDs.

    Feature: Sampleapp Tricentis  
      @Tricentis @Tricentis_01  
      Scenario: Validando a pagina Enter Vehicle Data, Author: Cesar Augusto, Category:    Validando, Environment: Tricentis - Google Chrome  
        Given O usuario acessa a aplicacao  
        And O usuario valida pagina "Enter Vehicle Data"  
        And O usuario valida campo "Make"

Stepdefs, são onde os metodos de cada BDD vai estar alocado.

    @And("O usuario valida obrigatoriedade de campos na aba Enter Vehicle Data")  
    public void oUsuarioValidaObrigatoriedadeDeCamposNaAbaEnterVehicleData() {  
        log().setLocator(enterVehicleData);  
      sleep().setMaxTime(300);  
     if (find(enterVehicleDataSpanValidacaoObrigatoriedadeEnterVehicleData).count() > 0){  
            evidence("Campos obrigatorios não preenchidos ou não preenchidos corretamente");  
      error().Fail();  
      }  
        sleep().setDefaultTime();  
      log().type("Campos obrigatorios preenchidos corretamente");  
    }

Runner, o arquivo responsavel para executar a automação, tanto um unico caso de teste como varios.

    @RunWith(Cucumber.class)  
    @CucumberOptions(  
            features = "src/test/resources/produtos/features/sampleapp_tricentis/",  
      glue={"produtos.sampleapp_tricentis.stepdefs"},  
      plugin = { "intern.plugin.ListCucumberDesenv"},  
      tags = {"@Tricentis"}  
    )

Objetos, onde esta localizado os Xpaths e Logs.

    public static String enterVehicleDataLabelMake = "//label[contains(., \"Make\")]";  
    public static String enterVehicleDataLabelModel = "//label[contains(., \"Model\")]";  
    public static String enterVehicleDataLabelCylinderCapacity = "//label[contains(., \"Cylinder Capacity [ccm]\")]";  
    public static String enterVehicleDataLabelEnginePerformance = "//label[contains(., \"Engine Performance [kW]\")]";  
    public static String enterVehicleDataLabelDateOfManufacture = "//label[contains(., \"Date of Manufacture\")]";

## Plugins e imports

- Importar o maven
- Plugin Cucumber e Gherkin

## Java

- Java 1.8





