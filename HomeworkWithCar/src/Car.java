class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, int year, int numDoors) {

        super(brand, model, year);

        this.numDoors = numDoors;
    }

    public int getNumDoors() {

        return numDoors;
    }

    public void setNumDoors(int numDoors) {

        this.numDoors = numDoors;
    }

    @Override
    public void start() {

        System.out.println("Araba çalışıyor.");
    }

    @Override
    public void stop() {

        System.out.println("Araba durduruluyor.");
    }
}
