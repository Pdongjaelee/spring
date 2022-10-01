public class Bus extends Sa {

    int currentPassenger =28 ;

    public Bus(int busNum) {
        super.StartOperation("차고지행");
        super.number = busNum;
        super.fuelvolume = 100;
        super.speed = 0;
        super.maxPassenger = 30;
        super.price = 1000;
        System.out.println(busNum + "번 버스가 생성되었습니다.");
    }
    //메서드 - 번호 확인
    public void numberComparison(int busNum) {
        System.out.println("차량번호는 : "+this.busNum);
    }
    public void start(int busNum) {
        System.out.println(busNum+"번 버스 운행 시작");
    }

    //메서드 - 승객 탑승  -버스
    public void PassengerBo(int newPassenger){

        currentPassenger += newPassenger;
        if(this.currentPassenger + newPassenger <= maxPassenger && station.equals("운행")) {
            maxPassenger -= newPassenger;
            price = price*newPassenger;
            System.out.println("탑승 승객 수 ="+currentPassenger);
            System.out.println("잔여 승객 수 ="+maxPassenger);
            System.out.println("요금 확인 ="+price);

            //초기화
            price=1000;
        }
        else {
            //초기화 0으로
            currentPassenger = 0;
            System.out.println("최대 승객 수 초과");
        }
    }

    //메서드 주유 기능
    public void oiling(int oil) {
        if (oil >= 0) { //즈우 시 차고지 행
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


    //--버스 기능 get/set
    public in
}