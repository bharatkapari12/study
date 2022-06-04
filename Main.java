import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String ab = "Hi there how are you";
        
        //encrypt
        int[] encrypt = Util.encryption(ab);
        System.out.println(Arrays.toString(encrypt));

        //decrypt
        
        String output = Util.decryption(encrypt);
        System.out.println(output);

    }
}