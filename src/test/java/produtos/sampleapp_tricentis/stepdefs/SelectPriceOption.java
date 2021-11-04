package produtos.sampleapp_tricentis.stepdefs;

import cucumber.api.java.en.And;
import support.CoreWeb;

import static produtos.sampleapp_tricentis.objetos.Enter_Insurant_Data.enterInsurantData;
import static produtos.sampleapp_tricentis.objetos.Enter_Product_Data.enterInsurantDataSpanValidaCamposObrigatorios;
import static produtos.sampleapp_tricentis.objetos.Select_Price_Option.*;

public class SelectPriceOption extends CoreWeb {

    @And("O usuario seleciona a opcao Unlimited")
    public void oUsuarioSelecionaAOpcaoUnlimited() {
        log().setLocator(selectPriceOption);
        find(selectPriceOptionInputSelectUltimate).exists();
        find(selectPriceOptionInputSelectUltimate).click();
    }

    @And("O usuario clica no botao Next na aba Select Price Option")
    public void oUsuarioClicaNoBotaoNextNaAbaSelectPriceOption() {
        log().setLocator(selectPriceOption);
        if (find(selectPriceOptionButtonNext).exists()){
            find(selectPriceOptionButtonNext).click();
        }
    }

    @And("O usuario valida obrigatoriedade de campos na aba Select Price Option")
    public void oUsuarioValidaObrigatoriedadeDeCamposNaAbaSelectPriceOption() {
        log().setLocator(selectPriceOption);
        sleep().setMaxTime(300);
        if (find(selectPriceOptionValidaCamposObrigatorios).count() > 0){
            evidence("Campos obrigatorios não preenchidos ou não preenchidos corretamente");
            error().Fail();
        }
        sleep().setDefaultTime();
        log().type("Campos obrigatorios preenchidos corretamente");
    }
}




















//























//


























//