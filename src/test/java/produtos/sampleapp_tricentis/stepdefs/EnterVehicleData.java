package produtos.sampleapp_tricentis.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import support.CoreWeb;

import static produtos.sampleapp_tricentis.objetos.Enter_Vehicle_Data.*;
import static produtos.sampleapp_tricentis.objetos.Dados_Aplicacao.*;

public class EnterVehicleData extends CoreWeb {


    @Given("O usuario acessa a aplicacao")
    public void oUsuarioAcessaAAplicacao() {
        webDriver().set().options().maximized();
        webDriver().navigate("http://sampleapp.tricentis.com/101/app.php");
    }

    @And("O usuario seleciona o combobox do campo make com {string}")
    public void oUsuarioSelecionaOComboboxDoCampoMakeCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataSelectMake).comboBox().set().byText(arg0);
    }

    @And("O usuario seleciona o combobox do campo model com {string}")
    public void oUsuarioSelecionaOComboboxDoCampoModelCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataSelectModel).comboBox().set().byText(arg0);
    }

    @And("O usuario valida pagina {string}")
    public void oUsuarioValidaPagina(String arg0) {
        log().setLocator(enterVehicleData);
        abaAplicacao = arg0;
        if (find(enterVehicleDataTextPaginaEnterVehicleData.replace("arg0", abaAplicacao)).exists()){
            find(enterVehicleDataTextPaginaEnterVehicleData.replace("arg0", abaAplicacao)).click();
        }else {
            evidence("Não foi apresentado o titulo da pagina");
            error().Fail();
        }
    }

    @And("O usuario valida campo {string}")
    public void oUsuarioValidaCampo(String arg0) {
        log().setLocator(enterVehicleData);
        switch (arg0) {

            case "Make":
                if (find(enterVehicleDataLabelMake).exists()){
                }else {
                    evidence("Não foi apresentado o campo Make");
                    error().Fail();
                }

                break;

                case "Model":
                if (find(enterVehicleDataLabelModel).exists()){
                }else {
                    evidence("Não foi apresentado o campo Model");
                    error().Fail();
                }
                break;

            case "Cylinder Capacity":
                if (find(enterVehicleDataLabelCylinderCapacity).exists()){
                }else {
                    evidence("Não foi apresentado o campo Cylinder Capacity");
                    error().Fail();
                }
                break;

                case "Engine Performance":
                if (find(enterVehicleDataLabelEnginePerformance).exists()){
                }else {
                    evidence("Não foi apresentado o campo Engine Performance");
                    error().Fail();
                }
                break;

                case "Date of Manufacture":
                if (find(enterVehicleDataLabelDateOfManufacture).exists()){
                }else {
                    evidence("Não foi apresentado o campo Date of Manufacture");
                    error().Fail();
                }
                break;

                case "Number of Seats":
                if (find(enterVehicleDataLabelNumberOfSeats).exists()){
                }else {
                    evidence("Não foi apresentado o campo Number of Seats");
                    error().Fail();
                }
                scroll().down(650);
                break;

                case "List Price":
                if (find(enterVehicleDataLabelListPrice).exists()){
                }else {
                    evidence("Não foi apresentado o campo List Price");
                    error().Fail();
                }
                break;

                case "Annual Mileage":
                if (find(enterVehicleDataLabelAnnualMileage).exists()){
                }else {
                    evidence("Não foi apresentado o campo Annual Mileage");
                    error().Fail();
                }
                break;

            case "Right Hand Drive":
                if (find(enterVehicleDataLabelRightHandDrive).exists()){
                }else {
                    evidence("Não foi apresentado o campo Right Hand Drive");
                    error().Fail();
                }
                break;

                case "Number Of Seats":
                if (find(enterVehicleDataLabelNumberofSeats).exists()){
                }else {
                    evidence("Não foi apresentado o campo Right Hand Drive");
                    error().Fail();
                }
                break;

            case "Fuel Type":
                if (find(enterVehicleDataLabelFuelType).exists()){
                }else {
                    evidence("Não foi apresentado o campo Right Hand Drive");
                    error().Fail();
                }
                break;

                case "Payload":
                if (find(enterVehicleDataLabelPayload).exists()){
                }else {
                    evidence("Não foi apresentado o campo Right Hand Drive");
                    error().Fail();
                }
                break;

                case "Total Weight":
                if (find(enterVehicleDataLabelTotalWeight).exists()){
                }else {
                    evidence("Não foi apresentado o campo Right Hand Drive");
                    error().Fail();
                }
                break;

            case "License Plate Number":
                if (find(enterVehicleDataLabelLicensePlateNumber).exists()){
                }else {
                    evidence("Não foi apresentado o campo Right Hand Drive");
                    error().Fail();
                }
                break;
        }
    }

    @Then("O usuario valida o botao next")
    public void oUsuarioValidaOBotaoNext() {
        log().setLocator(enterVehicleData);
        if (find(enterVehicleDataButtonNext).exists()){
        }else {
            evidence("Não foi apresentado o botao Next");
            error().Fail();
        }
    }

    @And("O usuario preenche o campo cylinder capacity com {string}")
    public void oUsuarioPreencheOCampoCylinderCapacityCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataInputCylinderCapacity).send().text(arg0);
    }

    @And("O usuario preenche o campo engine performance com {string}")
    public void oUsuarioPreencheOCampoEnginePerformanceCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataInputEnginePerformance).send().text(arg0);
    }

    @And("O usuario preenche o campo Date of Manufacture com {string}")
    public void oUsuarioPreencheOCampoDateOfManufactureCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataInputDateofManufacture).send().text(arg0);
    }

    @And("O usuario seleciona o combobox do campo Number of Seats com {string}")
    public void oUsuarioSelecionaOComboboxDoCampoDoNumberOfSeatsCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataSelectNumberOfSeats).comboBox().set().byText(arg0);
    }

    @And("O usuario seleciona o combobox do campo Number Of Seats com {string}")
    public void oUsuarioSelecionaOComboboxDoCampoNumberOfSeatsCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataSelectNumberofSeats).comboBox().set().byText(arg0);
    }

    @And("O usuario seleciona o combobox do campo Fuel Type com {string}")
    public void oUsuarioSelecionaOComboboxDoCampoFuelTypeCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataSelectFuelType).comboBox().set().byText(arg0);
    }

    @And("O usuario preenche o campo Payload com {string}")
    public void oUsuarioPreencheOCampoPayloadCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataInputPayload).send().text(arg0);
    }

    @And("O usuario preenche o campo Total Weight com {string}")
    public void oUsuarioPreencheOCampoTotalWeightCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataInputTotalWeight).send().text(arg0);
    }

    @And("O usuario preenche o campo List Price com {string}")
    public void oUsuarioPreencheOCampoListPriceCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataInputListPrice).send().text(arg0);
    }

    @And("O usuario preenche o campo License Plate Number com {string}")
    public void oUsuarioPreencheOCampoLicensePlateNumberCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataInputLicensePlateNumber).send().text(arg0);
    }

    @And("O usuario preenche o campo Annual Mileage com {string}")
    public void oUsuarioPreencheOCampoAnnualMileageCom(String arg0) {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataInputAnnualMileage).send().text(arg0);
    }

    @Then("O usuario clica no botao Next na aba Enter Vehicle Data")
    public void oUsuarioClicaNoBotaoNextNaAbaEnterVehicleData() {
        log().setLocator(enterVehicleData);
        if (find(enterVehicleDataButtonNext).exists()){
            find(enterVehicleDataButtonNext).click();
        }
    }

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

    @And("O usuario seleciona a opcao yes no campo Right Hand Drive")
    public void oUsuarioSelecionaAOpcaoYesNoCampoRightHandDrive() {
        log().setLocator(enterVehicleData);
        find(enterVehicleDataLabelRightHandDriveYes).click();
    }
}




















//























//


























//