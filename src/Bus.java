public class Bus extends PublicTransportation {

    final int MAX_SPEED = 50;
    final int MAX_PASSENGER = 30;

    public Bus() {
        super();
    }

    public void setFuel(int fuel) {
        if (this.fuel + fuel < 0 || this.fuel + fuel > MAX_FUEL) {
            System.out.println("연료량은 0이상 " + MAX_FUEL + " 이하입니다. 현재 연료 : " + getFuel());
        }
        if (this.fuel + fuel <= RETURN_FUEL) {
            setMode();
            System.out.println("주유가 필요합니다!");
        }
        this.fuel += fuel;

    }

    public void setSpeed(int speed) {
        if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
            System.out.println("속도는 0 이상 " + MAX_SPEED + " 이하입니다. " + "현재 속력 : " + getSpeed());
        }
        this.speed = speed;
    }

    public void setPassengerNum(int passengerNum) {
        if (this.passengerNum + passengerNum < 0 || this.passengerNum + passengerNum > MAX_PASSENGER) {
            System.out.println("승객은 0 이상 " + MAX_PASSENGER + " 이하입니다. " + "현재 승객 :" + getPassengerNum());
        }
        System.out.println(passengerNum + " 명이 탑승합니다.");
        this.passengerNum += passengerNum;
        System.out.println("탑승 승객 수 : " + getPassengerNum());
        System.out.println("잔여 승객 수 : " + (MAX_PASSENGER - getPassengerNum()));
        System.out.println("요금 확인 : " + getPassengerNum() * 1000);
    }
}
