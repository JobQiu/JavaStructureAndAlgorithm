package Chapter8;

/**
 * Created by JobQ on 10/28/2016.
 */
public class Node {
    int iData;
    double fData;
    char c;
    Node(){}
    Node(int id,char c){
        super();
        iData=id;
        this.c=c;
    }
    Node leftChild;
    Node rightChild;

}
