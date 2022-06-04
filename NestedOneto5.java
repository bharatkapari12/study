public class NestedOneto5 {
    public static void main(String[] args) {
        int i,j,num;
        for(i=1; i<4; i++){
            num=i;
            for(j=0; j<i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
