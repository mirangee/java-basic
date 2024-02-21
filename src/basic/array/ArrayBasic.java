package basic.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // # 배열(array)
        // -> 같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형

        // 1. 배열 변수를 선언
        int[] arr; // 이 방식으로 주로 선언
        int arr2[]; // c style

        // 2. 배열 객체를 생성 - 실제 값들이 저장될 공간을 형성
        // 생성할 때 배열의 크기를 지정해야 함.
        arr = new int[5];

        // 3. 배열의 초기화 - 배열 내부에 실제 값들을 저장
        // 배열의 초기화는 인덱스를 이용합니다.
        // 인덱스: 배열 내부의 위치를 지정할 수 있는 값
        // 인덱스는 0번부터 시작하여 1씩 순차적으로 증가합니다.

        arr[0] = 65;
        arr[1] = 88;
        arr[2] = arr[0];
        arr[3] = (int) 3.14;
//        arr[4] = "문자열이 들어갈까요?" (x)
        arr[4] = 100;
//        arr[5] = 200; (x) 인덱스 범위를 초과 (runtime exception - 문법상으론 오류 없으나 실행했을 때 오류 발생)

        // 4. 배열의 총 크기(길이) 확인 -> 배열변수명.length
        System.out.println("arr 배열의 길이: " + arr.length);

        // 5. 배열에 저장된 값을 참조(사용)하는 법 -> 인덱스를 활용
        System.out.println("배열의 1번째 데이터 = " + arr[0]);
        System.out.println("배열의 2번째 데이터 = " + arr[1]);
        System.out.println("배열의 3번째 데이터 = " + arr[2]);
        System.out.println("배열의 4번째 데이터 = " + arr[3]);
        System.out.println("배열의 5번째 데이터 = " + arr[4]);

        System.out.println("=============================");

        // 6. 배열의 반복문 처리
        // 배열은 인덱스를 제어변수로 활용하여 쉽게 반복문 처리가 가능
        for(int idx = 0; idx < arr.length; idx++) {
            System.out.printf("배열의 %d번째 데이터 = %d\n", idx+1, arr[idx]);
        }

        // 7. 배열 내부의 요소값을 문자열 형태로 한눈에 확인하기
        // 배열 변수에는 배열의 주소값이 들어있으므로 내부를 보려면 Arrays.toString(배열)을 활용
        System.out.println("arr = " + Arrays.toString(arr));

        // 8. 배열은 선언과 생성이 동시에 가능
        double[] dArr = new double[3];
        String[] sArr = new String[4];
        byte[] bArr = new byte[10];

        // 배열은 생성과 동시에 각 타입의 기본값으로 초기화됩니다.
        // (배열은 비어있지 않다!)
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(sArr));
        System.out.println(Arrays.toString(bArr));

        // 9. 배열의 생성과 동시에 초기화도 하는 방법
        char[] letters = new char[]{'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(letters));
        
        // 선언과 동시에 초기화할 때 딱 한번만 가능한 문법
        // 배열은 크기가 고정이기 때문에 늘어나거나 줄어들 수 없습ㄴ디ㅏ.
        // 만약 배열의 크기를 늘리거나 줄이고 싶다면
        // 기존 배열을 조작하는 것이 아니라 새롭게 생성해야 합니다.

        String[] names = {"홍길동", "김철수", "박영희"};
//        names = {"홍길동", "김철수", "박영희", "김뽀삐"}; 이미 생성된 후에는 추가 안 됨
        names = new String[] {"홍길동", "김철수", "박영희", "김뽀삐"}; //이건 가능
    }
}
