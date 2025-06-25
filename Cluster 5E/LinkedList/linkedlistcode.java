
class Node {

    int data;
    Node next;

    //constructor
    public Node(int abhay) {
        this.data = abhay;
        this.next = null;
    }
}

public class linkedlistcode {

    public static Node addleft(Node head, int val) {
        //step 1 : Node create kardo;
        Node temp = new Node(val);

        //step 2 : jo new node bna haii uske next mein null tha ab head;
        temp.next = head;

        //step 3 : update head;
        head = temp;
        return head;
    }

    public static void main(String[] args) {
        //class ka object banayega;
        Node head = new Node(5);

        head = addleft(head, 4);
        head = addleft(head, 3);
        head = addleft(head, 2);
        head = addleft(head, 1);
        head = addleft(head, 0);

    }
}
