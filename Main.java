public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(1100);
        Bus bus2 = new Bus(1101);

        System.out.println();
        bus1.PassengerBo(2);
        System.out.println();
        bus1.oiling(-50);
        System.out.println();
        bus1.oiling(10);
        System.out.println();
        bus1.PassengerBo(45);
        System.out.println();
        bus1.PassengerBo(5);
        System.out.println();
        bus1.oiling(-55);

        System.out.println("======여기는 택시=========");

        Texi texi1 = new Texi(1);
        Texi texi2 = new Texi(2);

        System.out.println();
        texi1.PassengerBo(2);
        System.out.println();
        texi1.oiling(-50);
        System.out.println();
        texi1.oiling(10);
        System.out.println();
        texi1.PassengerBo(45);
        System.out.println();
        texi1.PassengerBo(5);
        System.out.println();
        texi1.oiling(-55);

    }
}