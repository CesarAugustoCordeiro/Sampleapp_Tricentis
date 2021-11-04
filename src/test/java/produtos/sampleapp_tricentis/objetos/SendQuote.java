package produtos.sampleapp_tricentis.objetos;

import java.util.LinkedHashMap;

public class SendQuote {

    //Input
    public static String sendQuoteInputEmail = "//input[@id=\"email\"]";
    public static String sendQuoteInputPhone = "//input[@id=\"phone\"]";
    public static String sendQuoteInputUsername = "//input[@id=\"username\"]";
    public static String sendQuoteInputPassword = "//input[@id=\"password\"]";
    public static String sendQuoteInputConfirmPassword = "//input[@id=\"confirmpassword\"]";
    public static String sendQuoteInputComments = "//textarea[@id=\"Comments\"]";

    //Button
    public static String sendQuoteButton = "//button[@id=\"sendemail\"]";

    //Span
    public static String sendQuoteSpanButton = "//a[@id=\"sendquote\"]/span[@class=\"counter\"]";

    //Text
    public static String selectPriceOptionValidaValidacao = "//h2[text()=\"Sending e-mail success!\"]";




    public static LinkedHashMap<String, String> sendQuote = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();

        //Input
        ret.put(sendQuoteInputEmail, "Email");
        ret.put(sendQuoteInputPhone, "phone");
        ret.put(sendQuoteInputUsername, "username");
        ret.put(sendQuoteInputPassword, "password");
        ret.put(sendQuoteInputConfirmPassword, "confirmpassword");


        //Button
        ret.put(sendQuoteButton, "Button");

        //Span
        ret.put(sendQuoteSpanButton, "Button");

        //Text
        ret.put(selectPriceOptionValidaValidacao, "Validacao");


        return ret;
    }
}
