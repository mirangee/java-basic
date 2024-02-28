package oop.abs;

public class Dog extends Pet {

    // 자식 클래스가 생성될 때 꼭 부모 생성자가 있어야 한다.
    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("방석 위에 누워서 잡니다.");
    }

    @Override
    public void eat() {
        System.out.println("사료 통의 밥을 먹습니다.");
    }

    @Override
    public void walk() {
        System.out.println("공원에서 뽈뽈뽈");
    }
}
