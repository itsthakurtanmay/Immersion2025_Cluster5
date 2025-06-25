
class Node {

    int data;
    Node add;

    //constructor
    Node(int val) {
        this.data = val;
        this.add = null;
    }
}

public class llnodes {

    public static void traverse(Node newnode) {
        Node temp = newnode;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.add;
        }
    }

    public static void addNodeAtRight(Node newnode, int val) {
        Node ptr = newnode;
        while (ptr.add != null) {
            ptr = ptr.add;
        }
        //Step 1 : New node create karna haii;
        Node secNode = new Node(val);

        //step 2 : head ke next mein null tha , waha secNode daal do;
        ptr.add = secNode;

    }

    public static void main(String[] args) {
        Node newnode = new Node(5);//node create kra hai -> newnode ke name se;
        addNodeAtRight(newnode, 6);
        addNodeAtRight(newnode, 7);
        addNodeAtRight(newnode, 8);
        addNodeAtRight(newnode, 9);
        addNodeAtRight(newnode, 10);

        traverse(newnode);
    }
}
