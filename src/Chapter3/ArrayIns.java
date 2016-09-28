package Chapter3;

/**
 * Created by JobQ on 9/25/2016.
 */
public class ArrayIns {
    private long[]a;
    private int nElems;

    public ArrayIns(int max) {
        a = new long[max];
        nElems=0;

    }

    public void insert(long data){
        a[nElems] = data;
        nElems++;

    }
    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
    public void insertSort(){
        long temp;
        for (int i = 1; i <nElems; i++) {
            int j =i-1;
            while (j>-1)
            {
                if (a[j]>a[j+1])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    j--;
                }
                else
                    break;
            }
        }
    }
    /**
     * 3.3 delete the duplicate items from a sorted array
     * */
    public void noDup(){
        int dup=0;
        for (int i = 1; i < nElems; i++) {
            while(a[i-1]==a[i+dup]){
                dup++;
                nElems--;
            }
            a[i]=a[i+dup];

        }
    }



    public static void main(String[] args) {
        ArrayIns a = new ArrayIns(10);
        a.insert(44);
        a.insert(10);      a.insert(40);
        a.insert(43);
        a.insert(10);

        a.insert(30);
        a.insert(41);

        a.insert(45);
        a.insert(40); a.insert(20);
        a.display();
        a.insertSort();
        a.display();
        a.noDup();
        a.display();




    }
}
