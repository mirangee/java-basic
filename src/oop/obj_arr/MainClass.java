package oop.obj_arr;

import java.util.Arrays;
import java.util.Iterator;

public class MainClass {
    public static void main(String[] args) {

//        Person kim = new Person("김철수", 30, "남자");
//        Person lee = new Person("이영희", 25, "여자");
//        Person park = new Person("박지원", 50, "남자");
//
//        kim.personInfo();
//        lee.personInfo();
//        park.personInfo();

//        Person[] people = new Person[3];
//        people[0] = new Person("김철수", 30, "남자");

        Person[] people = {
                new Person("김철수", 30, "남자"),
                new Person("이영희", 25, "여자"),
                new Person("박지원", 50, "남자")
        };

//        System.out.println(Arrays.toString(people));

//        for (int i = 0; i < people.length; i++) {
//            people[i].personInfo();
//        }

        for (Person p : people) {
            p.personInfo();
        }



    }
}
