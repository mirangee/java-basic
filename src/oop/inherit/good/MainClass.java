package oop.inherit.good;

public class MainClass {
    public static void main(String[] args) {
        Worrior w1 = new Worrior();
        w1.name = "전사";
        w1.level = 1;
        w1.atk = 3;
        w1.hp = 50;
        w1.rage = 60;
        w1.characterInfo();

        System.out.println("------------------------");

        Mage m1 = new Mage();
        m1.name = "법사";
        m1.level = 1;
        m1.atk = 2;
        m1.hp = 50;
        m1.mana = 100;
        m1.characterInfo();

        System.out.println("-----------------------");

        Hunter h1 = new Hunter();
        h1.name = "사냥꾼";
        h1.level = 1;
        h1.atk = 3;
        h1.hp = 100;
        h1.pet = "둥냥이";
        h1.characterInfo();
    }





}
