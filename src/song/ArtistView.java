package song;

import util.Utility;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static util.Utility.input;
import static util.Utility.makeLine;

// 화면단을 담당하는 클래스(콘솔)
// 대부분의 기능을 static으로 선언해 객체 생성 없이도 화면 띄울 수 있게 설계
public class ArtistView {
    private static ArtistRepository ar;
    static {
        ar = new ArtistRepository();
    }

    //메인 실행 기능
    public static void start() {

        // 세이브 파일 로드
        ar.loadData();

        while (true) {
            System.out.println("\n\n******* 음악 관리 프로그램 *******");
            System.out.println("#1.노래 등록하기");
            System.out.println("#2.노래 정보 검색하기");
            System.out.println("#3.저장하기");
            System.out.println("#4.프로그램 종료");

            makeLine();
            System.out.println("메뉴 번호 입력");
            String menuNum = input(">>");

            switch (menuNum) {
                case "1":
                    insertProcess();
                    break;
                case "2":
                    searchProcess();
                    break;
                case "3":
                    System.out.println("저장할게요");
                    ar.saveData();
                    break;
                case "4":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); // 프로그램 강제 종료
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력했어요.");
            }
        }
    }
    // 1번 메뉴
    private static void insertProcess() {
        System.out.println("\n# 노래 등록을 시작합니다.");
        String artistName = input("-가수명: ");
        String songName = input("-노래명: ");

        // 기존에 등록된 가수인가?
        if (!ar.isRegistered(artistName)) {
            // 아니라면 새 객체 생성 후 저장
            ar.addNewArtist(artistName, songName);
        } else {
            // 맞다면 기존 가수 정보에 노래만 추가
            boolean flag = ar.addNewSong(artistName, songName);
            if(!flag) {
                System.out.println(songName + " 이미 있는 노래여요.");
            } else {
                System.out.println("추가했슈");
            }
        }
    }

    // 2번 메뉴
    private static void searchProcess() {
        System.out.println("검색을 시작해요.");
        String artistName = input("-가수명: ");
        if (!ar.isRegistered(artistName)) {
            System.out.println("미등록된 가수여요.");
        } else {
            System.out.println("***** 노래 목록 *****");
            ar.showSongList(artistName);
        }
    }

}
