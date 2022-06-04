public class ContinueExcept {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i == 10 || i == 88 || i == 85) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
