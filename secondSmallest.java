public class secondSmallest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 7, 5 };
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second smallest element is: " + secondSmallest);
    }
}
