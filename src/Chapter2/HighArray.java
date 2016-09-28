package Chapter2;

/**
 * Created by JobQ on 9/25/2016.
 */
public class HighArray {
    private long[]a;
    private int nElems;// the number of items

    //constructor
    public HighArray(int max){
        a=new long[max];
        nElems=0;
    }
    // find
    public boolean find(long searchKey){
        for (int j=0;j<nElems;j++){
            if (a[j]==searchKey)
                return true;
        }
        return false;
    }
    //insert
    public void insert(long insertValue){
        a[nElems]=insertValue;
        nElems++;
    }
    //display
    public void display(){
        for(int i =0 ; i<nElems;i++){
            System.out.print(a[i]+" ");
        }
    }
    //delete
    public boolean delete(long deleteValue){
        boolean flag=false;
        for (int i = 0; i < nElems; i++) {
            if (a[i]==deleteValue){
                flag=true;
            }
            if (flag){
                a[i]=a[i+1];
            }
        }
        if(flag){
            nElems--;return true;
        }
        return false;
    }
    //getMax
    public long getMax(){

        long max=-1;
        for (int i = 0; i < nElems; i++) {
            if (a[i]>max)
                max=a[i];
        }
        System.out.println(max);
        return max;
    }
    //remove max
    public long removeMax(){
        long max = getMax();
        delete(max);
        return max;

    }

//    public void noDup(){
//
//        for (int i = 1; i < nElems; i++) {
//            for (int j = 0; j < i; j++) {
//                if(a[i]==a[j])
//                {
//                    a[i]=null;
//                }
//            }
//        }
//
//    }
    public static void main(String[] args) {
        int size=10;
        HighArray h = new HighArray(size);
        h.insert(10);
        h.insert(20);
        h.insert(30);
        h.insert(40);

        h.display();
        System.out.println(h.find(130));

    }
}
