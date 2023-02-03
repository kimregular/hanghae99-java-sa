public abstract class PublicTransportation {
    private static int serialNum = 0;
    private int vehicleNum;
    final int MAX_FUEL = 100;
    final int RETURN_FUEL = 10;
    // RETURN_FUEL(10) 이하로 fuel이 떨어지면 mode가 변경된다.
    // mode : true -> false, false 가 되면 차고지행으로 모드 출력됨

    int fuel = 100;
    int speed = 0;
    int passengerNum = 0;
    private boolean mode = true;

    PublicTransportation() {
        serialNum++;
        vehicleNum = serialNum;
    }

    private boolean isMode() {
        return mode;
    }

    public void setMode() {
        this.mode = !mode;
    }

    public String getMode() {
        return isMode() ? "운행중" : "차고지행";
    }

    public int getVehicleNum() {
        return vehicleNum;
    }


}
