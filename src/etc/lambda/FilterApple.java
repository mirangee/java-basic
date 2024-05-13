package etc.lambda;

import java.util.ArrayList;
import java.util.List;

// 사과를 여러가지 방법으로 필터링
public class FilterApple {
    /**
     * @solution - try1: 사과 바구니에서 GREEN색 사과만 필터링하자
     * @param1 - 전체 사과가 들어있는 바구니
     * @return - 녹색 사과만 필터링된 바구니
     * @problem - 만약에 다른 색깔의 사과를 필터링해야 한다면??
     *            새로운 메서드를 선언해야 함...
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {
        // 녹색 사과만 담을 바구니
        List<Apple> greenBasket = new ArrayList<Apple>();
        
        // 반복문을 통한 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenBasket.add(apple);
            }
        }

        return greenBasket;
    }

    /**
     * @solution - try2: 색상을 파라미터화 하자!
     * @problem - 만약에 필터 기준이 색상이 아니라 무게라면??
     */
    public static List<Apple> filterAppleByColor(List<Apple> basket, Color color) {
        List<Apple> filteredBasket = new ArrayList<Apple>();

        // 반복문을 통한 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }

    /**
     * @solution - try3: 조건식 자체 동작을 파라미터와 하면 해결 된다!
     *           - 자바스크립트 콜백 함수처럼 함수를 전달 받을 수 있다면?
     *           - 자바는 함수를 전달할 수 있는가?
     *              -> 자바 함수는 일급 객체가 아니므로 불가능하다.
     *              -> 함수 개념이 아니라 객체에 소속된 메서드 개념이기 때문
     *           - 그런데 전달되는 함수가 고정되어 있는가?
     *              -> 필터 조건에 따라 함수 내용이 달라야 한다.
     *              -> 그러면 어떻게 함수 이름이 통일 되면서 다른 내용을 전달할 수 있을까?
     *                      -> 오버라이딩(상속, 인터페이스)
     *
     * @problem - 이 방식은 rpedicate를 implment한 객체를 계속 생성해야 하는데 너무 비효율적이지 않은가?
     *      *          - 익명 클래스를 선언해 사용해 보자! Main.java로 이동해서 살펴보자.
     */

    public static List<Apple> filterApple(List<Apple> basket, ApplePredicate predicate) {
        // 필터링 된 사과만 담을 바구니
        List<Apple> filteredBasket = new ArrayList<>();
        // 반복문을 통한 필터링
        for (Apple apple : basket) {
            if (predicate.test(apple)) {
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }

    /**
     * @solution - try4:제네릭 필터 메서드 생성
     * @description - 지금까지 선언된 것들은 오직 apple만 필터링이 가능했다.
     *              - 제네릭 인터페이스를 선언해 apple 타입이 아닌 것들도 필터 가능하도록 수정
     */

    // return 타입에 <T> List<T>로 명시해줘야 한다.
    public static <T> List<T> filter(List<T> basket, GenericPredicate<T> predicate) {
        //필터링된 객체만 담을 바구니
        // 필터링 된 사과만 담을 바구니
        List<T> filteredBasket = new ArrayList<>();
        // 반복문을 통한 필터링
        for (T t : basket) {
            if (predicate.test(t)) {
                filteredBasket.add(t);
            }
        }
        return filteredBasket;
    }
}
