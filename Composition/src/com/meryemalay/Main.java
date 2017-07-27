package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        Dimensions dimesions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimesions);

        Monitor theMonitor = new Monitor("27 inch Beast","Acer", 27, new Resolution(2540, 1440));

        Motherboard theMoterboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMoterboard);
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Window 1.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();

        //Where you should be using inheritance, Where you should be using composition
        //As a general rule, when you're designing your program in Java, you probably want to look at composition first.
        // to look at using composition before inheritance
        // And it does give you the added advantages and more flexibility.


        Television television = new Television("Samsung", 51);
        Sofa sofa = new Sofa("mudo", "coton");
        LivingRoom livingRoom = new LivingRoom(television, sofa, 4, true);
        livingRoom.getSofa().getFabric();
        livingRoom.openTv();
    }
}
