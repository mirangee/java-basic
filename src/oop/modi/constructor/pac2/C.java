package oop.modi.constructor.pac2;
import oop.modi.constructor.pac1.A;

public class C {
    A a1 = new A(true); // public
//    A a2 = new A(23); (x) default이므로 다른 패키지에선 호출 불가
//    A a3 = new A(3.14); (x) private
}
