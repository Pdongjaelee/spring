public class Sa {
    //매개변수
    int number;             //대중교통(부모) 기본 값 필드 선언
    int fuelvolume = 100;
    int speed = 0;
    int speedChange;
    int maxPassenger;
    int CurrentPassenger;
    int price;
    String station;

    public Sa() {

    }
    //메서드 - 운행시작
    public void StartOperation(String station) {
        this.station = station;
    }


    //메서드 - 속도변경
    public void SpeedChange(int speedChange ){
        this.speedChange = speedChange;

    }
    //메서드 - 상태변경
    public void StateChange(){
        if (this.station == "운행중") this.station = "차고지행";
        else if (this.station == "차고지행")this.station ="운행중";

        if(fuelvolume < 10) {
            this.station = "차고지행";

        }
    }
    //get/set
    public int getNumber() {
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getFuelvolume() {
        return  fuelvolume;
    }
    public void setFuelvolume(int fuelvolume) {
        this.fuelvolume = fuelvolume;
        if (fuelvolume < 10) {
            System.out.println("주유 필요");
            StateChange();
        }
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getCurrentPassenger() {
        return CurrentPassenger;
    }

    public void setCurrentPassenger(int currentPassenger) {
        CurrentPassenger = currentPassenger;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }
}