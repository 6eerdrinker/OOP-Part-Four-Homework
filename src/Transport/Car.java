package Transport;


public class Car extends Transport {


    public Car(String brand, String model, float engineVolume, int pitStop, int bestLapTime, int maxSpeed) {
        super(brand, model, engineVolume, pitStop, bestLapTime, maxSpeed);
    }

    @Override
    public void Start() {
        super.Start();
        System.out.println("Легковой автомобиль начинает движение резко.");
    }

    @Override
    public void Finish() {
        super.Finish();
        System.out.println("Легковой автомобиль красиво финиширует.");
    }


    public static void printInfo(Car car) {
        System.out.println("Автомобиль: " + car.getBrand() + ", модель: "
                + car.getModel() + ". Объем двигателя: " + car.getEngineVolume() + " куб.см. " +
                car.pitStop() + " минут. " + car.bestLapTime() + " мин. " + car.maxSpeed() + " км/ч.");
    }
}
