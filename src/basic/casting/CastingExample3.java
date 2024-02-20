package basic.casting;

public class CastingExample3 {
    public static void main(String[] args) {

        char c = 'B';
        int i = 2;

        int intResult = c + i;
        char charResult = (char) (c + i);
        System.out.println(intResult);
        System.out.println(charResult);
        
        int k = 10;
        double d = k / 4; // int를 int로 나누면 int 결과값 2만 남는다.
        System.out.println("d = " + d);
        
        // 연산하는 하나의 값을 double로 바꿔야 upcasting으로 double의 결과 2.5가 나온다.
        double d2 = k / 4.0;
        double d3 = (double) k / 4.0;
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        
    }
}
