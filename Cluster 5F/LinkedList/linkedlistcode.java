
class Node {

    int data;
    Node add;

    //constructor;
    Node(int val) {
        this.data = val;
        this.add = null;
    }
}

public class linkedlistcode {

    public static void main(String[] args) {

        //Object;
        Node head = new Node(10);

        System.out.println(head.data);
        System.out.println(head.add);
    }
}
