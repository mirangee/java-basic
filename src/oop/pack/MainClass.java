
// 패키지 선언은 항상 클래스 최상단에 위치해야 한다.
package oop.pack;

// 작성 중인 패키지와 다른 곳에 위치한 클래스 정보를 불러오려면 import가 필요하다.
//import oop.pack.fruits.Apple;
//import oop.pack.fruits.Banana;
//import oop.pack.fruits.Melon;

// *로 한 패키지 안에 있는 모든 클래스를 import할 수 있다.
import oop.pack.fruits.*;


public class MainClass {
    public static void main(String[] args) {

        Apple aFromFruits = new Apple();
        // 다른 패키지 내에 같은 이름을 가진 클래스 객체를 생성할 때는
        // 반드시 패키지 경로를 직접 명시해 주어야 한다.
        oop.pack.Juice.Apple aFromJuice = new oop.pack.Juice.Apple();

        Banana b = new Banana();
        Melon m = new Melon();

        // import를 안 해도 다음과 같이 참조할 수도 있긴 하다. 하지만 비추!!!
        java.util.Scanner sc = new java.util.Scanner(System.in);



    }

}
