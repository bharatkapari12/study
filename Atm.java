import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        int PIN=1234;
        int attempts=0;
        int totalAttempts=3;
        int remattempts=totalAttempts-attempts;
        Scanner sc=new Scanner(System.in);
        while(attempts!=3){
            attempts++;
            remattempts=totalAttempts-attempts;
            System.out.println("Enter PIN: ");
            int inputPin=sc.nextInt();
            if(inputPin==PIN){
                System.out.println("correct Pin number!");
                break;

            }
            else{
                System.out.println("sorry, your PIN is incorrect. You have "+ remattempts+" attempts left");
                sc.close();
            }
        }
    }
}
