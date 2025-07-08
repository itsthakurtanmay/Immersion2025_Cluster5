
import java.util.*;

public class factorial {

    public static int fact(int n) {
        //base case;
        if (n <= 1) {
            return 1;
        }
        //recursive call;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }

}
