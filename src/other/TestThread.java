package other;

/**
 * Created by JobQ on 9/30/2016.
 */
public class TestThread implements Runnable {
    private String name;

    //constructor
    public TestThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            for (long k = 0; k < 100000000; k++) ;
            System.out.println(name + ": " + i);
        }
    }

    public static void main(String[] args) {
        TestThread ds1 = new TestThread("阿三");
        TestThread ds2 = new TestThread("李四");

        Thread t1 = new Thread(ds1);
        Thread t2 = new Thread(ds2);

        t1.start();
        t2.start();
    }
}
