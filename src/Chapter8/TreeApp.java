package Chapter8;

/**
 * Created by JobQ on 10/28/2016.
 */
public class TreeApp {
    public static void main(String[] args) {
        Tree theTree = new Tree();
        theTree.insert(50,44.4,'*');
        theTree.insert(40,44.4,'A');
        theTree.insert(60,44.4,'+');
        theTree.insert(10,44.4,'C');
        theTree.insert(5,44.4,'C');
        theTree.insert(2,44.4,'C');
        theTree.insert(43,44.4,'B');
        theTree.insert(42,44.4,'B');
        theTree.insert(45,44.4,'B');
        theTree.insert(44,44.4,'B');
        theTree.insert(46,44.4,'B');

        theTree.display(1);
        theTree.delete(50);
        System.out.println("*********************");
       theTree.display(1);
//        System.out.println("the minimum is "+theTree.minimum().iData);
    }
}
