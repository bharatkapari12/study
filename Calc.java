import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int a, b, res;
        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.println("Press +::ADD -::SUBTRACT *::MULTIPLICATION");
        choice = sc.next().charAt(0);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        switch (choice) {
            case '+':
                res = a + b;
                System.out.println("Sum= " + res);
                break;
            case '-':
                res = a - b;
                System.out.println("Diff= " + res);
                break;
            case '*':
                res = a * b;
                System.out.println("Mul= " + res);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
