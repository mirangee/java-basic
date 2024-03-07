package video.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppUi {

    private static Scanner sc = new Scanner(System.in);

    public static String inputString(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int inputInteger(String message) {
        System.out.print(message);
        int num = 0;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("# 원하는 메뉴 번호를 올바로 입력해 주세요");
            sc.nextLine();
        }
        return num;
    }

    public static void makeLine() {
        System.out.println("===========================================");
    }

    // 시작 화면 출력
    public static void startScreen() {
        System.out.println("\n========= DVD 대여 관리 시스템 =========");
        System.out.println("### 1. 회원 관리 시스템");
        System.out.println("### 2. 대여 주문 관리 시스템");
        System.out.println("### 3. 영화 DVD 관리 시스템");
        System.out.println("### 4. 프로그램 종료");
        makeLine();
    }

}
