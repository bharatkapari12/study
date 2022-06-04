import java.util.Scanner;
public class SumAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,sum=0;
        double avg;
        System.out.println("Enter the 5 numbers:");
        int num=sc.nextInt();
        for(i=0; i<5; i++){
            System.out.println(i);
            sum=num+i;
            sc.close();
        }
        avg=sum/5;
        System.out.println("The Sum is: "+sum+" \nThe Average is: "+avg);
    }
}
