package oop.this_super;

public class Hunter extends Player {
    String pet;

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("# 애완동물: " + pet);
    }
}
