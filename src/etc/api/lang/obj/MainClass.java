package etc.api.lang.obj;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

    public static void main(String[] args) {

        Person kim = new Person("홍길동", 25);
        Person hong = new Person("홍길동", 25);



        // 객체 타입의 변수를 출력하거나 값을 얻을 때는
        // 뒤에 자동으로 .toString()이 붙어서 진행됩니다. (Object 클래스가 물려주는 메서드)

        System.out.println(kim);
        System.out.println(hong);

        if (kim.equals(hong)) {
            System.out.println("이름과 나이가 같네요~");
        } else {
            System.out.println("이름이 다를 수도, 나이가 다를 수도, 혹은 둘 다 다를 수도...");
        }

//        System.out.println(kim.hashCode());
//        System.out.println(hong.hashCode());
//
//        Set<Person> set = new HashSet<>();
//        set.add(kim);
//        set.add(hong);
//        System.out.println(set);

        // finalize는 gc를 호출하는 순서가 보장되지 않기 때문에 사용 권장하지 않음(deprecated)
        hong = null;
        kim = null;
        System.gc(); // 가비지 콜렉터를 호출
        // (부른다고 바로 안 올 수 있다.. 자기 알고리즘에 따라 다른 거 먼저 처리할 수 있음)
        // 그렇기에 finalize 메서드는 실행 순서를 보장 받을 수 없기에 비권장됨.

        Person park = new Person("박복제인간", 132);
//        Person clonePerson = park; 이건 복제가 아니다.
        try {
            Person clonePerson = (Person) park.clone();
            System.out.println("복사된 객체 정보 " + clonePerson);
            park.setName("박영희");
            System.out.println(park);
            System.out.println(clonePerson);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
