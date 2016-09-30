package other;

import java.util.Date;

/**
 * Created by JobQ on 9/30/2016.
 */
public class TestReflection {
    public static void main(String[] args) {
        Date name2 = new Date();
        System.out.println(name2.getClass());
        Class c = name2.getClass();
        System.out.println(name2.getClass().getName());
        String name = "java.util.Date";
//        Class c2 = Class.forName(name);

    }
}
