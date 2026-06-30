class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Reverse_Linked_List {
    public static void main(String[] args) {
    // 1 -> 2 -> 3 -> 4 -> 5
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    Solution obj = new Solution();

    ListNode result = obj.reverseList(head);

    while (result != null) {
        System.out.print(result.val + " ");
        result = result.next;
    }
  }
}
    

class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode prev = null;
         ListNode current = head;
         while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
         }      
         return prev;
    }
}