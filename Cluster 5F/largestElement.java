public class largestElement {
    public static int largest(int []arr,int n){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(maxi < arr[i])maxi = arr[i];
        }
        return maxi;
    }

    public static void main(String[] args) {
        int []arr = {23,45,8,9,56};
        int ans = largest(arr,arr.length);
        System.out.println(ans);
    }
}