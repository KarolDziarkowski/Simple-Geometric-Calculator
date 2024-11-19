public class Triangle extends Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c) throws IllegalArgumentException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Nieprawidłowe długości boków dla trójkąta.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2; // półobwód
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Wzór Herona
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void print() {
        System.out.println("Trójkąt: ");
        System.out.println("Boki: " + a + ", " + b + ", " + c);
        System.out.println("Pole: " + calculateArea());
        System.out.println("Obwód: " + calculatePerimeter());
    }
}
