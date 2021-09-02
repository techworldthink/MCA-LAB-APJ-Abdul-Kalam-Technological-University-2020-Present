import java.util.*;

class rectangle {
    double width;
    double length;
    double area;
    String color;

    rectangle() {

    }

    rectangle(double w, double l, String c) {
        this.width = w;
        this.length = l;
        this.area = w * l;
        this.color = c;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter color : ");
        this.color = sc.nextLine();
        System.out.print("Enter length : ");
        this.length = sc.nextDouble();
        System.out.print("Enter width : ");
        this.width = sc.nextDouble();

        this.area = this.length * this.width;
    }

    public String get_color() {
        System.out.println("color : " + this.color);
        return this.color;
    }

    public double get_area() {
        System.out.println("area : " + this.area);
        return this.area;
    }

    public static void main(String[] args) {
        rectangle rectangle_1 = new rectangle(10, 5, "red");
        rectangle rectangle_2 = new rectangle();
        rectangle_2.read();
        if ((rectangle_1.get_area() == rectangle_2.get_area()) && (rectangle_1.get_color().equals(rectangle_2.get_color()))) {
            System.out.println("rectangles are same");
        } else {
            System.out.println("rectangles are not same");
        }

    }
}
