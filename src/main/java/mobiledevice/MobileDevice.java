package mobiledevice;

public class MobileDevice {

    private String manufacturer;
    private String device;
    protected String operatingSystem; //os
    private double cost;              // price

    //constructor
    public MobileDevice(String manufacturer, String device, String os, double cost){
        this.manufacturer = manufacturer;
        this.device = device;
        this.operatingSystem = os;
        this.cost = cost;
    }



    //methods
    public String calculateDiscount(double discount){
        return "\n" + "Price is: $" + cost * (discount / 100) + "\n";
    }







    //getter setter methods

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDevice() {
        return device;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double getCost() {
        return cost;
    }

    public String listMyApps(){
        return "";

    }


//    public void setManufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }
//
//    public void setDevice(String device) {
//        this.device = device;
//    }
//
//    public void setOperatingSystem(String operatingSystem) {
//        this.operatingSystem = operatingSystem;
//    }
//
//    public void setCost(double cost) {
//        this.cost = cost;
//    }

}
