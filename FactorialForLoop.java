import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        int num;
        int fact=1;
        int i;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
