//택시 시작
    public class Texi extends Sa {

    String destination;  //목적지
    int destinationDistance;
    int defaultRate = 3000;
    int defaultDistance = 1; //기본거리
    int distanceRate = 1000;
    int currentFuel_volume;

    public Texi(int taxiNum) {
        super.StartOperation("일반");
        super.number = taxiNum;
        super.maxPassenger = 4;
        super.fuelvolume = 100;
        super.speed = 0;
        System.out.println(taxiNum + "번 택시가 생성되었습니다.");
    }

    //메서드 - 번호 확인
    public void numberComparison(int taxiNum) {
        System.out.println("차량번호는 : " + this.number);
    }

    public void start(int taxinum) {
        System.out.println(taxinum + "번 택시 출발");
    }

    //메서드 - 승객탑승  -택시
    public void PassengerBo(int newPassenger) {
        this.CurrentPassenger = 0;
        this.price = 3000;
        this.maxPassenger = 4;
        if (station.equals("일반") && newPassenger <= maxPassenger) {
            this.CurrentPassenger += newPassenger;
            System.out.println("탑승 승객 수 =" + newPassenger);
            System.out.println("잔여 승객 수 =" + CurrentPassenger);
            System.out.println("기본 요금 확인 =" + price);
            System.out.println("목적지 =" + destination);
            System.out.println("목적지까지 거리 =" + destinationDistance + "km");
            station = "운행중";
        } else {
            System.out.println("최대 승객 수 초과");
        }
    }

    //메서드 주유 기능
    public void oiling(int oil) {
        if (oil >= 0) { //주유 시 차고지 행
            station = "차고지행";
            System.out.println("상태 : " + station);
        }
        currentFuel_volume += oil;
        System.out.println("주유량 " + currentFuel_volume);

        if (currentFuel_volume < 10) { //연료 10미만
            System.out.println("주유 필요");
            System.out.println("주유량을 확인해주세요");
            station = "차고지행";

        } else {
            station = "운행중";
        }
    }

    // 메서드 상태 변경
    public void StateChange(String StartOperation) {

    }

    // 거리당 요금
    public void distanceRatePlus(int distanceRate) {

        price = 3000 + (destinationDistance - 1) * 1000;
        System.out.println("지불할 금액 =" + price);
        System.out.println("상태 =" + station);
    }

    // 결제
    public void payment() {
        System.out.println("현재 금액은" + getPrice() + "원입니다.");
        this.CurrentPassenger = 0;
    }

    @Override
    public void StateChange() {
        super.StateChange();
        if (fuelvolume < 10) {
            this.station = "운행 불가";
        }

    }

    //--택시 기능 get/set
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDestinationDistance() {
        return destinationDistance;
    }

    public void setDestinationDistance(int destinationDistance) {
        this.destinationDistance = destinationDistance;
    }

    public int getDefaultRate() {
        return defaultRate;
    }

    public void setDefaultRate(int defaultRate) {
        this.defaultRate = defaultRate;
    }

    public int getDefaultDistance() {
        return defaultDistance;
    }

    public void setDefaultDistance(int defaultDistance) {
        this.defaultDistance = defaultDistance;
    }

    public int getDistanceRate() {
        return distanceRate;
    }

    public void setDistanceRate(int distanceRate) {
        this.distanceRate = distanceRate;
    }

    public String StartOperation() {
        return StartOperation();
    }

    @Override
    public void StartOperation(String station) {
        super.StartOperation(station);
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        super.setNumber(number);
    }

    @Override
    public int getMaxPassenger() {
        return super.getMaxPassenger();
    }

    @Override
    public void setMaxPassenger(int maxPassenger) {
        super.setMaxPassenger(maxPassenger);
    }

    @Override
    public int getFuelvolume() {
        return super.getFuelvolume();
    }

    @Override
    public void setFuelvolume(int fuelvolume) {
        super.setFuelvolume(fuelvolume);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }
}



