public class Taxi extends PublicTransportation implements Vehicle {

    final int MAX_PASSENGER = 4;
    final int MAX_SPEED = 200;
    private String destination;
    private int distance;



    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    private int fee;
    private int cumulativeFee;
    final int BASIC_RATE_DISTANCE = 2;
    final int BASIC_RATE = 3000;



    Taxi() {
        super();
    }

    @Override

    public int getFuel() {
        if (this.fuel <= RETURN_FUEL) {
            setMode();
            System.out.println("주유가 필요합니다!");
            return this.fuel;
        }
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        if (this.fuel + fuel < 0 || this.fuel + fuel > MAX_FUEL) {
            System.out.println("에러! 변경하려는 연료량은 " + fuel + ", 적정 연료량은 0이상 " + MAX_FUEL + " 이하입니다. 현재 연료 : " + getFuel());
        } else {

            this.fuel += fuel;
        }
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void setSpeed(int speed) {
        if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
            System.out.println("에러! 변경하려는 속도는 " + speed +  ", 적정 속도는 0 이상 " + MAX_SPEED + " 이하입니다. " + "현재 속력 : " + getSpeed());
        } else {
            this.speed = speed;
        }
    }

    @Override
    public int getPassengerNum() {
        return this.passengerNum;
    }

    @Override
    public void setPassengerNum(int passengerNum) {
        if (this.passengerNum + passengerNum < 0 || this.passengerNum + passengerNum > MAX_PASSENGER) {
            System.out.println("에러! 최대 승객 수를 초과했습니다.");
        } else {
            System.out.println(passengerNum + " 명이 탑승합니다.");
            this.passengerNum += passengerNum;
        }
    }

    @Override
    public int getFee() {
        return this.fee;
    }

    public int getBASIC_RATE() {
        return BASIC_RATE;
    }

    public void setFee(int distance) {
        if (distance >= BASIC_RATE_DISTANCE) {
            this.fee = BASIC_RATE + (1000 * getDistance());
        } else {
            this.fee = BASIC_RATE;
        }
    }

    @Override
    public int getFreeSeat() {
        return this.MAX_PASSENGER - getPassengerNum();
    }

    public String getDestination() {
        return destination;
    }


    public int getCumulativeFee() {
        return cumulativeFee;
    }



    public void setDestination(String destination, int distance) {
        this.destination = destination;
        setDistance(distance);
        setFee(distance);
    }

    public void takeFee() {

        setCulmulativeFee();
        this.passengerNum = 0;
    }

    public void setCulmulativeFee() {
        this.cumulativeFee =  getFee();
    }


}
