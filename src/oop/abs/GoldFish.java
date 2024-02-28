package oop.abs;

public class GoldFish extends Pet{

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void takeNap() {
        System.out.println("물 속에서 조용히 눈을 뜨고 있어요.");
    }

    @Override
    public void eat() {
        System.out.println("먹이 주는 주인의 손을 따라 움직입니다.");
    }
}
