public class Main {

    public static void main(String[] args) {

        Car car = new Car("Honda", "Civic", 2022, 4);
        car.start();
        System.out.println("Araba Markası : " + car.getBrand());
        System.out.println("Araba Modeli : " + car.getModel());
        System.out.println("Araba Yılı : " + car.getYear());
        System.out.println("Araba Kapı Sayısı : " + car.getNumDoors());
        car.stop();

        Motorcycle motorcycle = new Motorcycle("BMW", "Sport", 2023, true);
        motorcycle.start();
        System.out.println("Motorsiklet Markası : " + motorcycle.getBrand());
        System.out.println("Motorsiklet Modeli : " + motorcycle.getModel());
        System.out.println("Motorsiklet Yılı : " + motorcycle.getYear());
        System.out.println("Motorsiklet Yan Koltuğu : " + motorcycle.hasSidecar());
        motorcycle.stop();

        Truck truck = new Truck("Volvo", "FH16", 2022, 28000.0);
        truck.start();
        System.out.println("Tır Markası : " + truck.getBrand());
        System.out.println("Tır Modeli : " + truck.getModel());
        System.out.println("Tır Model Yılı : " + truck.getYear());
        System.out.println("Tır Yük Kapasitesi : " + truck.getCargoCapacity() + " kg");
        truck.stop();
    }


}
