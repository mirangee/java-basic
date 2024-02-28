package oop.abs;

public class Cat extends Pet {

    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("캣타워에 널부러져 잡니다.");
    }

    @Override
    public void eat() {
        System.out.println("유기농 통조림을 먹습니다.");
    }

    @Override
    public void walk() {
        System.out.println("집안을 어슬렁");
    }
}
