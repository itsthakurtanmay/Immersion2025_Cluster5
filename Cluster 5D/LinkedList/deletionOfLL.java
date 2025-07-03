
class ListNode {

    int data;
    ListNode next;

    ListNode(int val) {
        this.data = val;
        this.next = null;
    }
}

public class deletionOfLL {

    public static void traverse(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode deleteAtHead(ListNode head) {
        head = head.next;
        return head;

    }

    public static ListNode deletionAtLast(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode curr = head;
        ListNode prev = null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return head;
        // ListNode temp = head;
        // while (temp.next.next != null) {
        //     temp = temp.next;
        // }
        // temp.next = null;
    }

    public static void addLast(ListNode head, int val) {
        ListNode newnode = new ListNode(val);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(12);

        addLast(head, 13);
        addLast(head, 3);
        addLast(head, 14);
        addLast(head, 56);
        addLast(head, 7);

        traverse(head);

        head = deleteAtHead(head);
        traverse(head);

        head = deletionAtLast(head);
        traverse(head);

        head = deletionAtLast(head);
        traverse(head);
    }

}
