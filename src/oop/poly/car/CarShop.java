package oop.poly.car;

public class CarShop {
    
    /*
     - 키워드 instanceof는 객체가 지정한 클래스 타입을 가질 수 있는
      객체인지를 검사할 때 사용하는 연산자 입니다.
      
     - instanceof를 기준으로 좌항의 객체가 우항의 클래스 타입을 가질 수
      있는지를 물어봐서 그렇다면 true, 그렇지 않다면 false를 도출합니다.
     */
    
    public void carPrice(Car c) {
        if(c instanceof Sonata) { // 좌항의 객체가 우항의 객체니?는 틀린 해석
            System.out.println("소나타의 가격은 3천만 원입니다.");
        }else if(c instanceof Tesla) {
            System.out.println("테슬라의 가격은 5천만 원입니다.");
        } else if(c instanceof Porche){
            System.out.println("포르쉐의 가격은 1억 원입니다.");
        }
    }


}
