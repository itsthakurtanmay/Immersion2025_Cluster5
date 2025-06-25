import java.util.ArrayList;

public class slidingWindowAlgo {
    public static void printingSubArray(int []arr,int n,int k){
 
        int s = 0;
        int e = 0;
        
        ArrayList<Integer>al = new ArrayList<>();
        while(e < n){
            int currentWindowSize = e-s+1;
            al.add(arr[e]);
        if(currentWindowSize < k){
            e++;
        }
        else if(currentWindowSize == k){
            System.out.println(al);
            al.remove(0);
            s++;
            e++;
        }
    }
    }

    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,60,70,80};
        int n  = arr.length;
        int k = 4;
        
        printingSubArray(arr,n,k);
    }
}