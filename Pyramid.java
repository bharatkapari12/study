public class Pyramid {
    public static void main(String[] args) {
        int i,j,num=5;
        for(i=1; i<=num; i++){
            for(j=num-1; j>0; j--){
                System.out.format("%-5d", i);
            }
            for(int k=1; k<=i; k++){
                System.out.format("%-5d", j);
            }
            System.out.println();
        }
    }
}
