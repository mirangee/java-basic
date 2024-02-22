package oop.constructor;

import java.sql.SQLOutput;

public class PhoneMain {
    public static void main(String[] args) {

        Phone basic = new Phone();
        basic.showSpec();

        System.out.println("------------------------");

        Phone galaxy = new Phone("galaxy s24");
        galaxy.showSpec();

        System.out.println("------------------------");
        Phone iphone = new Phone("아이폰 15", "스페이스 그레이");
        iphone.showSpec();
    }
}
