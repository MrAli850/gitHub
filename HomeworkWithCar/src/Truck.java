class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String brand, String model, int year, double cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start() {
        System.out.println("Tır Çalışıyor.");
    }

    @Override
    public void stop() {
        System.out.println("Tır Durduruluyor.");
    }
}

