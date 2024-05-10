package etc.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;

public class Mapping {

    // 이름과 칼로리만 가진 클래스 설계(내부 클래스)
    private static class SimpleDish {
        private String name;
        private int calories;

        public SimpleDish(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        public SimpleDish(Dish dish) {
            this.name = dish.getName();
            this.calories = dish.getCalories();
        }

        @Override
        public String toString() {
            return "SimpleDish{" +
                    "name='" + name + '\'' +
                    ", calories=" + calories +
                    '}';
        }
    }

    private static class DishNameType {
        private String name;
        private Dish.Type type;

        public DishNameType(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }

        @Override
        public String toString() {
            return "DishNameType{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }

    public static void main(String[] args) {
        // stream의 map : 컬렉션(리스트, 셋, 맵...)에서 원하는 정보만 추출하여
        // 새로운 컬렉션으로 반환해 줌

        List<Integer> caloriesList = menuList.stream()
                .map(dish -> dish.getCalories())
                .collect(Collectors.toList());
        System.out.println("caloriesList = " + caloriesList);


        System.out.println("=======================================");

        /*
            요리 목록에서 메뉴 이름과 칼로리를 추출하고 싶다.
         */
        menuList.stream()
                .map(dish -> new SimpleDish(dish))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        /*
            요리 목록에서 칼로리가 500 칼로리보다 큰 음식들을 필터링한 후에
            음식의 이름과 타입만을 추출해서 출력해 주세요.
        */
        System.out.println("=============== 500칼로리 넘는 음식 이름과 타입만 추출하기=================");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(DishNameType::new)
                .forEach(System.out::println);
    }
}
