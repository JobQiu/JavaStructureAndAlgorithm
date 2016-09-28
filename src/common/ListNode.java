package common;

/**
 * Created by JobQ on 9/26/2016.
 */
public class ListNode {
    int val;
    ListNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int x){
        val=x;
    }
    public ListNode insertFirst(ListNode l){
        l.setNext(this);
        return l;

    }
}
