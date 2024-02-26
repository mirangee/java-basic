package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A {

//    A a1 = new A(30); (x) protected
//    A a2 = new A(3.14); (x) default


    public C() {
        /*
            - protected 제한자는 패키지가 다른 경우
            두 클래스 사이에 상속 관계가 존재한다면
            super라는 키워드를 통해 참조를 허용한다.
         */

        super(5); // protected
//        super(3.14); (x) default

        super.x = 1; //protected
//        super.y = 2; (x) default

        super.method1();
//        super.method2(); (x) default
    }
}
