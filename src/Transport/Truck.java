package Transport;

public class Truck extends Transport{

    public Truck(String brand, String model, float engineVolume, int pitStop, int bestLapTime, int maxSpeed) {
        super(brand, model, engineVolume, pitStop, bestLapTime, maxSpeed);
    }

    @Override
    public void Start() {
        super.Start();
        System.out.println("Грузовой автомобиль начинает движение рывком.");
    }

    @Override
    public void Finish() {
        super.Finish();
        System.out.println("Грузовой автомобиль финиширует в облаке пыли.");
    }


    public static void printInfo(Truck truck) {
        System.out.println("Автомобиль: " + truck.getBrand() + ", модель: "
                + truck.getModel() + ". Объем двигателя: " + truck.getEngineVolume() + " куб.см. "  +
                truck.pitStop() + " минут. " + truck.bestLapTime() + " мин. " + truck.maxSpeed() + " км/ч.");
    }
}
