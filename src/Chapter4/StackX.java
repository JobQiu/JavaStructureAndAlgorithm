package Chapter4;

/**
 * Created by JobQ on 9/25/2016.
 */
public class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;

    //constructor
    public StackX(int maxSize){
        this.maxSize=maxSize;
        stackArray = new long[maxSize];
        top=-1;
    }

    // push
    public void push(long data){
        stackArray[++top]=data;
    }
    // pop
    public long pop(){
        return stackArray[top--];
    }

    // peek
    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==maxSize-1;
    }


}
