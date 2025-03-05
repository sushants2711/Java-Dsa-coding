public class smallestNumber {

    public static int smallestNumberInAnArray(int arr[]) {
        int smallest = arr[0];
        for(int i=0; i<=arr.length-1 ;i++) {
            if(smallest>arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int array[] = {2,4,100,56,11,1,4,6,9,10,5,0};
        System.out.println(smallestNumberInAnArray(array));
    }
}
