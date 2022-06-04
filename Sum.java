import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int i=sc.nextInt();
        System.out.println("Enter the ending number: ");
        int j=sc.nextInt();
        int sum=0;
        while(i<=j){
            sum=sum+i;
            i++;
        }
        System.out.println(" The sum is "+sum);
        sc.close();
    }
}
