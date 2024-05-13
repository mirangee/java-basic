package etc.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class 람다스트림정리 {

    public static List<String> getHealthyDishName(List<Dish> menu) {
         /*
            요리 목록에서 칼로리가 400 칼로리보다 작은 요리들만 추출해서
            칼로리가 낮은 순으로 오름차 정렬한 후
            그 요리들의 이름만 추출해서 리스트로 만들고 싶어요~
        */

        // 스트림을 사용하지 않은 코드
        List<Dish> lowCalorieDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400) {
                lowCalorieDishes.add(dish);
            }
        }

        // 칼로리가 낮은 순으로 오름차 정렬
        lowCalorieDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return o1.getCalories() - o2.getCalories();
            }
        });
        
        // 정렬된 리스트에서 이름만 뽑은 리스트를 만들자
        List<String> dishNames = new ArrayList<>();
        for (Dish dish : lowCalorieDishes) {
            dishNames.add(dish.getName());
        }
        return dishNames;
    }
    
    // 스트림을 사용한 코드
    public static List<String> getHealthyDishNames2(List<Dish> menu) {
        return menu.stream()
                .filter(dish -> dish.getCalories() < 400) // 400 칼로리 미만 거르기
                .sorted(Comparator.comparing(dish -> dish.getCalories())) // 칼로리 기준으로 오름차 정렬
                .map(dish -> dish.getName())// 이름만 뽑아서 
                .collect(Collectors.toList()); // 리스트로 포장
    }

    public static void main(String[] args) {
        List<String> healthyDishName = getHealthyDishName(Menu.menuList);
        System.out.println("healthyDishName = " + healthyDishName);

        List<String> healthyDishNames2 = getHealthyDishNames2(Menu.menuList);
        System.out.println("healthyDishNames2 = " + healthyDishNames2);
    }
}
