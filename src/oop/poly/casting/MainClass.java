package oop.poly.casting;

public class MainClass {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.n1 = 1;
//        p.n2 = 2; (x) 부모는 자식 필드에 대한 정보가 없다.
        p.method1();
        p.method2();
//        p.method3(); (x) 부모는 자식 메서드에 대한 정보가 없다.

        System.out.println("---------------------------------");

        Child c = new Child();
        c.n1 = 5; // 부모에게 물려받은 필드
        c.n2 = 10; // 자식 고유의 필드

        c.method1(); // 부모에게 물려받은 메서드
        c.method2();
        c.method3();

        System.out.println("---------------------------------");
        // 다형성 적용(promotion)
        Parent p2 = new Child();
        p2.n1 = 1;
//        p2.n2 = 2; (x)

        p2.method1();
        p2.method2(); // "재정의한 2번 메서드 호출" 자식 객체가 맞다는 걸 알 수 있음.
//        p2.method3(); (x)
        /*
        다형성의 한계 :
        데이터타입은 해당 공간에 대한 정보임. 그 정보를 통해서 주소에 접근하는 것.
        따라서 Parent 타입은 Parent가 물려준 정보밖에 보지 못한다.
        부모 타입으로 자식 객체에 접근할 때 자식 객체의 고유한 필드와 메서드에 접근할 수가 없다.

        해결 방법 -> 부모 타입 변수에 저장된 주소값을 자식 타입 변수에 넘긴 후 자식 타입으로 접근하라.
        (자식 객체를 다시 선언하는 건 아님).
         */

        /*
         - 다형성이 적용되면 자식 클래스의
          본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
          (부모의 정보로 자식객체에 접근하면 자식이 확장한 개념에 대한 정보를 알 방법이 없다.)
         - 이를 해결하기 위해 강제 타입 변환을 사용합니다. (클래스 타입의 다운캐스팅)

         */
        Child c2 = (Child) p2; // 부모타입을 자식타입으로 강제변환(DownCasting)
        c2.n2 = 2;
        c2.method3();
        // 객체가 2개 생성된 것이 아닙니다. 하나의 객체에 접근 방식을 두 가지로 늘린 것입니다.
        System.out.println("p2 = " + p2);
        System.out.println("c2 = " + c2);

        //Object 타입의 변수는 어떠한 객체든 담을 수 있지만,
        // 객체 고유의 기능을 사용하기 위해서는 형 변환이 거의 항상 필요하다.
        // Object가 물려주는 매서드 자체가 별로 없음.
        Object obj = new String("안녕하세요!");
//        System.out.println("문자열의 길이: " + obj.length()); (x) Object 타입은 String의 고유 메서드에 접근할 수 없다.
        String str = (String) obj; //obj의 타입을 str로 강제 다운캐스팅
        System.out.println("문자열의 길이: " + str.length());

        // 다형성이 한번도 발생하지 않은 경우에는 강제 형변환을 사용할 수 없다. 빨간줄이 생기진 않지만 100퍼 에러.
        Parent ppp = new Parent();
//        Child ccc = (Child) ppp; (x) 부모 객체를 자식 타입 변수에 넣을 수 없다.
        // 객체가 생성될 때 자동으로 부모 생성자를 타게된다. 그런데 지금 상황에선 Child 객체에 대한 정보가 전혀 없다.


    }
}
