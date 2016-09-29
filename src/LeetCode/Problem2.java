package LeetCode;

import common.ListNode;

/**
 * Created by JobQ on 9/26/2016.
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class Problem2 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(3);
        l1=l1.insertFirst(new ListNode(4));
        l1=l1.insertFirst(new ListNode(2));
        l1.display();
        ListNode l2=new ListNode(4);
        l2=l2.insertFirst(new ListNode(6));
        l2=l2.insertFirst(new ListNode(5));
        l2.display();
    }

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){

        return null;
    }
}
