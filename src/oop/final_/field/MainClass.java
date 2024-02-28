package oop.final_.field;

public class MainClass {

    public static void main(String[] args) {
        
        Person kim = new Person("김철수");
//        kim.name = "김마이클"; (x) final 변수에 새로운 값을 대입할 수 없다.
//        kim.nation = "미국"; (x)
        kim.age = 30;

        Person park = new Person("박영희");
//        park.nation = "영국"; (x)
//        park.name = "박영국"; (x)
    }
}
