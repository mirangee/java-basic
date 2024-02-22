package basic.array;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        /*
         # 2차원 배열
         - 배열 안에 배열이 존재하는 형태
         - 실제 배열에는 배열의 주소값이 들어간다.
        */

//        int[] arr = {1, 2, 3};
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12, 13, 14}
        };

        System.out.println(arr.length);
        System.out.println("arr[0] = " + arr[0]); // 배열의 주소값이 나온다.
        System.out.println("arr[0] = " + Arrays.toString(arr[0])); // 배열의 내용을 보려면 Arrays.toString()사용
        System.out.println("arr[0] = " + Arrays.toString(arr[1]));
        System.out.println("arr[0] = " + Arrays.toString(arr[2]));

        System.out.println("========================");

        // 더블 인덱싱 가능 (두번째 배열의 특정 값을 확인하고 싶을 때)
        System.out.println("arr[1][2] = " + arr[1][2]); //6
        System.out.println("arr[2][0] = " + arr[2][0]); //7


        System.out.println("===============================================");

        // 2차원 배열 내부의 배열 요소를 한 눈에 확인할 수 있는 메서드
        System.out.println(Arrays.deepToString(arr)); // String 타입으로 return 됨.

        System.out.println("===============================================");

        // 빈 2차원 배열 만들기
        int[][] arr2 = new int[3][4];
        System.out.println(Arrays.deepToString(arr2));

        System.out.println("===============================================");
        arr2[1][2] = 50;
        arr2[2][1] = 70;

        // 반복문으로 배열 속 요소 확인하기
        for (int[] array : arr2) {
            for (int n : array) {
                System.out.print(n + " ");
            }
            System.out.println(); // 단순 줄 개행
        }

        System.out.println("===============================================");


    }
}
