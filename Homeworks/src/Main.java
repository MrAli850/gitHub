public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("Kırmızı", 5.0);
        circle.draw();
        System.out.println("Daire Alanı: " + circle.calculateArea());
        System.out.println("Daire Rengi: " + circle.getColor());
        System.out.println("Daire Yarıçapı: " + circle.getRadius());


        Rectangle rectangle = new Rectangle("Mavi", 4.0, 6.0);
        rectangle.draw();
        System.out.println("Dikdörtgen Alanı: " + rectangle.calculateArea());
        System.out.println("Dikdörtgen Rengi: " + rectangle.getColor());
        System.out.println("Dikdörtgen Genişliği: " + rectangle.getWidth());
        System.out.println("Dikdörtgen Yüksekliği: " + rectangle.getHeight());


        Triangle triangle = new Triangle("Yeşil", 3.0, 8.0);
        triangle.draw();
        System.out.println("Üçgen Alanı: " + triangle.calculateArea());
        System.out.println("Üçgen Rengi: " + triangle.getColor());
        System.out.println("Üçgen Taban Uzunluğu: " + triangle.getBase());
        System.out.println("Üçgen Yüksekliği: " + triangle.getHeight());
    }
}
