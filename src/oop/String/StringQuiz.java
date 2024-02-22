package oop.String;

import java.util.Scanner;

public class StringQuiz {
    public static void main(String[] args) {
        /*
         1. 주민등록번호 13자리를 입력받습니다.
         2. 주민등록번호는 -을 포함해서 받을 예정입니다.
         3. 13자리가 아니라면 다시 입력받습니다.
         4. 예) 
            921013-1234567 -> 1992년 10월 13일 32세 남자
            960223-2345678 -> 1996년 2월 23일 28세 여자
            031125-3456789 -> 2023년 11월 25일 21세 남자
            031125-4123456 -> 2023년 11월 25일 21세 여자

         제대로 출력될 때까지 다시 입력 받으세요.
         */

        Scanner sc = new Scanner(System.in);
        int birthYear = 0;
        String birthMonth;
        String birthDate;
        int age = 0;
        String gender = "";

        while (true) {
            System.out.println("주민등록번호 13자리를 입력하세요(형식: YYMMDD-1234567)");
            System.out.print(">>");
            String number = sc.next();

            String trimmedNumber = number.trim();
            String birthInfo = trimmedNumber.split("-")[0];
            char genderId = trimmedNumber.split("-")[1].charAt(0);
            
            // 입력값 유효성 검사
            if(!trimmedNumber.contains("-") || trimmedNumber.length() != 14 || birthInfo.length() != 6) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }

            if(genderId == '1' || genderId == '3') {
                gender = "남자";
            } else if(genderId == '2' || genderId == '4') {
                gender = "여자";
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요");
                continue;
            }

            birthYear = Integer.parseInt(birthInfo.substring(0,2));
            birthMonth = birthInfo.substring(2,4);
            birthDate = birthInfo.substring(4);

            if (genderId == '1' || genderId == '2') {
                birthYear += 1900;
            } else {
                birthYear += 2000;
            }
            age = 2024 - birthYear;
            break;
        }
        System.out.printf("%d년 %s월 %s일 %d세 %s",birthYear, birthMonth, birthDate, age, gender);

        sc.close();
    }
}
