public class Sa {
    //매개변수
    int number;             //대중교통(부모) 기본 값 필드 선언
    int fuelvolume = 100;
    int speed = 0;
    int speedChange;
    int maxPassenger;
    int price;
    String station;

    public Sa() {

    }
    //메서드 - 운행시작
    public void StartOp(String station) {
        this.station = station;
    }
    //메서드 - 속도변경
    public void SpeedCh(int speedChange ){
        this.speedChange = speedChange;

    }
    //메서드 - 상태변경
    public void StateCh(){
        if (this.station == " ") this.station = "";


    }
    //메서드 - 승객탑승  -버스
    public void PassengerBo(int newPassenger){
        this.maxPassenger= 30;
        if(this.currentPassenger + newPassenger <= maxPassenger) {
            System.out.println("탑승 승객 수 =");
            System.out.println("잔여 승객 수 =");
            System.out.println("요금 확인 =");
        }
        else {
            System.out.println("최대 승객 수 초과");
        }
    }
    //메서드 - 승객탑승  -택시
    public void PassengerBo(int newPassenger) {
        this. =;
        if () {
            System.out.println("탑승 승객 수 =");
            System.out.println("잔여 승객 수 =");
            System.out.println("기본 요금 확인 =");
            System.out.println("목적지 =");
            System.out.println("목적지까지 거리 =");
            System.out.println("지불할 요금 = ");
            System.out.println("상태 =");
        } else {
            System.out.println("최대 승객 수 초과");
        }
    }
        // 기본 생성자
    Sa(int number, int fuelvolume, int speed, int speedChange, int maxPassenger) {
        this.number = number;
        this.fuelvolume = fuelvolume;
        this.speed = speed;
        this.speedChange = speedChange;
        this.maxPassenger = maxPassenger;
        }

    //공통 기능 get/set
    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
}


    public class Bus extends Sa {

        int currentPassenger =28 ;

    public Bus(int busNum) {
        super.stationOp("차고지행");
        super.number = busNum;
        super.fuelvolume = 100;
        super.speed = 0;
        super.maxPassenger = 30;
        super.speedChange =;
        super.price = 1000;

        System.out.println("각 bus 번호 다른지 확인");
     }

        @Override
        public void PassengerBo(int newPassenger) {
            super.PassengerBo(newPassenger);
        }

        --버스 기능 입출
        public void (){
        this.fuelvolume
        }
    }

    public class Texi extends Sa {

    String destination;  //목적지
    int destinationDistance;
    int defaultRate = 3000;
    int defaultDistance = 1; //기본거리
    int distanceRate = 1000;

    public Texi(int taxiNum) {
        super.number = taxiNum;
        super.maxPassenger = 4;
        super.fuelvolume = 100;
        super.speed = 0;

        System.out.println();
        }

        @Override
        public void distanceRatePlus(int distanceRate) {
            System.out.println();
        }

        //택시 기능 입출
        public void (){
        this.
        }

    }


