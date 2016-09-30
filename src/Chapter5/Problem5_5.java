package Chapter5;

/**
 * Created by JobQ on 9/29/2016.
 *
 */
public class Problem5_5 {
    public static void main(String[] args) {
        int num = 20;int number=7;
        Link head =Link.recycle(num);
        System.out.println(head.dData);
        Link current = head;
        Link previous = null;
        int count =0;
        while (head.next!=head){
            for (int i = 0; i < number-1; i++) {
                previous=current;
                current=current.next;
                System.out.print(previous.dData+" ");
            }
            System.out.println(current.dData);
            previous.next=current.next;
            current=current.next;
            count++;
            if (count==num)
                break;
        }
    }

}
