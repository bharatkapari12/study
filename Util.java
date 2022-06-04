public class Util {
    public static int[] encryption(String message){
        char[] chars = message.toCharArray();
        int[] ascii = new int[chars.length];
        for(int i=0; i<=chars.length-1; i++){
            ascii[i] = (int) chars[i];
        }
        return ascii;
    } 
    public static String decryption(int[] pre){
        char[] result= new char[pre.length];
        for(int i=0;i<=pre.length-1; i++){
            result[i] = (char) pre[i];
        }
        String message = String.valueOf(result);
        return message;
    }
}