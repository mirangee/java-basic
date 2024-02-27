package oop.obj_arr;

/*
     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
      담을 수 있는 객체를 디자인하세요.

     - 학생의 모든 정보를 한 눈에 확인할 수 있게
      scoreInfo() 메서드를 선언해 주세요.
      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
*/

public class Score {
    private String name;
    private int korean;
    private int english;
    private int math;
    private int total;
    private double avg;

    Score() {
    }

    ;

    Score(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        scoreTotal(korean, english, math);
        scoreAvg(korean, english, math);
    }

    public void scoreInfo() {
        System.out.println("****** 성적 정보 ******");
        System.out.println("이름: " + this.name);
        System.out.println("국어: " + this.korean);
        System.out.println("영어: " + this.english);
        System.out.println("수학: " + this.math);
        System.out.println("총점: " + this.total);
        System.out.println("평균: " + this.avg);
    }

    private void scoreTotal(int korean, int english, int math) {
        this.total = korean + english + math;
    }

    private void scoreAvg(int korean, int english, int math) {
        this.avg = (double) (korean + english + math) / 3;
    }

}
