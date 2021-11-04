package produtos.sampleapp_tricentis.stepdefs;

import cucumber.api.java.en.And;
import support.CoreWeb;
import static produtos.sampleapp_tricentis.objetos.Enter_Insurant_Data.*;

public class EnterInsurantData extends CoreWeb {

    @And("O usuario preenche o campo First Name com {string}")
    public void oUsuarioPreencheOCampoFirstNameCom(String arg0) {
        log().setLocator(enterInsurantData);
        find(enterInsurantDataInputFirstName).send().text(arg0);
    }

    @And("O usuario preenche o campo Last Name com {string}")
    public void oUsuarioPreencheOCampoLastNameCom(String arg0) {
        log().setLocator(enterInsurantData);
        find(enterInsurantDataInputLastName).send().text(arg0);
    }

    @And("O usuario preenche o campo Date of Birth com {string}")
    public void oUsuarioPreencheOCampoDateOfBirthCom(String arg0) {
        log().setLocator(enterInsurantData);
        find(enterInsurantDataInputBirthDate).send().text(arg0);
    }

    @And("O usuario preenche o campo Street Address com {string}")
    public void oUsuarioPreencheOCampoStreetAddressCom(String arg0) {
        log().setLocator(enterInsurantData);
        find(enterInsurantDataInputStreetAddress).send().text(arg0);
    }

    @And("O usuario seleciona o combobox do campo Country com {string}")
    public void oUsuarioSelecionaOComboboxDoCampoCountryCom(String arg0) {
        log().setLocator(enterInsurantData);
        find(enterInsurantDataSelectCountry).comboBox().set().byText(arg0);
    }

    @And("O usuario preenche o campo Zip Code com {string}")
    public void oUsuarioPreencheOCampoZipCodeCom(String arg0) {
        log().setLocator(enterInsurantData);
        find(enterInsurantDataInputZipCode).send().text(arg0);
    }

    @And("O usuario preenche o campo City com {string}")
    public void oUsuarioPreencheOCampoCityCom(String arg0) {
        log().setLocator(enterInsurantData);
        find(enterInsurantDataInputCity).send().text(arg0);
    }

    @And("O usuario seleciona o combobox do campo Occupation com {string}")
    public void oUsuarioSelecionaOComboboxDoCampoOccupationCom(String arg0) {
        log().setLocator(enterInsurantData);
        find(enterInsurantDataSelectOccupation).comboBox().set().byText(arg0);
    }

    @And("O usuario clica no campo {string}")
    public void oUsuarioClicaNoCampo(String arg0) {
        log().setLocator(enterInsurantData);
        switch (arg0) {

            case "Speeding":
                find(enterInsurantDataLabelHobbiesSpeeding).click();
                break;
        }
    }

    @And("O usuario preenche o campo Website com {string}")
    public void oUsuarioPreencheOCampoWebsiteCom(String arg0) {
        log().setLocator(enterInsurantData);
        scroll().down(500);
        find(enterInsurantDataInputWebSite).send().text(arg0);
    }

    @And("O usuario clica no botao Next na aba Enter Insurant Data")
    public void oUsuarioClicaNoBotaoNextNaAbaEnterInsurantData() {
        log().setLocator(enterInsurantData);
        if (find(enterInsurantDataButtonNext).exists()){
            find(enterInsurantDataButtonNext).click();
        }
    }

    @And("O usuario valida obrigatoriedade de campos na aba Enter Insurant Data")
    public void oUsuarioValidaObrigatoriedadeDeCamposNaAbaEnterInsurantData() {
        log().setLocator(enterInsurantData);
        sleep().setMaxTime(300);
        if (find(enterInsurantDataSpanValidacaoCamposObrigatorios).count() > 0){
            evidence("Campos obrigatorios não preenchidos ou não preenchidos corretamente");
            error().Fail();
        }
        sleep().setDefaultTime();
        log().type("Campos obrigatorios preenchidos corretamente");
    }

    @And("O usuario clica na opcao {string}")
    public void oUsuarioClicaNaOpcao(String arg0) {
        log().setLocator(enterInsurantData);
        switch (arg0) {

            case "Male":
                find(enterInsurantDataLabelMale).click();
                break;
        }
    }
}




















//























//


























//