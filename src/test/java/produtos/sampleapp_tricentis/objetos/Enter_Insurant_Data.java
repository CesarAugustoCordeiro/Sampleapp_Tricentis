package produtos.sampleapp_tricentis.objetos;

import java.util.LinkedHashMap;

public class Enter_Insurant_Data {

    //Label
    public static String enterInsurantDataLabelHobbiesSpeeding = "//label[contains(., \"Speeding\")]";
    public static String enterInsurantDataLabelMale = "//label[contains(., \"Male\")]";

    //Button
    public static String enterInsurantDataButtonNext = "//button[@id=\"nextenterproductdata\"]";


    //Select
    public static String enterInsurantDataSelectCountry = "//select[@id=\"country\"]";
    public static String enterInsurantDataSelectOccupation = "//select[@id=\"occupation\"]";


    //Input
    public static String enterInsurantDataInputFirstName = "//input[@id=\"firstname\"]";
    public static String enterInsurantDataInputLastName = "//input[@id=\"lastname\"]";
    public static String enterInsurantDataInputBirthDate = "//input[@id=\"birthdate\"]";
    public static String enterInsurantDataInputStreetAddress = "//input[@id=\"streetaddress\"]";
    public static String enterInsurantDataInputZipCode = "//input[@id=\"zipcode\"]";
    public static String enterInsurantDataInputCity = "//input[@id=\"city\"]";
    public static String enterInsurantDataInputWebSite = "//input[@id=\"website\"]";


    //Span
    public static String enterInsurantDataSpanValidacaoCamposObrigatorios = "//a[@id=\"enterinsurantdata\"]/span[@class=\"counter\"]";


    public static LinkedHashMap<String, String> enterInsurantData = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();

        //Label
        ret.put(enterInsurantDataLabelHobbiesSpeeding, "Speeding");
        ret.put(enterInsurantDataLabelMale, "Male");

        //Button
        ret.put(enterInsurantDataButtonNext, "Next");

        //Select
        ret.put(enterInsurantDataSelectCountry, "Country");
        ret.put(enterInsurantDataSelectOccupation, "Occupation");


        //Input
        ret.put(enterInsurantDataInputFirstName, "First Name");
        ret.put(enterInsurantDataInputLastName, "Last Name");
        ret.put(enterInsurantDataInputBirthDate, "Birth Date");
        ret.put(enterInsurantDataInputStreetAddress, "Street Address");
        ret.put(enterInsurantDataInputZipCode, "Zip Code");
        ret.put(enterInsurantDataInputCity, "City");
        ret.put(enterInsurantDataInputWebSite, "Website");


        //Span
        ret.put(enterInsurantDataSpanValidacaoCamposObrigatorios, "Website");


        return ret;
    }
}
