import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int num = sc.nextInt();
        
        for (int i = 0; i <= 5; i++) {
            int product = num * i;
            System.out.println(num + " X " + i + " = " + product);
        }
        sc.close();

    }
}
