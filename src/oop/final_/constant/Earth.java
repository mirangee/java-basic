package oop.final_.constant;

public class Earth {

    /*
     # 상수 (constant)

     - 상수는 고정(final)된 불변(static)의 값입니다. 따라서 어디에서 접근을 하더라도
      같은 값이 나와야 하며, 값의 변경 또한 불가능해야 합니다.

     - 따라서 자바에서는 상수를 선언할 때 static, final을 동시에 사용합니다.

     - 상수는 식별자를 대문자로 작성하는 것이 관례다.
     두 단어를 합쳐 식별자를 만들 때 카멜 케이스가 불가하므로
     예외적으로 언더 스코어(_)를 허용한다.
     */

    static final double RADIUS = 6400;

    static final double SURFACE_AREA;

    static {
        SURFACE_AREA = RADIUS * RADIUS * 4 * Math.PI;
    }


}
