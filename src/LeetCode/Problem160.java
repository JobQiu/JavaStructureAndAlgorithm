package LeetCode;

import common.ListNode;

/**
 * Created by JobQ on 10/3/2016.
 * Write a program to find the node at which the intersection of two singly linked lists begins.


 For example, the following two linked lists:

 A:          a1 → a2
                    ↘
                      c1 → c2 → c3
                    ↗
 B:     b1 → b2 → b3
 */
public class Problem160 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(40);
        l1 = l1.insertFirst(30);
        l1 = l1.insertFirst(20);

        ListNode l2 = new ListNode(7);
        l2.next=l1;
        l2=l2.insertFirst(5);
        l2=l2.insertFirst(3);
        l2=l2.insertFirst(1);

        ListNode l3 = new ListNode(4);
//        l3.next=l1;
        l3=l3.insertFirst(2);

        l2.display();
        System.out.println(" ");
        l3.display();
        ListNode l4 = getIntersectionNode(l2,l3);
        System.out.println(" ");
        //l4.display();

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null)
            return null;
        ListNode currentA = headA;
        ListNode currentB = headB;
        while(currentA!=null&&currentB!=null){
            currentA=currentA.next;
            currentB=currentB.next;
        }
        if(currentA==null){
            currentA=headB;
//            currentB=currentB.next;
            while (currentB!=null){
                currentA=currentA.next;
                currentB=currentB.next;
            }
        }
        else{
            currentB=headA;
//            currentA=currentA.next;
            while (currentA!=null){
                currentA=currentA.next;
                currentB=currentB.next;
            }
        }

        if(currentA==null){
            currentA=headB;
//            currentB=currentB.next;
            while (currentA!=null&&currentB!=null){
                if(currentA.val==currentB.val)
                    break;
                currentA=currentA.next;
                currentB=currentB.next;
            }
        }
        else{
            currentB=headA;
//            currentA=curre!nA.tnext;
            while (currentA!=null&&currentB!=null){
                if(currentA.val==currentB.val)
                    break;
                currentA=currentA.next;
                currentB=currentB.next;
            }
        }
        return currentA;
    }
}
