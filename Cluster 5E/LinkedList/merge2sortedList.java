/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class merge2sortedList {
    public static void addlast(ListNode ans,int val){
        ListNode newnode = new ListNode(val);
        ListNode temp = ans;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null)return null;
        ArrayList<Integer>al1 = new ArrayList<>();
        ListNode temp1 = list1;
        while(temp1 != null){
            al1.add(temp1.val);
            temp1 = temp1.next;
        }

        ArrayList<Integer>al2 = new ArrayList<>();
        ListNode temp2 = list2;
        while(temp2 != null){
            al2.add(temp2.val);
            temp2 = temp2.next;
        }

        al1.addAll(al2);
        Collections.sort(al1);
        ListNode ans = new ListNode(al1.get(0));
        for(int i = 1;i<al1.size();i++){
            int x = al1.get(i);
            addlast(ans,x);
        }
        // System.out.println(al1);
        
        return ans;
        
    }
}