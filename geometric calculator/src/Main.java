import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz figurę do obliczeń:");
            System.out.println("1. Trójkąt");
            System.out.println("2. Prostokąt");
            System.out.println("3. Romb");
            System.out.println("4. Graniastosłup");
            System.out.println("5. Wyjście");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Podaj długości boków trójkąta:");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    try {
                        Triangle triangle = new Triangle(a, b, c);
                        triangle.print();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Podaj długość i szerokość prostokąta:");
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.print();
                    break;
                case 3:
                    System.out.println("Podaj długości przekątnych rombu:");
                    double d1 = scanner.nextDouble();
                    double d2 = scanner.nextDouble();
                    Diamond diamond = new Diamond(d1, d2);
                    diamond.print();
                    break;
                case 4:
                    System.out.println("Wybierz podstawę graniastosłupa (1 dla trójkąta, 2 dla prostokąta, 3 dla rombu):");
                    int baseChoice = scanner.nextInt();
                    Figure base = null;

                    if (baseChoice == 1) {
                        System.out.println("Podaj długości boków trójkąta:");
                        double ta = scanner.nextDouble();
                        double tb = scanner.nextDouble();
                        double tc = scanner.nextDouble();
                        base = new Triangle(ta, tb, tc);
                    } else if (baseChoice == 2) {
                        System.out.println("Podaj długość i szerokość prostokąta:");
                        double rl = scanner.nextDouble();
                        double rw = scanner.nextDouble();
                        base = new Rectangle(rl, rw);
                    } else if (baseChoice == 3) {
                        System.out.println("Podaj długości przekątnych rombu:");
                        double dd1 = scanner.nextDouble();
                        double dd2 = scanner.nextDouble();
                        base = new Diamond(dd1, dd2);
                    }

                    if (base != null) {
                        System.out.println("Podaj wysokość graniastosłupa:");
                        double height = scanner.nextDouble();
                        ThreeDim prism = new ThreeDim(base, height);
                        prism.print();
                    }
                    break;
                case 5:
                    System.out.println("Zakończenie programu.");
                    return;
                default:
                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
            }
        }
    }
}
