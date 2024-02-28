package oop.abs;

public class MainClass {
    public static void main(String[] args) {
        
        /*
         - 추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기 때문에
          프로그래머의 오버라이딩 실수를 방지할 수 있고, 부모 클래스에서
          메서드를 선언할 때 메서드 내부에 어떤 내용을 써야 할지 막연할 때도
          구현하기가 편합니다.
          
         - 다형성을 적용한 경우에도 안전하게 사용이 가능합니다.

         - 추상 클래스는 미완성 클래스이기 때문에 스스로의 객체를 생성하지 못합니다.
         무조건 자식을 통해서 실체화 되어야 합니다.
         Pet p = new Pet("애완동물", "몰라", 4); (x)
        */
        
        
        Pet dog = new Dog("뽀삐", "푸들", 3);
        Cat cat = new Cat("둥냥", "스코필드", 4);
        GoldFish fish = new GoldFish("니모", "잉어", 1);

        Pet[] pets = {dog, cat, fish};
        for (Pet p : pets) {
            System.out.println("-----------------------------------");
            System.out.println(p.sayHello());
            p.takeNap();
            p.eat();
            p.walk();
        }


    }
}
