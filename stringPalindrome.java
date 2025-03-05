public class stringPalindrome {
    public static boolean isStringPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String st = "abcde";
        String st2 = "racecar";
        System.out.println(isStringPalindrome(st));
        System.out.println(isStringPalindrome(st2));
    }
}
