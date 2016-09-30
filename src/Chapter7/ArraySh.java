package Chapter7;

/**
 * Created by JobQ on 9/29/2016.
 */
public class ArraySh {
    private long[] theArray;
    private int nElems;

    public ArraySh(int s){
        theArray = new long[s];
        nElems=0;
    }
    public void insert(long value){
        theArray[nElems++]=value;
    }
    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(theArray[i]+" ");
        }
    }
    public void shellSort(){
        int inner, outer;
        long temp;
        int h=1;
        while (h < nElems/3)
            h=h*3+1;
        while(h>0){

        }
    }

}
