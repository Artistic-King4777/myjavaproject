package mobiledevice;

public class Main {
    public static void main(String[] args) {

        MobileDevice tabletOne = new Tablet("Google", "Samsung Galaxy Note S3", "Android Popcorn",
                499.99, 9.7,  new String[]{"Chrome, Youtube, Google Play"});



        MobileDevice tabletTwo = new Tablet("Apple", "iPad Pro", "iOS", 1248.00, 12.9,
                new String[]{"iTunes, ibisPaint X, Fortnight Mobile"});



        MobileDevice[] tablets = new MobileDevice[]{tabletOne, tabletTwo};
        for(MobileDevice tablet : tablets){
            System.out.print("\n" + "Device: " + tablet.getDevice() + "\n" + "Top Apps: " + tablet.listMyApps() +
                    tablet.calculateDiscount(65) + "\n");
        }


    }
}
