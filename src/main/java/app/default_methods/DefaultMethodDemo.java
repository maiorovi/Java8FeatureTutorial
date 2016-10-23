package app.default_methods;

import com.sun.glass.ui.Size;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Implementor1 imp1 = new Implementor1();
        Implementor2 imp2 = new Implementor2();

        System.out.println("Size: " + imp1.size() + " isEmpty: " + imp1.isEmpty());
        System.out.println("Size: " + imp2.size() + " isEmpty: " + imp2.isEmpty());
    }

}
