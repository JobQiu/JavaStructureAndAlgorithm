package Chapter2;

/**
 * Created by JobQ on 9/25/2016.
 */
public class LowArray {
    private long[] a;

    //constructor
    public LowArray(int size){
        a = new long[size];
    }

    public void setElem(int index, long value){
        a[index] = value;
    }

    public long getElem(int index){
        return a[index];
    }




}
