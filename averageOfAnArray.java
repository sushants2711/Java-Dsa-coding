public class averageOfAnArray {
    static float avg(float arr[]) {
        float sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];
        }
        float avg = sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        float array[] = { 2, 4, 100, 56, 11, 1, 4, 6, 9, 10, 5, 0 };
        System.out.println(avg(array));
    }
}
