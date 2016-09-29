package LeetCode;

import common.ListNode;

/**
 * Created by JobQ on 9/29/2016.
 * Given a linked list, remove the nth node from
 * the end of list and return its head.
 For example,
 Given linked list: 1->2->3->4->5, and n = 2.
 After removing the second node from the end, the
 linked list becomes 1->2->3->5.
 */
public class Problem019 {
    public static void main(String[] args) {
        ListNode l = new ListNode(5);
        l.display();
        l=removeNthFromEnd(l,1);
        l.display();
    }
    /**
     *
     */

     public static ListNode removeNthFromEnd(ListNode head, int n) {
         //1. get the length of the list
         ListNode current = head;

         int length=0;
         while (current!=null){
             length++;
             current=current.next;
         }
         if (n>length)
             return null;
         //System.out.println(length);
         int position=length-n;
         current=head;
         ListNode previous=current;
         while(position>0){
             previous=current;
             current=current.next;
             position--;
         }
         if(previous==current)
             head=previous.next;
         previous.next=(current.next);
         return head;
     }

}
