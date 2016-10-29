package Javacore.v1ch05.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Created by JobQ on 10/7/2016.
 */
public class reflectTest {
    public static void main(String[] args) {
        String name = "java.lang.Double";

        try {
            Class c1 = Class.forName(name);
            Class superc1 = c1.getSuperclass();
            System.out.println(c1.getName());
            System.out.println(superc1.getName());
            Constructor[] constructors = c1.getConstructors();
            for (Constructor c:constructors
                 ) {
                System.out.print(Modifier.toString(c.getModifiers()));
                System.out.print(" "+c1.getName());
                System.out.println();
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
