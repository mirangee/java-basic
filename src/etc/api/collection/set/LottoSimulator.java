package etc.api.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {
    public static Random r = new Random();

    public static int prize1 = 0; // 1등 횟수 기억할 변수
    public static int prize2 = 0; // 2등 횟수 기억할 변수
    public static int prize3 = 0; // 3등 횟수 기억할 변수
    public static int prize4 = 0; // 4등 횟수 기억할 변수
    public static int prize5 = 0; // 5등 횟수 기억할 변수
    public static int failCnt = 0; // 미당첨 횟수 기억할 변수


    public static Set<Integer> createLotto() {
        /*
             - 1~45 범위의 난수 6개를 생성하셔서
              컬렉션 자료형에 모아서 리턴해 주세요.
              무엇을 쓰든 상관하지 않겠습니다.
              중복이 발생하면 안됩니다.
         */
        Set<Integer> set = new HashSet<>();
        while(set.size() != 6) {
             int n = r.nextInt(45) + 1;
             set.add(n);
        }
        return set;
    }
    
    // 보너스 번호 생성 메서드
    public static int createBonusNum(Set<Integer> win) {
        while (true) {
            int n = r.nextInt(45) + 1;
            if(!win.contains(n)) {
                return n;
            }
        }
    }

    // 당첨 등수 알려주는 메서드
    public static void checkLottoNumber(Set<Integer> win, Set<Integer> myLotto, int bonus) {
        /*
             매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
             내 로또 번호와 당첨번호를 비교하여
             일치하는 횟수를 세 주신 후 등수를 판단하세요.
             판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
             6개 일치 -> 1등
             5개 일치 + 보너스번호 일치 -> 2등
             5개 일치 -> 3등
             4개 일치 -> 4등
             3개 일치 -> 5등
             나머지 -> 꽝
         */
        int cnt = 0;
        boolean bonusFlag = false;
        for (Integer i : myLotto) {
            if (win.contains(i)) {
                cnt++;
            }
            if (bonus == i) {
                bonusFlag = true;
            }
        }

        if(cnt == 6) prize1++;
        else if (cnt == 5 && bonusFlag) prize2++;
        else if (cnt == 5) prize3++;
        else if (cnt == 4) prize4++;
        else if (cnt == 3) prize5++;
        else failCnt ++;
    }
    
    public static void main(String[] args) {
        
        // 당첨 번호를 고정하자.
        Set<Integer> win = createLotto();
        
        // 보너스 번호 하나 고정하자.
        int bonus = createBonusNum(win);

        int paper = 0;
        long cost = 0;
        while(true) {
            Set<Integer> myLotto = createLotto(); // 로또 구매(자동)
            paper++; cost += 1000;
            checkLottoNumber(win, myLotto, bonus); // 등수 확인

            if(prize1 == 1) {
                System.out.println("추카추카추");
                System.out.println("*** 누적 당첨 횟수 ***");
                System.out.println("2등: " + prize2);
                System.out.println("3등: " + prize3);
                System.out.println("4등: " + prize4);
                System.out.println("5등: " + prize5);
                System.out.println("미당첨 " + failCnt);
                System.out.println("*** 구매 기록 ***");
                System.out.println("구매 장수: " + paper);
                System.out.println("구매액: " + cost);
                break;// 1등 당첨 되면 반복문 종료
            } else {
                System.out.println("로또 " + paper + "장째 구매 중");
            }
        }



    }
}
