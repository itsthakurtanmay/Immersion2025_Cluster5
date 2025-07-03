
import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

public class merge2sortedlist {

    public static void merge2sortedll(Node head1, Node head2) {

    }

    public static void traverse(Node head1) {
        Node temp = head1;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void addLast(Node head1, int val) {
        Node newnode = new Node(val);
        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the head value");
        int hvalue = sc.nextInt();
        Node head1 = new Node(hvalue);
        System.out.println("Enter the total no of nodes you want to add");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " th value ");
            int val = sc.nextInt();
            addLast(head1, val);
        }

        System.out.println("Enter the head value of second linkedlist");
        int h2value = sc.nextInt();
        Node head2 = new Node(h2value);

        System.out.println("Enter the total no of nodes you want to add");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the " + i + " th value ");
            int val = sc.nextInt();
            addLast(head2, val);
        }

        merge2sortedll(head1, head2);
        traverse(head1);
        traverse(head2);

    }

}
