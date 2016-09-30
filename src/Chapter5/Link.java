package Chapter5;

/**
 * Created by JobQ on 9/29/2016.
 */
public class Link {
    public long dData;
    public Link next;
    public Link(long dd)
    {
        dData=dd;
    }


    public static Link recycle(int num){
        Link head = new Link(1);
        Link current = head;
        for (int i = 2; i < num+1; i++) {
            current.next=new Link(i);
            current=current.next;
            System.out.print(current.dData+" ");
        }
        current.next=head;
        System.out.println(current.next.dData);
        return head;
    }
}
