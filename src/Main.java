public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        System.out.println("bus1 num : " + bus1.getVehicleNum());
        Bus bus2 = new Bus();
        System.out.println("bus2 num :" + bus2.getVehicleNum());
        System.out.println();

        bus1.setPassengerNum(2);
//        bus1.setPassengerNum(29);
        System.out.println();
        System.out.println("bus1 fuel : " + bus1.getFuel());
        System.out.println("bus1 mode : " + bus1.getMode());
        bus1.setFuel(-50);
        System.out.println("bus1 fuel : " + bus1.getFuel());
        System.out.println("bus1 mode : " + bus1.getMode());
        System.out.println();

        bus1.setMode();
        System.out.println("bus1 mode : " + bus1.getMode());
        System.out.println("bus1 fuel : " + bus1.getFuel());
        bus1.setMode();
        System.out.println("bus1 mode : " + bus1.getMode());
        System.out.println();

//        bus1.setPassengerNum(29);
        bus1.setPassengerNum(5);
        bus1.setFuel(-45);
        System.out.println("bus1 fuel : " +bus1.getFuel());
    }
}
