//택시 시작
    public class Texi extends Sa {

        String destination;  //목적지
        int destinationDistance;
        int defaultRate = 3000;
        int defaultDistance = 1; //기본거리
        int distanceRate = 1000;

        public Texi(int taxiNum) {
            super.StartOperation("일반");
            super.number = taxiNum;
            super.maxPassenger = 4;
            super.fuelvolume = 100;
            super.speed = 0;
            System.out.println(taxiNum + "번 택시가 생성되었습니다.");
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

        // 거리당 요금
        @Override
        public void distanceRatePlus(int distanceRate) {

            price = 3000 +(destinationDistance - 1) * 1000;
            System.out.println("지불할 금액 =" + price);
            System.out.println("상태 =" + station);
        }

        // 결제
        public void payment(){
            System.out.println("현재 금액은" + getPrice() + "원입니다.");
            this.CurrentPassenger = 0;
        }

        @Override
        public void StateChange() {
            super.StateChange();
            if(fuelvolume < 10) {
                this.station = "운행 불가";
            }
            public String getDestination() {
                return;destination;
            }

        }


        public int getNumber() {
            return Number;
        }

        @Override
        public void setNumber(int number) {
            super.setNumber(number);
        }

        @Override
        public int getFuelvolume() {
            return super.getFuelvolume();
        }

        @Override
        public void setFuelvolume(int fuelvolume) {
            super.setFuelvolume(fuelvolume);
        }
    }
}
