//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    void draw() {

    }

    double calculateArea() {
        return 0.0; // Alt sınıflar tarafından override edilecek
    }

    // Getter ve Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}