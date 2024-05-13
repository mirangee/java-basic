package etc.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static etc.stream.Menu.menuList;

public class Filtering {
    public static void main(String[] args) {

        // stream의 filter
        // 필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환

        // 메뉴 중에 채식주의자가 먹을 수 있는 음식들만 필터링
        List<Dish> dishForVegetarian = menuList.stream() // menuList 정보를 가진 stream 객체를 받음
                .filter(menu -> menu.isVegetarian()) // stream 객체의 filter를 호출(Predicate 인터페이스를 구현한 객체가 반환됨)
                .collect(Collectors.toList()); // 필터링된 stream 객체를 List로 변환해서 리턴

        dishForVegetarian.forEach(dish -> System.out.println(dish));


        // 만약 결과 출력만 보는 목적이라면 다음과 같이 한번에 print까지 처리할 수 있다.
        menuList.stream()
                .filter(menu -> menu.isVegetarian())
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println(dish)); // 리스트 내부 순회(반환 값 없이 void)

        System.out.println("========= 육류이면서 600 칼로리 미만 요리 필터링 ==========");
        menuList.stream()
                .filter(menu -> menu.getType() == Dish.Type.MEAT && menu.getCalories() < 600)
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println(dish));

        System.out.println("========= 요리 이름이 4글자인 요리 필터링 ==========");
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println(dish));

        System.out.println("========= 칼로리가 300 초과인 요리 필터링(상위 3개만) ==========");
        menuList.stream()
                .filter(menu -> menu.getCalories() > 300)
                .limit(3) // 먼저 조회된 상위 3개 데이터만 가지고 온다.
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println(dish));

        System.out.println("========= 칼로리가 300 초과인 요리 필터링(맨 앞 2개 제외하고) ==========");
        menuList.stream()
                .filter(menu -> menu.getCalories() > 300)
                .skip(2) // 조회된 것들 중 맨 앞 2개 제외 시킴
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println(dish));

        System.out.println("========= 메뉴 목록에서 처음 등장하는 생선 요리 2개 필터링 ==========");
        menuList.stream()
                .filter(menu -> menu.getType() == Dish.Type.FISH)
                .limit(2)
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println(dish));

        List<Integer> numbers = List.of(1, 2, 1, 3, 4, 5, 7, 2, 5, 6, 8, 9, 13,4);

        System.out.println("========= 짝수만 필터링 ==========");
        List<Integer> filteredNumber = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("filteredNumber = " + filteredNumber);
        
        // 중복제거
        Set<Integer> distinctNumbers = new HashSet<>(filteredNumber);
        System.out.println("distinctNumbers = " + distinctNumbers);

        System.out.println("========= 짝수만 필터링(중복제거 with steam ==========");
        List<Integer> filteredNumber2 = numbers.stream()
                .filter(number -> number % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("filteredNumber2 = " + filteredNumber2);

    }
}
