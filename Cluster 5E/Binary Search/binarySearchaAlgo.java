
import java.util.Scanner;

public class binarySearchaAlgo {
    public static boolean binary(int []arr,int n, int target){
        int s = 0;
        int e = n-1;
        while(s<=e){
        int mid = (s+e)/2;
        if(arr[mid] == target){
            
        }
        else if(arr[mid] > target)e = mid-1;
        else s = mid+1;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {56, 58, 66, 89, 97};
        int n = arr.length;
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        boolean ans = binary(arr,n,target);
        System.out.println(ans);

    }
}
