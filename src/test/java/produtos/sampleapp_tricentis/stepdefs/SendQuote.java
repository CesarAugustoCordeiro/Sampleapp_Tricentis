package produtos.sampleapp_tricentis.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import support.CoreWeb;

import static produtos.sampleapp_tricentis.objetos.Select_Price_Option.selectPriceOption;
import static produtos.sampleapp_tricentis.objetos.Select_Price_Option.selectPriceOptionValidaCamposObrigatorios;
import static produtos.sampleapp_tricentis.objetos.SendQuote.*;

public class SendQuote extends CoreWeb {

    @And("O usuario preenche o campo Password com {string}")
    public void oUsuarioPreencheOCampoPasswordCom(String arg0) {
        log().setLocator(sendQuote);
        find(sendQuoteInputPassword).send().text(arg0);
    }

    @And("O usuario preenche o campo Username com {string}")
    public void oUsuarioPreencheOCampoUsernameCom(String arg0) {
        log().setLocator(sendQuote);
        find(sendQuoteInputUsername).send().text(arg0);
    }

    @And("O usuario preenche o campo Phone com {string}")
    public void oUsuarioPreencheOCampoPhoneCom(String arg0) {
        log().setLocator(sendQuote);
        find(sendQuoteInputPhone).send().text(arg0);
    }

    @And("O usuario preenche o campo Email com {string}")
    public void oUsuarioPreencheOCampoEmailCom(String arg0) {
        log().setLocator(sendQuote);
        find(sendQuoteInputEmail).send().text(arg0);
    }

    @And("O usuario preenche o campo Confirm Password com {string}")
    public void oUsuarioPreencheOCampoConfirmPasswordCom(String arg0) {
        log().setLocator(sendQuote);
        find(sendQuoteInputConfirmPassword).send().text(arg0);
    }

    @And("O usuario preenche o campo Comments com {string}")
    public void oUsuarioPreencheOCampoCommentsCom(String arg0) {
        log().setLocator(sendQuote);
        find(sendQuoteInputComments).send().text(arg0);
    }

    @And("O usuario valida obrigatoriedade de campos na aba Send Quote")
    public void oUsuarioValidaObrigatoriedadeDeCamposNaAbaSendQuote() {
        log().setLocator(sendQuote);
        sleep().setMaxTime(300);
        if (find(sendQuoteSpanButton).count() > 0){
            evidence("Campos obrigatorios não preenchidos ou não preenchidos corretamente");
            error().Fail();
        }
        sleep().setDefaultTime();
        log().type("Campos obrigatorios preenchidos corretamente");
    }

    @And("O usuario clica no botao Send na aba Send Quote")
    public void oUsuarioClicaNoBotaoSendNaAbaSendQuote() {
        log().setLocator(sendQuote);
        if (find(sendQuoteButton).exists()){
            find(sendQuoteButton).click();
        }
    }

    @Then("O usuario valida mensagem Sending e-mail success")
    public void oUsuarioValidaMensagemSendingEMailSuccess() {
        log().setLocator(sendQuote);
        if (find(selectPriceOptionValidaValidacao).exists()){
        }else {
            evidence("Não foi retornado o dado esperado");
            error().Fail();
        }
    }
}




















//























//


























//