package etc.api.lang.math;

public class MathExample {
    public static void main(String[] args) {

        // 올림
        int ceil = (int) Math.ceil(1.1);
        System.out.println("ceil = " + ceil);

        // 내림
        int floor = (int) Math.floor(1.5);
        System.out.println("floor = " + floor);

        // 반올림
        // 소수점 둘째자리까지 표현
        double round = (double) Math.round(3.141592 * 100) / 100;
        System.out.println("round = " + round);
        
        // 제곱
        double pow = Math.pow(3.0, 4.0);
        System.out.println("pow = " + pow);

        // 최대값 (둘 중에 누가 큰지 비교해서 리턴)
        int max = Math.max(2, 10);
        System.out.println("max = " + max);

        // 최소값
        int min = Math.min(3, 8);
        System.out.println("min = " + min);

        // 절대값
        int abs = Math.abs(-77);
        System.out.println("abs = " + abs);
    }

}
