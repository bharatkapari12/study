import java.util.Scanner;
public class OddPrinter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num, count=0, i=1, sum=0;
        System.out.println("Enter number of terms: ");
        num = sc.nextInt();
        System.out.println("The odd numbers are: ");
        while(count!=num){
            if(i%2!=0){
                System.out.println(i);
                sum=sum+i;
                count++;
            }
            i++;
        }
        System.out.println("The sum of first "+num+" odd number is: "+sum);
        sc.close();
}
}
