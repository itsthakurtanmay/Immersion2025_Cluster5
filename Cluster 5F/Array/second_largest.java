public class second_largest {
    public static int secondlargest(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi) maxi = arr[i];
        }

        int sec_maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] != maxi && arr[i] > sec_maxi) {
                sec_maxi = arr[i];
            }
        }

        // Handle case when all elements are same or no second max found
        if (sec_maxi == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
            return -1;
        }

        return sec_maxi;
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 8, 9, 56};
        int ans = secondlargest(arr, arr.length);
        System.out.println("Second Largest: " + ans);
    }
}
