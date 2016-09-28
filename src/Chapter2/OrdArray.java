package Chapter2;

/**
 * Created by JobQ on 9/25/2016.
 */
public class OrdArray {
    private long[]a;
    private int nElems;// the number of items

    public int getnElems() {
        return nElems;
    }

    public void setnElems(int nElems) {
        this.nElems = nElems;
    }

    //constructor
    public OrdArray(int max){
        a=new long[max];
        nElems=0;
    }
    //easy insert
    public  void easyInsert(long insertValue){
    a[nElems]=insertValue;
    nElems++;}
    //insert
    public boolean insert(long insertValue){

        int lowerBound=0;
        int upperBound = nElems;
        int curIn;
        //1. if it's lower than the lowest one
        if (insertValue<a[0]){
            insertByIndex(0,insertValue);
            return true;
        }
        //2. if it's large than the largest one
        if (insertValue>a[nElems-1]){
            insertByIndex(nElems,insertValue);
            return true;
        }
        //3. if it's between the maximum and minimum
        while (true){
            curIn = (lowerBound+upperBound)/2;
            if (a[curIn]<=insertValue&&a[curIn+1]>insertValue){
                insertByIndex(curIn+1,insertValue);
                return true;}
            if(upperBound<lowerBound)
                return false;
            if (a[curIn]<insertValue)
                lowerBound=curIn+1;
            else
                upperBound=curIn-1;
        }

    }
    private void insertByIndex(int index, long value){
        for (int i= nElems;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=value;
        nElems++;
    }
    //display
    public void display(){
        for(int i =0 ; i<nElems;i++){
            System.out.print(a[i]+" ");
        }
    }
    //find
    public int find(long searchValue){
        int lowerBound=0;
        int upperBound=nElems;
        int curIn;

        while (true){
            curIn = (lowerBound+upperBound)/2;
            if (a[curIn]==searchValue)
                return curIn;
            if(upperBound<lowerBound)
                return -1;
            if (a[curIn]<searchValue)
                lowerBound=curIn+1;
            else
                upperBound=curIn-1;
        }
    }
    //merge
    public long[] merge(long[] anotherOrdArray){
        //0. if it's null, return a
        if(anotherOrdArray==null)
            return a;
        //1.
        int total = nElems+anotherOrdArray.length;
        int i=0,j=0;
        long[] result=new long[total];
        while ((i+j)<total){
            if(j==anotherOrdArray.length){
                result[i+j]=a[i];
                i++;
                continue;
            }
            if(i==nElems){
                result[i+j]=anotherOrdArray[j];
                j++;
                continue;
            }
            if(a[i]<anotherOrdArray[j]){
                result[i+j]=a[i];
                i++;
            }else{
                result[i+j]=anotherOrdArray[j];
                j++;
            }

        }


        return result;
    }

    public static void main(String[] args) {
        OrdArray o = new OrdArray(5);
        for (int i = 0;i<5;i++)
            o.easyInsert(2*i);
        long[] b =new long[]{1,3,5,9};
        long[] c=o.merge(b);
        o.display();
        System.out.println("\n");

        for (long number :c
             ) {
            System.out.print(number+" ");
        }

    }
}
