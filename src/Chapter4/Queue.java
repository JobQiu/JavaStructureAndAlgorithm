package Chapter4;

/**
 * Created by JobQ on 9/25/2016.
 */
public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nItems;
    //constructor
    public Queue(int s) {
        this.maxSize = s;
        queueArray = new long[s];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    //insert a number
    public void insert(long j){
        if(rear==maxSize-1){
            rear=-1;
        }
        queueArray[++rear]=j;
        nItems++;
    }
    //remove a number from the head
    public long remove(){
        long result=queueArray[front++];
        // get the data from the front and move the
        // front pointer above
        if (front==maxSize){
            front=0;
        }
        nItems--;
        return result;
    }

    //display
    public void display(){
            for(int i =0;i<maxSize;i++)
                System.out.print(queueArray[i]+" ");
            System.out.println(" ");
        System.out.println("front is "+front+" rear is "+rear);


    }
    //peek front, return the number in the head
    public long peekFront(){
        return queueArray[front];
    }

    //if the queue is full
    public boolean isEmpty(){
        return nItems==maxSize;
    }

    //return the size of the queue
    public int size(){
        return nItems;
    }

    public static void main(String[] args) {
        Queue q=new Queue(20);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.insert(60);
        q.insert(70);
        q.insert(80);
        q.insert(90);
        q.insert(100);
        q.insert(10);
        q.insert(20);
        q.display();
        System.out.println("remove 3 numbers");
        q.remove();
        q.remove();
        q.remove();
        q.display();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        System.out.println("insert 3 numbers");
        q.display();
    }




}
