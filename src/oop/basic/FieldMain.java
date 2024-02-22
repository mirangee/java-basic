package oop.basic;

public class FieldMain {
    public static void main(String[] args) {
        FieldAndLocal  fl = new FieldAndLocal();
        fl.a = 30;
        fl.printNumber(100);
        System.out.println("-------------------");
        fl.foo();
    }
}
