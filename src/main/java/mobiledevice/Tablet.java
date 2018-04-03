package mobiledevice;

import java.util.Arrays;

public class Tablet extends MobileDevice {

    private double screenSize;     //ss
    private String[] topThreeApps; //tta

    public Tablet(String manufacturer, String device, String os, double cost, double ss, String[] tta){
        super(manufacturer, device, os, cost);
        this.screenSize = ss;
        this.topThreeApps = tta;
    }

    @Override
    public String listMyApps(){
        return Arrays.toString(topThreeApps);

    }
}
