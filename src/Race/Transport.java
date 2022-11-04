package Race;


public class Transport <T extends Drivers & Actions>{
    public String typeTransport;

    public Transport(String typeTransport) {
        ValidationUtils.validOrDefault(typeTransport,
                "default");
    }

    public void controlled(T drivers) {
        System.out.println("Водитель " + drivers.getFullName() +
                ", имеет категорию: " + drivers.getTypeCategory() +
                 ", управляет " + drivers.getRightDriveClassAuto() + ", учавствовует в заезде, и "
        + drivers.start());

        System.out.println("Водитель " + drivers.getFullName() + " " + drivers.stop() + ". ");
        System.out.println("Водитель " + drivers.getFullName() + " " + drivers.refuelTheCar() + ". ");
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }
}
