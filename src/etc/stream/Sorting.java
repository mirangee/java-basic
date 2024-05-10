package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

public class Sorting {
    public static void main(String[] args) {

        // 음식 목록 중 칼로리가 낮은 순으로 정렬 (오름차순으로 정렬)
        System.out.println("=============== 음식 목록 중 칼로리가 낮은 순으로 정렬 (오름차순으로 정렬) ==============");
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 음식 목록 중 칼로리가 높은 순으로 정렬 (내림차순으로 정렬)
        System.out.println("=============== 음식 목록 중 칼로리가 높은 순으로 정렬 (내림차순으로 정렬) ==============");
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=============== 500 칼로리보다 적은 요리 중에 top3 필터링 ==============");
        menuList.stream()
                .filter(dish->dish.getCalories() < 500)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
