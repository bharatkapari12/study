import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        int n, firstTerm = 0, secondTerm = 1;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("First "+n+" Fibonacci numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");
            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        sc.close();
    }
}
