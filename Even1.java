public class Even1 {
    public static void main(String[] args) {
        int num=0;
        while(num<=100){
            if(num%2==0){
                System.out.print(num+" is even. ");
            }
            else{
                System.out.print(num+" is odd. ");
            }
            num++;
        }
    }
}
