package oop.inter.animal;

// 인터페이스와 추상 클래스는 다른 개념이다.
// 추상 클래스는 필드를 가질 수 있지만 인터페이스는 불가하다.
// 인터페이스에는 기능만을 명세한다.
public interface Animal {

    // 내가 앞으로 만들 클래스의 기능을 명세
    void feed(String foodName);
    boolean sleep();

}
