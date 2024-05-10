package etc.stream;

import java.util.Comparator;
import java.util.Optional;

import static etc.stream.Menu.menuList;

public class Finding {
    public static void main(String[] args) {
        // 음식 메뉴 중에 채식주의자가 먹을 수 있는 요리가 있는가
        boolean flag1 = menuList.stream()
                .anyMatch(dish -> dish.isVegetarian()); // 조건에 맞는 게 하나라도 있으면 true를 반환
        System.out.println("flag1 = " + flag1);

        // 음식 메뉴 중에 500 칼로리 이상인, 채식주의자가 먹을 수 있는 요리가 있는가?
        boolean flag = menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .anyMatch(dish -> dish.isVegetarian()); // 조건에 맞는 게 하나라도 있으면 true를 반환
        System.out.println("flag = " + flag);

        // 음식 메뉴 중에 칼로리가 50 미만인 음식이 있는가?
        boolean flag2 = menuList.stream()
                .anyMatch(dish -> dish.getCalories() < 50);
        System.out.println("flag2 = " + flag2);

        // 음식 메뉴 중 모든 요리가 1000 칼로리 미만인가요?
        boolean flag3 = menuList.stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("flag3 = " + flag3);

        // 음식 메뉴 중 모든 요리가 100 칼로리 미만이 아닌가요?
        boolean flag4 = menuList.stream()
                .noneMatch(dish -> dish.getCalories() < 100);
        System.out.println("flag4 = " + flag4);

        // 음식 메뉴 중 칼로리가 제일 낮은 음식은 무엇인가요?
        Dish dish = menuList.stream()
                .min( (o1, o2) -> o1.getCalories() - o2.getCalories()).get(); // o1과 o2를 뺀 후 작은 수를 남겨놓고 마지막에 남은 수를 get()
        System.out.println(dish);

        Dish dish1 = menuList.stream()
                .min(Comparator.comparing(d -> d.getCalories())).get();
        System.out.println(dish1);

        Dish dish2 = menuList.stream()
                .min(Comparator.comparing(Dish::getCalories)).get();
        System.out.println(dish2);

        // 음식 메뉴 중 칼로리가 제일 높은 음식은 무엇인가요?
        Dish dish3 = menuList.stream()
                .max(Comparator.comparing(Dish::getCalories)).get();
        System.out.println(dish2);
    }
}
