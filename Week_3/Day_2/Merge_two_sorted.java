class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Merge_two_sorted {
    public static void main(String[] args) {
    // List 1: 1 -> 2 -> 4
    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(2);
    list1.next.next = new ListNode(4);

    // List 2: 1 -> 3 -> 4
    ListNode list2 = new ListNode(1);
    list2.next = new ListNode(3);
    list2.next.next = new ListNode(4);

    Solution s = new Solution();

    ListNode merged = s.mergeTwoLists(list1, list2);

    // Print merged list
    while (merged != null) {
        System.out.print(merged.val + " ");
        merged = merged.next;
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode ptr = null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        while(list1 != null && list2 != null){
            if(head == null){
                if(list1.val < list2.val){
                    ptr = head = list1;
                    list1 = list1.next;
                }
                else{
                    ptr = head = list2;
                    list2 = list2.next;
                }
                continue;
            }
            if(list1.val < list2.val){
                ptr.next = list1;
                ptr = list1;
                list1 = list1.next;
            }
            else{
                ptr.next = list2;
                ptr = list2;
                list2 = list2.next;
            }
        }
        if(list1 != null) ptr.next = list1;
        else ptr.next = list2;

        return head;
    }
}