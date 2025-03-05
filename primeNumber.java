public class primeNumber {
    public static boolean isPrimeOrNot(int num) {
        int count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 11;
        System.out.println(isPrimeOrNot(num));
    }
}
