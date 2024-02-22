package basic.array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        /*
         1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.
         2. 입력받은 이름이 배열 내에 없다면 없다고 얘기해 주세요.

         - 추가
         배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
         더 이상 지울 친구가 없다면 프로그램 종료.
    */

        while (true) {
            if(kakao.length == 0) {
                System.out.println("모든 친구를 삭제했습니다.");
                break;
            }

            System.out.println("현재 친구 목록: " + Arrays.toString(kakao));
            System.out.print("삭제할 친구를 입력하세요: ");
            String targetName = sc.next();

            // 삭제할 친구 탐색 후 인덱스 저장
            int idx = -1;
            for (int i = 0; i < kakao.length; i++) {
                if (targetName.equals(kakao[i])) {
                    idx = i;
                    break;
                }
            }

            if (idx != -1) {
                // 해당 인덱스 포함하여 이후 값들을 하나씩 당겨준다.
                for (int j = idx; j < kakao.length - 1; j++) {
                    kakao[j] = kakao[j + 1];
                }

                // kakao보다 하나 작은 배열 temp를 생성하여 대입시켜준다.
                String[] temp = new String[kakao.length - 1];
                for (int k = 0; k < temp.length; k++) {
                    temp[k] = kakao[k];
                }

                // kakao에 temp의 주소값을 대입시킨 뒤 temp를 소멸시킨다.
                kakao = temp;
                temp = null;

            } else {
                System.out.printf("%s은(는) 리스트에 없습니다\n", targetName);
            }
        }
    }
}
