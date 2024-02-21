package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.


        boolean flag = false;
        int i = 0;

        outer: while (!flag) {
            System.out.print("수정할 이름을 입력하세요: ");
            String name = sc.next();
            for (i = 0; i < kakao.length; i++) {
                if(name.equals(kakao[i])) {
                    System.out.println("*** 탐색 성공! 해당 인덱스: " + i);
                    System.out.println("");
                    flag = true;
                    break outer;
                }
            }
            if (!flag) {
                System.out.println("탐색 실패! 그 이름은 리스트에 없어요.");
                System.out.println("");
            }
        }
        System.out.println("=================================");
        System.out.print("새로운 이름을 입력하세요: ");
        String newName = sc.next();
        kakao[i] = newName;
        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

        sc.close();


    }
}
