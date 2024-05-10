package etc.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    // 사과의 색상만 추출
    public static List<Color> mappingAppleByColor(List<Apple> apples) {
        List<Color> colorList = new ArrayList<>();
        for (Apple apple : apples) {
            colorList.add(apple.getColor());
        }
        return colorList;
    }

    public static <X, Y> List<Y> map(List<X> list, GenericFunction<X,Y> mapper) {
        List<Y> mappedList = new ArrayList<>();
        for (X x : list) {
            Y y = mapper.apply(x); // x에서 y를 추츨 <- 이 동작을 파라미터화 시키겠다!
            mappedList.add(y);
        }
        return mappedList;
    }
}
