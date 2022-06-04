public class FloydTriangle {
    public static void main(String[] args) {
        int i, j, k = 1;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.format("%-5d", k++);

            }
            System.out.println();
        }
    }
}
