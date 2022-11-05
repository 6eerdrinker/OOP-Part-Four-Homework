package Transport;
import static Transport.Car.printInfo;
public class TransportMain {
    public static void main(String[] args) {
        System.out.println("Легковые автомобили: ");
        Car lada = new Car("Лада", "Granta", 1.7f,5, 7, 203);
        Car audi = new Car("Ауди", "A8 50 L TDI quattro", 3.0f,8,6,267);
        Car bmw = new Car("BMW", "Z8", 3.0f, 7, 4, 288);
        Car kia = new Car("KIA", "Sportage 4-го поколения", 2.0f, 6,10,198);
        Car.printInfo(lada);
        Car.printInfo(audi);
        Car.printInfo(bmw);
        Car.printInfo(kia);

        lada.Start();
        lada.Finish();
        System.out.println();

        System.out.println("Грузовые автомобили: ");
        Truck kamaz = new Truck("КАМАЗ", "4326", 10.85f, 15, 22, 180);
        Truck man = new Truck("MAN", "TGS 33.480 6x6", 12.4f, 18, 28, 178);
        Truck scania = new Truck("Scania", "S500 4×2 Highline", 16.0f, 16, 23, 200);
        Truck hino = new Truck("HINO", "700SS", 12.9f, 20, 20, 188);

        Truck.printInfo(kamaz);
        Truck.printInfo(man);
        Truck.printInfo(scania);
        Truck.printInfo(hino);

        kamaz.Start();
        kamaz.Finish();
        System.out.println();

        System.out.println("Автобусы: ");
        Bus paz = new Bus("ПАЗ", "3205", 4.670f, 20, 16, 168);
        Bus daewoo = new Bus("Daewoo", "BS-106", 11.051f, 13, 12, 202);
        Bus gaz = new Bus("Газ", "32215", 2.9f, 10, 15, 190);
        Bus isuzu = new Bus("Isuzu", "Citibus", 4.6f, 16, 17, 180);

        Bus.printInfo(paz);
        Bus.printInfo(daewoo);
        Bus.printInfo(gaz);
        Bus.printInfo(isuzu);

        paz.Start();
        paz.Finish();
        System.out.println();
    }

}
