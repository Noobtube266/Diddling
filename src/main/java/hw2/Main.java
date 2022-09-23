package hw2;

public class Main {
    public static void main(String[] args) {

        Resolution resolution = new Resolution(2560,1600);
        Monitor monitor = new Monitor(resolution, "Pro", "Apple");
        Dimension dimension = new Dimension(11, 13, 8);
        Case case1 = new Case("13-inch","apple","Thunderbolt",dimension);
        MotherBoard motherBoard = new MotherBoard("Pro","Apple",10, 25,"Firmware");

        PC MacBookPro = new PC(case1, motherBoard, monitor);

        MacBookPro.description();
        MacBookPro.powerUp();
    }

}
