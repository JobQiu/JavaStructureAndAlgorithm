package LeetCode;

import common.ListNode;

/**
 * Created by JobQ on 9/30/2016.
 * Given a sorted linked list,
 * delete all duplicates such that each
 * element appear only once.
    For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.
 */
public class Problem083 {
    public static void main(String[] args) {
        ListNode l = new ListNode(3);
        l=l.insertFirst(3);
        l=l.insertFirst(2);
        l=l.insertFirst(2);
        l=l.insertFirst(1);
        l=l.insertFirst(1);
        l.display();
        l=deleteDuplicates(l);
        l.display();
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head.next;
        ListNode previous=head;
        while(current!=null){
            if (previous.val==current.val)
                previous.next=current.next;
            else
                previous=current;
            current = current.next;

        }        return head;
    }
}
