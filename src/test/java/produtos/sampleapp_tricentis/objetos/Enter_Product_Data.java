package produtos.sampleapp_tricentis.objetos;

import java.util.LinkedHashMap;

public class Enter_Product_Data {

    //Label
    public static String enterInsurantDataLabelStartDate = "//input[@id=\"startdate\"]";
    public static String enterInsurantDataLabelEuroProtection = "//label[text()=\"Euro Protection\"]";

    //Button
    public static String enterInsurantDataButtonNextSelectPriceoption = "//button[@id=\"nextselectpriceoption\"]";


    //Select
    public static String enterInsurantDataSelectDamageInsurance = "//select[@id=\"damageinsurance\"]";
    public static String enterInsurantDataSelectInsuranceSum = "//select[@id=\"insurancesum\"]";
    public static String enterInsurantDataSelectCourtesyCar = "//select[@id=\"courtesycar\"]";
    public static String enterInsurantDataSelectMeritRating = "//select[@id=\"meritrating\"]";



    //Input


    //Span
    public static String enterInsurantDataSpanValidaCamposObrigatorios = "//a[@id=\"enterproductdata\"]/span[@class=\"counter\"]";


    public static LinkedHashMap<String, String> enterProductData = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();

        //Label
        ret.put(enterInsurantDataLabelStartDate, "Start Date");
        ret.put(enterInsurantDataLabelEuroProtection, "Euro Protection");

        //Button
        ret.put(enterInsurantDataButtonNextSelectPriceoption, "Speeding");

        //Select
        ret.put(enterInsurantDataSelectDamageInsurance, "Speeding");
        ret.put(enterInsurantDataSelectInsuranceSum, "Insurance Sum");
        ret.put(enterInsurantDataSelectCourtesyCar, "Courtesy Car");
        ret.put(enterInsurantDataSelectMeritRating, "Merit Rating");



        //Input



        //Span
        ret.put(enterInsurantDataSpanValidaCamposObrigatorios, "Valida Campos Obrigatorios");


        return ret;
    }
}
