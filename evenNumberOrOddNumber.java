public class evenNumberOrOddNumber {
    static boolean evenOrOdd(int num) {
        if(num % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 102;
        System.out.println(evenOrOdd(num));
    }
}
