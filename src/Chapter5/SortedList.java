package Chapter5;

/**
 * Created by JobQ on 9/29/2016.
 */
public class SortedList {
    private Link first;
    public SortedList(){
        first=null;
    }
    public boolean isEmpty(){
        return first==null;
    }

    public void insert(long key){
        Link temp = new Link(key);
        Link current = first;
        Link previous = null;
        while(current!=null&&current.dData<key){
            previous=current;
            current=current.next;
        }
        if (previous==null)
            first=temp;
        else
            previous.next=temp;
        temp.next=current;
    }
    public void display(){
        Link current = first;
        while (current!=null){
            System.out.print(current.dData+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        SortedList sl = new SortedList();
        sl.insert(20);
        sl.insert(40);
//        sl.display();
        sl.insert(10);
        sl.insert(30);
        sl.insert(50);
        sl.display();

    }
}
