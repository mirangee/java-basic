package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // toString() : 객체의 정보(필드)를 문자열 형태로 리턴
    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }

    @Override
    // name, age 속성 값이 같으면 동일한 객체라고 반환하는 메서드로 오버라이딩하고자 한다.
    public boolean equals(Object obj) {
        if (this == obj) return true; // 주소값이 같으면 같은 객체임
        if (obj instanceof Person) {
            Person p = (Person) obj; // Object 타입을 Person 타입으로 형 변환 -> name과 age를 확인하기 위해
            if (this.name.equals(p.name) && this.age == p.age) {
                return true;
            }
        }
        return false;
    }

    //equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행해 주시는 것이 좋습니다.
    //equals를 재 정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
    //hashcode의 값도 그에 맞게 같이 재 정의가 되어야 합니다. (hash 주소를 equals에 맞게 정의)

    // 자바는 hash 알고리즘을 이용해 같은 객체는 같은 hash 코드 값을 갖도록 한다.
    // 만약 equals를 오버라이딩하면서 hashCode는 오버라이딩 하지 않으면
    // equals에서는 동등하다고 한 객체가 hashCode에서는 동등하지 않다고 하는 오류가 발생할 수 있다.
    // 예를 들어, 지금 코드에선 equals에서 속성값이 같으면 같은 객체로 true를 리턴하도록 오버라이딩했다.
    // 그런데 hashCode를 오버라이딩 하지 않으면 속성값이 같아도(같은 객체라고 취급) 서로 다른 주소값을 갖는다.
    // 이것은 Hashset Hashmap 등 사용 시 문제가 될 수 있다.
    // 그러므로 equals와 hashCode는 같이 오버라이딩 해야 한다.
    // hashCode()는 인텔리제이가 제안한 대로 그대로 두면 된다.
    @Override
    public int hashCode() { // 주소값을 출력해주는 메서드
        return Objects.hash(name, age);
    }

    @Override
    protected void finalize() throws Throwable {
        // 생성된 객체가 삭제될 때 자동 호출됨(garbage collector 발동 시)
        System.out.println(this.name + "죽었슴다");
    }

    // 객체 복사 메서드
    // Cloneable 인터페이스를 구현해서 사용해야 합니다.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void personInfo()
    {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
    }
}
