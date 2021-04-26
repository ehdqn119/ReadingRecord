package Generic;

import java.util.Collection;

public class Core {

    static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        String hello = "hello world!";
        String returnValue = Student.<String>compa(hello);

        String string = "yaho";
        Object object = string;

        System.out.println(Long.TYPE);
    }
}
