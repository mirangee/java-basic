package oop.inter.animal;

public class Bulldog extends Livings implements Violent, Huntable {


    @Override
    public void feed(String foodName) {
        System.out.println("불독이 " + foodName + "을  먹어요.");
    }

    @Override
    public boolean sleep() {
        return false;
    }

    @Override
    public void angry() {
        System.out.println("불독이 으르렁거려요.");
    }

    @Override
    public void fight() {
        System.out.println("불독이 싸움을 겁니다.");
    }

    @Override
    public void hunt(Animal animal) {
        System.out.println("불독이 사냥을 합니다.");
    }
}
