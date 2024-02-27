package oop.poly.basic;

/*
- 자바에서는 하나의 클래스 파일에 여러 개의 클래스를 선언할 수 있습니다.
  밀접한 연관이 있는 클래스를 모아 놓기 위해 사용합니다.
- 단, 파일명과 동일한 클래스가 반드시 존재해야 하고,
  해당 클래스만 public으로 선언할 수 있습니다.
*/

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
    // 다형성 : 부모 타입의 자식 객체!! 부모 타입의 변수에 자식 객체의 주소가 들어간다.
    // 자바 다형성의 특징 : 다중상속 불가(자식은 직속 부모의 경우 단 하나만 갖는다.),
    // 상속 받으면 부모의 데이터를 자식이 물려 받는다. 단, 일방적이므로 부모는 자식 데이터를 참조할 수 없다.
    // 수직 관계에선 줄줄이 상속된다. 수평 관계(형제, 삼촌, 사촌 이런 거 없다)는 없다.
    // 최상위 부모 객체는 Object 객체다.
//    다형성의 궁극적 목표: 타입의 규격화(예를 들면 객체를 배열에 넣어서 관리할 때 같은 타입으로 넣어서 관리 용이)
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    /*
    다형성이란 자식 객체가 모든 부모의 타입을 가질 수 있다는 것을 의미함.
    즉, 부모 타입의 변수에 자식 객체의 주소값을 얼마든지 저장할 수 있다.
    */

    A v1 = new B(); // 클래스 타입 B -> A 타입으로 자동 형 변환(promotion)
    A v2 = new C();
    A v3 = new D();
    A v4 = new E();

    B v6 = new D();
    C v7 = new E();
    // 상속 관계가 없다면 다형성 적용이 불가능하다.
    // 즉, 다형성은 무조건 상속 관계 하에서만 발생한다.
//    B v8 = new C(); (x) 부모는 같지만 남이다.
//    C v9 = new D(); (x)
//    B v10 = new E(); (x)
//    D v11 = new E(); (x)

    // Object는 자바의 최상위 클래스입니다.
    // 모든 객체는 Object의 자식입니다.
    // Object 타입의 변수에는 어떠한 객체도 들어올 수 있습니다.
    Object o1 = new A(); //java.lang 클래스는 import하지 않아도 컴파일할 때 모두 자동으로 끌어옴.
    Object o2 = new B();
    Object o3 = new C();
    Object o4 = new D();
    Object o5 = new E();
    Object o6 = new String("안녕하세요!");
    Object o7 = new Basic();
   // 그러면 Object 클래스로 다 규격화하면 되는 거 아닌가???? 아니다! 단점 존재
}
