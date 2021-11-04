package produtos.sampleapp_tricentis.stepdefs;

import cucumber.api.java.en.And;
import support.CoreWeb;

import static produtos.sampleapp_tricentis.objetos.Enter_Insurant_Data.enterInsurantData;
import static produtos.sampleapp_tricentis.objetos.Enter_Insurant_Data.enterInsurantDataSpanValidacaoCamposObrigatorios;
import static produtos.sampleapp_tricentis.objetos.Enter_Product_Data.*;

public class EnterProductData extends CoreWeb {

    @And("O usuario seleciona o combobox do campo Damage Insurance com {string}")
    public void oUsuarioSelecionaOComboboxDoCampoDamageInsuranceCom(String arg0) {
        log().setLocator(enterProductData);
        find(enterInsurantDataSelectDamageInsurance).comboBox().set().byText(arg0);
    }

    @And("O usuario preenche o campo Start Date com {string}")
    public void oUsuarioPreencheOCampoStartDateCom(String arg0) {
        log().setLocator(enterProductData);
        find(enterInsurantDataLabelStartDate).send().text(arg0);
    }

    @And("O usuario seleciona o combobox do campo Insurance Sum com {string}")
    public void oUsuarioSelecionaOComboboxDoCampoInsuranceSumCom(String arg0) {
        log().setLocator(enterProductData);
        find(enterInsurantDataSelectInsuranceSum).comboBox().set().byText(arg0);
    }

    @And("O usuario seleciona a opcao Euro Protection do campo Optional Products")
    public void oUsuarioSelecionaAOpcaoEuroProtectionDoCampoOptionalProducts() {
        log().setLocator(enterProductData);
        find(enterInsurantDataLabelEuroProtection).click();
    }

    @And("O usuario seleciona o combobox do campo Courtesy Car com {string}")
    public void oUsuarioSelecionaOComboboxDoCampoCourtesyCarCom(String arg0) {
        log().setLocator(enterProductData);
        find(enterInsurantDataSelectCourtesyCar).comboBox().set().byText(arg0);
    }

    @And("O usuario seleciona o combobox do campo Merit Rating com {string}")
    public void oUsuarioSelecionaOComboboxDoCampoMeritRatingCom(String arg0) {
        log().setLocator(enterProductData);
        find(enterInsurantDataSelectMeritRating).comboBox().set().byText(arg0);
    }

    @And("O usuario valida obrigatoriedade de campos na aba Enter Product Data")
    public void oUsuarioValidaObrigatoriedadeDeCamposNaAbaEnterProductData() {
        log().setLocator(enterInsurantData);
        sleep().setMaxTime(300);
        if (find(enterInsurantDataSpanValidaCamposObrigatorios).count() > 0){
            evidence("Campos obrigatorios não preenchidos ou não preenchidos corretamente");
            error().Fail();
        }
        sleep().setDefaultTime();
        log().type("Campos obrigatorios preenchidos corretamente");
    }

    @And("O usuario clica no botao Next na aba Enter Product Data")
    public void oUsuarioClicaNoBotaoNextNaAbaEnterProductData() {
        log().setLocator(enterProductData);
        if (find(enterInsurantDataButtonNextSelectPriceoption).exists()){
            find(enterInsurantDataButtonNextSelectPriceoption).click();
        }
    }
}




















//























//


























//