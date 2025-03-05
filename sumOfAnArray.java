public class sumOfAnArray {
    static int sumOfArray(int arr[]) {
        int sum = 0;
        for(int i=0; i<=arr.length-1; i++) {
            sum= sum+ arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int array[] = {2,4,100,56,11,1,4,6,9,10,5,0};
        System.out.println(sumOfArray(array));
    }
}
