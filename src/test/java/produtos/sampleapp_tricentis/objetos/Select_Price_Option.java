package produtos.sampleapp_tricentis.objetos;

import java.util.LinkedHashMap;

public class Select_Price_Option {

    //Input
    public static String selectPriceOptionInputSelectUltimate = "//input[@id=\"selectultimate\"]/ancestor::label";

    //Button
    public static String selectPriceOptionButtonNext = "//button[@id=\"nextsendquote\"]";

    //Span
    public static String selectPriceOptionValidaCamposObrigatorios = "//a[@id=\"selectpriceoption\"]/span[@class=\"counter\"]";






    public static LinkedHashMap<String, String> selectPriceOption = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();

        //Input
        ret.put(selectPriceOptionInputSelectUltimate, "Select Ultimate");

        //Button
        ret.put(selectPriceOptionButtonNext, "Next");

        //Span
        ret.put(selectPriceOptionValidaCamposObrigatorios, "Validacao de campos obrigatorios");




        return ret;
    }
}
