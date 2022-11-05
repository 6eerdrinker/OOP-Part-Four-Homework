package Transport;

public class Bus extends Transport{
    public Bus(String brand, String model, float engineVolume, int pitStop, int bestLapTime, int maxSpeed) {
        super(brand, model, engineVolume, pitStop, bestLapTime, maxSpeed);
    }

    @Override
    public void Start() {
        super.Start();
        System.out.println("Автобус начинает движение плавно.");

    }

    @Override
    public void Finish() {
        super.Finish();
        System.out.println("Автобус финиширует плавно.");

    }

    public static void printInfo(Bus bus) {
        System.out.println("Автомобиль: " + bus.getBrand() + ", модель: "
                + bus.getModel() + ". Объем двигателя: " + bus.getEngineVolume() + " куб.см. " +
                bus.pitStop() + " минут. " + bus.bestLapTime() + " мин. " + bus.maxSpeed() + " км/ч.");
    }
}
