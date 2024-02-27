package oop.poly.car;

public class MainClass {
    public static void main(String[] args) {

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Porche p1 = new Porche();
        Porche p2 = new Porche();
        Porche p3 = new Porche();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();

        // 10개의 객체들의 메서드를 호출하는 방법
        // 하나 하나 다 호출하는 방법 -> 작동은 하지만 비효율적
        // s1.run(); s2.run(); s3.run(); p1.run(); p2.run();....

        // 그럼 배열에 넣어서 반복처리를 하는 게 어떨까?
        // 배열은 동종모음이므로 객체들이 같은 타입이어야 함.

//        Sonata[] sonatas = {s1, s2, s3};
//        for (Sonata s : sonatas) {
//            s.run();
//        }
        // 위 같은 방식으로 하면 차 종 별로 배열을 여러개 선언해야 함..

        // 다형성을 활용해 부모 타입의 배열을 선언해서 모아보자!
        // 다형성을 적용해서 서로 다른 타입들을 모아놓을 수 있다.
        Car[] cars = {s1, s2, s3, p1, p2, p3, t1, t2, t3, t4};
        for (Car c : cars) {
            c.run();
        }
    
        System.out.println("============================================");
        // 매개변수에 다형성 적용
        Driver kim = new Driver();
        kim.drive(s1);
        kim.drive(p1);
        kim.drive(t1);

        System.out.println("============================================");
        // 리턴 타입에 다형성 적용(buyCar 메서드로 이동해서 코드를 볼 것)
        Car myTesla = kim.buyCar("테슬라");
        myTesla.run();

    }
}
