import java.util.Scanner;

public class ArmstrongUser {
    public static void main(String[] args) {
        int num, temp, rem, sum = 0;
        temp = 0;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (temp != 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        } // Loop Ends Here
        if (sum == num) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not an Armstrong number.");
        }
        sc.close();
    }
}
