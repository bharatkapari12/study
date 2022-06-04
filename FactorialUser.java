import java.util.Scanner;

public class FactorialUser {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is " + fact + ".");
    }
}
