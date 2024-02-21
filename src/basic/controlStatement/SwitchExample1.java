package basic.controlStatement;

import java.util.Scanner;

public class SwitchExample1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("성별을 입력하세요.(M/F)");
        System.out.print(">");
        String gender = sc.next();

        switch (gender) {

            /*
                switch 괄호 안에 지정하신 기준값에 따라
                만족하는 case문을 순서대로 탐색합니다.
                적합한 case가 존재하는 경우에는 해당 case에
                종속된 문장을 실행합니다.
                따로 조치가 없다면 나머지 케이스들이 연속적으로 실행됩니다.
            */

            case "m": // break를 걸지 않으면 다음 case로 코드가 흐르는 것을 응용
            case "M":
                System.out.println("남성입니다.");
                break; // 해당 케이스만 실행하고 switch문 종료

            case "f": case "F": // 주로 이렇게 가로로 작성한다.
                System.out.println("여성입니다.");
                break;

            default: // case를 설정하지 않은 값들은 모두 default로 빠진다.
                System.out.println("잘못된 입력입니다.");
        }
    }
}













