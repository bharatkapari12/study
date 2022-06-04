import java.util.Scanner;
public class OddNatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter number of terms: ");
        int num =sc.nextInt();
        for(int i=1; i<=num; i++){
            if(i%2!=0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("Sum of odd number: "+sum);
        sc.close();
    }
}
