public class reverseAString {
    public static void reverseTheString(String str) {
        for(int i = str.length()-1; i >= 0; i--) {
           System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String st = "ababab";
        String st2 = "sushant";
        reverseTheString(st);
        System.out.println();
        reverseTheString(st2);
    }
}
