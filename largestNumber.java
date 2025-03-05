public class largestNumber {

    public static int largestArray(int arr[]) {
        int largestNumber=arr[0];
        for(int i=0; i<=arr.length-1; i++) {
            if(largestNumber < arr[i]) {
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }
    public static void main(String args[]) {
        int array[] = {2,4,100,56,11,1,4,6,9,10,500,0};
        System.out.println(largestArray(array));
    }
}
