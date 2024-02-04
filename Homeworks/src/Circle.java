class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Daire Çiziliyor.");
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
