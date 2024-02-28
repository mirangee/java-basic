package oop.inter.animal;

public class MainClass {
    public static void main(String[] args) {

//        Animal a = new Animal(); (x) 인터페이스는 객체를 생성할 수 없다.
        /*
        - 다형성은 상속이 전제되어야 하는 것이 원칙이지만
        예외적으로 인터페이스와 클래스 간의 구현 관계에서 다형성 발생을 허용한다.
        인터페이스 타입의 구현 객체 허용.
         */
        Animal duck = new Duck();
        Huntable bulldog = new Bulldog();
        Violent shark = new Shark();
        BadAnimal bear = new Bear();


        /*
         - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
          정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.

         - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
          구현하는 클래스들끼리 서로 즉시 형 변환이 가능합니다.
        */

        // bear의 타입은 BadAnimal -> feed()에 대한 정보가 없음 -> Animal 타입으로 즉시 형 변환 진행
        // -> 바로 형 변환이 가능한 것은 Bear 클래스가 Animal과 연관이 있기 때문.
        ((Animal)bear).feed("과일");

        // 클래스는 상속 관계에서만 형 변환이 가능하지만
        // 인터페이스는 연결만 되어 있으면 바로 형 변환이 가능하다. (캡처본 참고)
        Animal[] animals = {duck, (Animal) bulldog, (Animal) shark, (Animal) bear};
    }
}
