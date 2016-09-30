package common;

/**
 * Created by JobQ on 9/26/2016.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }


    public ListNode(int x){
        val=x;
    }

    public ListNode insertFirst(ListNode l){
        l.next=this;
        return l;
    }
    public ListNode insertFirst(int l){
        ListNode ll = new ListNode(l);
//        System.out.println("inside the list node class"+ll.getVal());
        ll.next=(this);
        return ll;
    }
    public void display(){
        ListNode current = this;
        while(current!=null){
            System.out.print(current.getVal()+" ");
            current=current.next;
        }
    }
}
