package oop.modi.cls.pac1;


/*
    - default(package, friendly) 제한자는 접근 제한자를
    붙이지 않은 형태이며, 같은 패키지 내에서만 접근을 허용합니다.
*/

class A {
    // 클래스 B의 접근제한자는 public이기 때문에 어디서나 접근이 가능하다.
    B b  = new B();

}
