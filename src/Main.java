public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        System.out.println("bus1 num : " + bus1.getVehicleNum());
        Bus bus2 = new Bus();
        System.out.println("bus2 num : " + bus2.getVehicleNum());
        Bus bus3 = new Bus();
        System.out.println("bus3 num : " + bus3.getVehicleNum());
        System.out.println();

        bus1.setPassengerNum(2);
        System.out.println("bus1 passengers : " + bus1.getPassengerNum());
        System.out.println("bus1 잔여좌석 : " + bus1.getFreeSeat());
        bus1.setPassengerNum(29);
        System.out.println("bus1 passengers : " + bus1.getPassengerNum());

        System.out.println();
        System.out.println("bus1 fuel : " + bus1.getFuel());
        System.out.println("bus1 mode : " + bus1.getMode());

        bus1.setFuel(-50);
        System.out.println("bus1 fuel : " + bus1.getFuel());
        System.out.println("bus1 mode : " + bus1.getMode());
        System.out.println();

        bus1.setPassengerNum(29);
        System.out.println("bus1 passengers : " + bus1.getPassengerNum());
        bus1.setPassengerNum(5);
        System.out.println("bus1 passengers : " + bus1.getPassengerNum());
        bus1.setFuel(-45);
        System.out.println("bus1 fuel : " + bus1.getFuel());
        System.out.println("bus1 mode : " + bus1.getMode());
        System.out.println(bus1);
        System.out.println();

//        ..........................

        Taxi taxi1 = new Taxi();
        System.out.println("taxi1 num : " + taxi1.getVehicleNum());
        Taxi taxi2 = new Taxi();
        System.out.println("taxi2 num : " + taxi2.getVehicleNum());
        System.out.println();

        System.out.println("taxi1 fuel : " + taxi1.getFuel());
        System.out.println("taxi1 mode : " + taxi1.getMode());
        System.out.println();

        taxi1.setPassengerNum(2);
        System.out.println("taxi1 freeSeat : " +taxi1.getFreeSeat());
        System.out.println("taxi1 Basic rate : "+taxi1.BASIC_RATE);
        taxi1.setDestination("서울역", 2);
        System.out.println("taxi1 destination : "+taxi1.getDestination());
        System.out.println("taxi1 distance : " + taxi1.getDistance()+ " km");
        System.out.println("taxi1 fee : " + taxi1.getFee());
        System.out.println("taxi1 mode : "+taxi1.getMode());
        System.out.println();

        taxi1.setFuel(-80);
        taxi1.takeFee();
        System.out.println("taxi1 fuel : " +taxi1.getFuel());
        System.out.println("taxi1 cumulative Fee : "+taxi1.getCumulativeFee());
        System.out.println();

        taxi1.setPassengerNum(5);
        taxi1.setPassengerNum(3);
        System.out.println("taxi1 freeSeat : " +taxi1.getFreeSeat());
        System.out.println("taxi1 Basic rate : "+taxi1.BASIC_RATE);
        taxi1.setDestination("구로디지털단지", 12);
        System.out.println("taxi1 destination : "+taxi1.getDestination());
        System.out.println("taxi1 distance : " + taxi1.getDistance()+ " km");
        System.out.println("taxi1 fee : " + taxi1.getFee());
        System.out.println("taxi1 mode : "+taxi1.getMode());
        System.out.println();

        taxi1.setFuel(-20);
        taxi1.takeFee();
        System.out.println("taxi1 fuel : " +taxi1.getFuel());
        System.out.println("taxi1 mode : "+taxi1.getMode());
        System.out.println("taxi1 cumulative Fee : "+taxi1.getCumulativeFee());

    }
}
