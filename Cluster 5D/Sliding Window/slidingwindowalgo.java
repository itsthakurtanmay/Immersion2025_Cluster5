import java.util.*;
public class slidingwindowalgo {
    public static void printSubArray(int []arr,int n,int k){
        int s = 0;
        int e = 0;
        ArrayList<Integer>al = new ArrayList<>();
        while(e < n){
            int currWindowSize = e-s+1;
            al.add(arr[e]);
            if(currWindowSize < k)e++;
            else if(currWindowSize == k){
                System.out.println(al);
                al.remove(0);
                s++;
                e++;
            }
        }

    }

    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,60,70,80,90,101};
        int n = arr.length;
        int k = 4; //window size;
        printSubArray(arr,n,k);
    }
}