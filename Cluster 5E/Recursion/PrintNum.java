
import java.util.Scanner;

public class PrintNum {

    public static void print(int n) {
        //base case;
        if (n == 11) {
            return;
        }
        //process/operation
        System.out.print(n + " ");
        //recursive call / function call;
        print(n + 1);

        //process/operation
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        print(n);

    }
}
