package oop.static_.init;

public class MainClass {

    public static void main(String[] args) {
        //

        /*
         - 정적 초기화자는 따로 호출하지 않아도 클래스를 로딩하면 자동 호출된다.
         # 클래스 로딩 방법
         1. 클래스의 이름을 참조하여 static 멤버를 호출
         2. 객체 생성

         - 정적 초기화자는 클래스 로딩 시 최초 1회만 호출되고 다시 호출할 순 없다.
         
         객체 멤버변수-> 생성자로 초기화
         클래스 static 변수 -> 정적 초기화자로 초기화
         */

//        DBManager manager = new DBManager();
        System.out.println("주소: " + DBManager.addr);
        System.out.println("아이디: " + DBManager.uid);
        System.out.println("패스워드: " + DBManager.upw);
    }

}
