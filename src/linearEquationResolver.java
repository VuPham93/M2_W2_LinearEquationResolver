import java.util.Scanner;

public class linearEquationResolver {
    public static void main(String[] args) {

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double result = - b / a;
            System.out.printf("Result: x = %f!", result);
        }
        else {
            if (b == 0) {
                System.out.print("Result is all x!");
            }
            else {
                System.out.print("No solution!");
            }
        }
    }
}