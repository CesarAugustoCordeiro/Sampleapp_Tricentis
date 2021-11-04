package produtos.sampleapp_tricentis.objetos;

import java.util.LinkedHashMap;

public class Enter_Vehicle_Data {

    //Text
    public static String enterVehicleDataTextPaginaEnterVehicleData = "//a[text()=\"arg0\"]";

    //Label
    public static String enterVehicleDataLabelMake = "//label[contains(., \"Make\")]";
    public static String enterVehicleDataLabelModel = "//label[contains(., \"Model\")]";
    public static String enterVehicleDataLabelCylinderCapacity = "//label[contains(., \"Cylinder Capacity [ccm]\")]";
    public static String enterVehicleDataLabelEnginePerformance = "//label[contains(., \"Engine Performance [kW]\")]";
    public static String enterVehicleDataLabelDateOfManufacture = "//label[contains(., \"Date of Manufacture\")]";
    public static String enterVehicleDataLabelNumberOfSeats = "(//label[contains(., \"Number of Seats\")])[1]";
    public static String enterVehicleDataLabelNumberofSeats = "(//label[contains(., \"Number of Seats\")])[2]";
    public static String enterVehicleDataLabelListPrice = "//label[contains(., \"List Price [$]\")]";
    public static String enterVehicleDataLabelAnnualMileage = "//label[contains(., \"Annual Mileage [mi]\")]";
    public static String enterVehicleDataLabelRightHandDrive = "//label[contains(., \"Right Hand Drive\")]";
    public static String enterVehicleDataLabelFuelType = "//label[contains(., \"Fuel Type\")]";
    public static String enterVehicleDataLabelPayload = "//label[contains(., \"Payload [kg]\")]";
    public static String enterVehicleDataLabelTotalWeight = "//label[contains(., \"Total Weight [kg]\")]";
    public static String enterVehicleDataLabelLicensePlateNumber = "//label[contains(., \"License Plate Number\")]";
    public static String enterVehicleDataLabelRightHandDriveYes = "//label[contains(., \"Yes\")]";

    //Button
    public static String enterVehicleDataButtonNext = "//button[@id=\"nextenterinsurantdata\"]";


    //Select
    public static String enterVehicleDataSelectMake = "//select[@id=\"make\"]";
    public static String enterVehicleDataSelectModel = "//select[@id=\"model\"]";
    public static String enterVehicleDataSelectNumberOfSeats = "//select[@id=\"numberofseats\"]";
    public static String enterVehicleDataSelectNumberofSeats = "//select[@id=\"numberofseatsmotorcycle\"]";
    public static String enterVehicleDataSelectFuelType = "//select[@id=\"fuel\"]";

    //Input
    public static String enterVehicleDataInputCylinderCapacity = "//input[@id=\"cylindercapacity\"]";
    public static String enterVehicleDataInputEnginePerformance = "//input[@id=\"engineperformance\"]";
    public static String enterVehicleDataInputDateofManufacture = "//input[@id=\"dateofmanufacture\"]";
    public static String enterVehicleDataInputPayload = "//input[@id=\"payload\"]";
    public static String enterVehicleDataInputTotalWeight = "//input[@id=\"totalweight\"]";
    public static String enterVehicleDataInputListPrice = "//input[@id=\"listprice\"]";
    public static String enterVehicleDataInputLicensePlateNumber = "//input[@id=\"licenseplatenumber\"]";
    public static String enterVehicleDataInputAnnualMileage = "//input[@id=\"annualmileage\"]";


    //Span
    public static String enterVehicleDataSpanValidacaoObrigatoriedadeEnterVehicleData = "//a[@id=\"entervehicledata\"]/span[@class=\"counter\"]";


    public static LinkedHashMap<String, String> enterVehicleData = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();

        //Text
        ret.put(enterVehicleDataTextPaginaEnterVehicleData, "Enter Vehicle Data");

        //Label
        ret.put(enterVehicleDataLabelMake, "Make");
        ret.put(enterVehicleDataLabelModel, "Model");
        ret.put(enterVehicleDataLabelCylinderCapacity, "Cylinder Capacity [ccm]");
        ret.put(enterVehicleDataLabelEnginePerformance, "Engine Performance [kW]");
        ret.put(enterVehicleDataLabelDateOfManufacture, "Date of Manufacture");
        ret.put(enterVehicleDataLabelNumberOfSeats, "Number of Seats");
        ret.put(enterVehicleDataLabelNumberofSeats, "Number of Seats");
        ret.put(enterVehicleDataLabelListPrice, "List Price [$]");
        ret.put(enterVehicleDataLabelAnnualMileage, "Annual Mileage");
        ret.put(enterVehicleDataLabelRightHandDrive, "Right Hand Drive");
        ret.put(enterVehicleDataLabelFuelType, "Fuel Type");
        ret.put(enterVehicleDataLabelPayload, "Payload");
        ret.put(enterVehicleDataLabelTotalWeight, "Total Weight [kg]");
        ret.put(enterVehicleDataLabelLicensePlateNumber, "License Plate Number");
        ret.put(enterVehicleDataLabelRightHandDriveYes, "Yes");

        //Button
        ret.put(enterVehicleDataButtonNext, "Next");

        //Select
        ret.put(enterVehicleDataSelectMake, "Make");
        ret.put(enterVehicleDataSelectModel, "Model");
        ret.put(enterVehicleDataSelectNumberOfSeats, "Number Of Seats");
        ret.put(enterVehicleDataSelectNumberofSeats, "Number Of Seats");
        ret.put(enterVehicleDataSelectFuelType, "Fuel Type");

        //Input
        ret.put(enterVehicleDataInputCylinderCapacity, "Cylinder Capacity");
        ret.put(enterVehicleDataInputEnginePerformance, "Engine Performance");
        ret.put(enterVehicleDataInputDateofManufacture, "Date of Manufacture");
        ret.put(enterVehicleDataInputPayload, "Payload");
        ret.put(enterVehicleDataInputTotalWeight, "Total Weight");
        ret.put(enterVehicleDataInputListPrice, "List Price");
        ret.put(enterVehicleDataInputLicensePlateNumber, "License PlateNumber");
        ret.put(enterVehicleDataInputAnnualMileage, "Annual Mileage");

        //Span
        ret.put(enterVehicleDataSpanValidacaoObrigatoriedadeEnterVehicleData, "Validacao Obrigatoriedade de Campos");

        return ret;
    }
}
