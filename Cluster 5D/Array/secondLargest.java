import java.util.Scanner;

public class secondLargest {
    public static int secondlarg(int []arr,int n){
        //largest;
        int max = Integer.MIN_VALUE;//infinity
        for(int i = 0;i<n;i++){
            if(arr[i] > max)max = arr[i];
        }
        System.out.println("largest element in the array is : " + max);
        int secmax = -1;
        for(int i = 0;i<n;i++){
            if((arr[i] > secmax) && (arr[i] != max))secmax = arr[i];
        }
        return secmax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[]arr = new int[n];

        for(int i = 0;i<n;i++){
            System.out.println("Enter the value of" + i + "th index");//string concatenation;
            arr[i] = sc.nextInt();
        }

        System.out.println("Second largest element in the array is : " +secondlarg(arr,n));

        
    }
    
}
