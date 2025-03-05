public class reverseTheNumber {
    public static void isReverse(int number) {
        int reverse = 0;
        while (number > 0) {
            int lastNum = number % 10;
            reverse = reverse * 10 + lastNum;
            number = number / 10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        int num = 1010102;
        System.out.println(num);
        isReverse(num);
    }
}
