package oop.static_.singleton;

import static oop.static_.singleton.Singleton.getInstance;

public class MainClass {
    public static void main(String[] args) {

//        Singleton s = new Singleton();
        Singleton s = Singleton.getInstance();
        s.method1();
        s.method2();
    }
}
