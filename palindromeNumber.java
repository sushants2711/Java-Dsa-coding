public class palindromeNumber {
    public static boolean isPalindrome(int number) {
        int num2 = number;
        int reverse = 0;
        while (number > 0) {
            int lastNum = number % 10;
            reverse = reverse * 10 + lastNum;
            number = number / 10;
        }

        if (num2 == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 12344321;
        System.out.println(isPalindrome(num));
    }
}
