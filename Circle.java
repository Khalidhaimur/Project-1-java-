public class Circle {
    public int rad;

    public double area() {
        double area = 3.14 * rad * rad;
        return area;
    }

    public double round() {
        double round = 2 * 3.14 * rad;
        return round;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.rad = 10;
        
        // حساب المساحة والدائرة
        double a = c.area();
        double b = c.round();

        // طباعة النتائج
        System.out.println(a);
        System.out.println(b);
    }
}
