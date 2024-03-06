package etc.enum_;

import util.Utility;

import static util.Utility.makeLine;

public class MainClass {
    public static void main(String[] args) {

        Developer kim = new Developer();
        kim.name = "김춘식";
        kim.career = 3;
        kim.lang = Language.JAVA; // enum Language 타입의 객체 생성

        Developer hong = new Developer();
        hong.name = "홍길동";
        hong.career = 10;
        hong.lang = Language.PYTHON;

        Developer park = new Developer();
        park.name = "박뚜띠";
        park.career = 5;
        park.lang = Language.JAVASCRIPT;

        System.out.println("kim 주력 언어 = " + kim.lang);
        System.out.println("hong 주력 언어 = " + hong.lang.getName());
        System.out.println("park 주력 언어 = " + park.lang.getName());

        makeLine();

        // values() : 열거형 타입에 존재하는 모든 상수를 배열에 담아서 리턴
        Language[] values = Language.values();
        for (Language lang : values) {
            System.out.println(lang);
        }

        makeLine();
        // ordinal(): 열거형 타입에 열거되어 있는 순서를 int 정수값으로 리턴
        // 나중에 데이터베이스 연동할 때 enum 객체를 DB에 넣을 수 없으므로 이 메서드가 유용하게 쓰임
        // 또는, getName()해서 name을 받아 String을 DB에 넣음
        System.out.println("park.lang은 enum 클래스 몇 번째에 있는가? " + park.lang.ordinal()); // 인덱스처럼 0부터 시작

        makeLine();

        // valueOf("문자열") : 매개값으로 전달된 문자열과 일치하는 요소를 리턴
        System.out.println(Language.valueOf("CPP"));
        // 주의: 없는 매개값 전달하면 예외발생
        // System.out.println(Language.valueOf("메롱")); (x)

    }
}
