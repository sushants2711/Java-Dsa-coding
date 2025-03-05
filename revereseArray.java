public class revereseArray {
    public static void reverseAnArray(int arr[]) {
        for(int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
        public static void main(String args[]) {
            int array[] = {2,4,100,56,11,1,4,6,9,10,5,0};
            reverseAnArray(array);
    }
}
