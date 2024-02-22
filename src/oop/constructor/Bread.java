package oop.constructor;

public class Bread {
    String breadName;
    int breadPrice;
    String breadIngredient;

    // 기본 생성자를 자동으로 만들어 주는 것은 생성자가 하나도 선언되어 있지 않을 때만
    // 자동으로 생성됩니다.
    // 매개값을 아무것도 받지 않는 기본 생성자는 클래스 내에 존재하는 편이 좋습니다.
    // 매개값을 받는 여러 생성자를 이용할 수도 있지만, 기본 형태로 생성되어야 할 일도 있기 때문

    Bread() {}


    Bread(String name, int price, String ingredient) {
        breadName = name;
        breadPrice = price;
        breadIngredient = ingredient;
    }

    void showResult() {
        System.out.println("***** 빵 정보 *****");
        System.out.println("이름: " + breadName);
        System.out.println("가격: " + breadPrice + "원");
        System.out.println("주재료: " + breadIngredient);
    }

}
