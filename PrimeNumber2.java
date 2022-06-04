import java.util.Scanner;
public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,i;
        System.out.print("Enter a number: ");
        num =sc.nextInt();
        for(i=2; i<=num; i++){
            if(num%i==0){
                if(num%i==0){
                    break;
                }
            }
            if(num==i){
                System.out.println(num+" is a prime number.");
            }
            else{
                System.out.println(num+" is not prime number.");
            }
            sc.close();
            }
        }
    }
    // this is wrong. work in progress.
