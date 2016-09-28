package LeetCode;

import common.ListNode;

/**
 * Created by JobQ on 9/26/2016.
 */
public class Problem2 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(3);
        l1=l1.insertFirst(new ListNode(4));
        l1=l1.insertFirst(new ListNode(2));
        ListNode l2=new ListNode(4);
        l2=l2.insertFirst(new ListNode(6));
        l2=l2.insertFirst(new ListNode(5));

        ListNode current=l2;
        while (current!=null){
            System.out.println(current.getVal());
            current=current.getNext();
        }
    }

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        return null;
    }
}
