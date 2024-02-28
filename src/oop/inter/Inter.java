package oop.inter;

/*
    - 인터페이스: 객체의 규격(기능)을 표준화해서 명세하는 역할을 한다.
 */

public interface Inter {

    // 인터페이스에서 변수를 선언하면 상수(static final)로 인식합니다.
    int NUM = 5;

//    Inter() {
//          인터페이스는 생성자를 가질 수 없습니다. (객체화 될 수 없는 개념이기 때문)
//    }

    // 인터페이스에서 non-static 메서드를 선언하면 추상 메서드로 지정됩니다.
    void method1();

    public static void staticMethod() {
        System.out.println("static 메서드는 선언이 가능합니다~~");
    }

}
