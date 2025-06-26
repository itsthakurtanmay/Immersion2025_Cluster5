
class LinkedListNode {

    char data;
    LinkedListNode add;

    //constructor;
    LinkedListNode(char d) {
        this.data = d;
        this.add = null;
    }
}

public class addlast {

    public static void traverse(LinkedListNode head) {
        //step 1 : pointer jo head store;
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.add;
        }

    }

    public static void addLast(LinkedListNode head, char val) {

        //step 1 : New node create karlo;
        LinkedListNode newnode = new LinkedListNode(val);

        //step 2 : Make a pointer on head node;-> good practise 
        LinkedListNode ptr = head;

        //step 3 : jab tak ptr wala pointer , last node (tail node) pr nahi jaata usko aage forward kar rahe haii
        while (ptr.add != null) {
            ptr = ptr.add;
        }
        //Step 3: ek baar mein jab last node pr aa gya , toh newnode add krdo;
        ptr.add = newnode;

    }

    public static void main(String[] args) {
        //Object;
        LinkedListNode head = new LinkedListNode('A');
        addLast(head, 'B');
        addLast(head, 'C');
        addLast(head, 'F');
        addLast(head, 'Z');
        addLast(head, 'K');

        traverse(head);

        // System.out.println(head.data);
        // System.out.println(head.add);
    }
}
