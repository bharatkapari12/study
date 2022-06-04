public class Rhombus {
    public static void main(String[] args) {
        int row = 4, i, j, k, l;
        System.out.println("Printing Diamond number Pattern");
        for (i = 1; i <= row; i++) {
            // loop for space
            for (j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // first half
            for (k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // second half
            for (l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        for (i = row-1; i >= 1; i--) {
            // loop for space
            for (j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // first half
            for (k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // second half
            for (l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
