class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public class Remove_nth_node_from_endoflist {
    public static void main(String[] args) {

    // 1 -> 2 -> 3 -> 4 -> 5
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    int n = 2;

    Solution s = new Solution();
    head = s.removeNthFromEnd(head, n);

    // Print list
    while (head != null) {
        System.out.print(head.val + " ");
        head = head.next;
    }
  }
}

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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int steps = count - n;
        if(steps == 0) return head.next;
        temp = head;
        for(int i = 1;i < steps;i++)
            temp = temp.next;
            temp.next = temp.next.next;
        return head;
    }
}