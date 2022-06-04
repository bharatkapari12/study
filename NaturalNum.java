import java.util.Scanner;
public class NaturalNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,sum=0;
        System.out.println("Enter the number of terms:");
        int num=sc.nextInt();
        for( i=1; i<=num; i++){
            System.out.println(i);
            sum =sum+i;
            
            sc.close();
        }
        System.out.println("The sum is: "+sum);
    }
}
