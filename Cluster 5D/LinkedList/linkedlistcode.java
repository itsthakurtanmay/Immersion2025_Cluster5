
class Node {

    int data;
    Node address;
    //constructor;

    Node(int vansh) {
        this.data = vansh;
        this.address = null;
    }
}

public class linkedlistcode {

    public static void traverse(Node head) {
        Node temp = head;
        while (temp.address != null) {
            System.out.print(temp.data + "->");
            temp = temp.address;
        }
    }

    public static Node addFirst(Node head, int val) {
        //Step 1 : Node create karo ;
        Node temp = new Node(val);

        //step 2 : temp ke address mein null ki jagah head daal do;
        temp.address = head;

        //step 3 : update head;
        head = temp;

        return head;
    }

    public static void main(String[] args) {
        //object;
        Node head = new Node(10);
        System.out.println(head.data);

        head = addFirst(head, 9);
        head = addFirst(head, 8);
        head = addFirst(head, 7);
        head = addFirst(head, 6);
        // Node second = new Node(11);

        traverse(head);

        // System.out.println(head.data);
        // System.out.println(head.address);
    }
}
