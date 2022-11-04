package Race;

public abstract class Drivers implements Actions {
    private String fullName;
    private String typeCategory;
    public String rightDriveClassAuto;

    public Drivers(String fullName, String typeCategory, String rightDriveClassAuto) {
        ValidationUtils.validOrDefault(fullName, "Default");
        ValidationUtils.validOrDefault(typeCategory, "Default");
        ValidationUtils.validOrDefault(rightDriveClassAuto, "Default");
    }

    @Override
    public String start() {
        return "начинает движение.";
    }

    @Override
    public String stop() {
        return "останавливается";
    }

    @Override
    public String refuelTheCar() {
        return "заправляет автомобиль топливом";
    }

    public String getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRightDriveClassAuto() {
        return rightDriveClassAuto;
    }

    public void setRightDriveClassAuto(String rightDriveClassAuto) {
        this.rightDriveClassAuto = rightDriveClassAuto;
    }
}

