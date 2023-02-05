public class Bus extends PublicTransportation implements Vehicle {

    final int MAX_SPEED = 80;
    final int MAX_PASSENGER = 30;
    final int FARE = 1000;

    public Bus() {
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
        // setter 찾아보기
        if (this.fuel + fuel < 0 || this.fuel + fuel > MAX_FUEL) {
            System.out.println("에러! 변경하려는 연료량은 " + fuel + ", 적정 연료량은 0이상 " + MAX_FUEL + " 이하입니다. 현재 연료 : " + getFuel());
        } else {

            this.fuel += fuel;
        }
    }

    @Override
    public int getSpeed() {
        return this.speed;
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
        return getPassengerNum() * FARE;
    }

    @Override
    public int getFreeSeat() {
        return this.MAX_PASSENGER - getPassengerNum();
    }

    @Override
    public String toString() {
        return "Bus{" +
                "fuel=" + fuel +
                ", speed=" + speed +
                ", passengerNum=" + passengerNum +
                '}';
    }

    //    public void setFuel(int fuel) {
//        if (this.fuel + fuel < 0 || this.fuel + fuel > MAX_FUEL) {
//            System.out.println("연료량은 0이상 " + MAX_FUEL + " 이하입니다. 현재 연료 : " + getFuel());
//        }
//        if (this.fuel + fuel <= RETURN_FUEL) {
//            setMode();
//            System.out.println("주유가 필요합니다!");
//        }
//        this.fuel += fuel;
//    }
//
//    public void setSpeed(int speed) {
//        if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
//            System.out.println("속도는 0 이상 " + MAX_SPEED + " 이하입니다. " + "현재 속력 : " + getSpeed());
//        }
//        this.speed = speed;
//    }
//
//    public void setPassengerNum(int passengerNum) {
//        if (this.passengerNum + passengerNum < 0 || this.passengerNum + passengerNum > MAX_PASSENGER) {
//            System.out.println("승객은 0 이상 " + MAX_PASSENGER + " 이하입니다. " + "현재 승객 :" + getPassengerNum());
//        }
//        System.out.println(passengerNum + " 명이 탑승합니다.");
//        this.passengerNum += passengerNum;
//        System.out.println("탑승 승객 수 : " + getPassengerNum());
//        System.out.println("잔여 승객 수 : " + (MAX_PASSENGER - getPassengerNum()));
//        System.out.println("요금 확인 : " + getPassengerNum() * 1000);
//    }
}
