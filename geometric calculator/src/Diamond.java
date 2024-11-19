public class Diamond extends Figure {
    private double diagonal1, diagonal2;

    public Diamond(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double calculatePerimeter() {
        double side = Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2));
        return 4 * side;
    }

    @Override
    public void print() {
        System.out.println("Romb: ");
        System.out.println("Przekątne: " + diagonal1 + ", " + diagonal2);
        System.out.println("Pole: " + calculateArea());
        System.out.println("Obwód: " + calculatePerimeter());
    }
}
