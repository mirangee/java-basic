package basic.datatype;

public class FloatExample {
    public static void main(String[] args) {

        // 실수 리터럴의 기본 데이터 타입은 double입니다.
        float f1 = 7.12345F;
        double d1 = 7.12345;

        /////////////////////////////////////////////////////

        float f2 = 1.234567891234F; // 1.2345679 (끝자리 반올림)
        double d2 = 1.234567891234; // 1.234567891234

        System.out.println("f2 = " + f2);
        System.out.println("d2 = " + d2);
    }
}
