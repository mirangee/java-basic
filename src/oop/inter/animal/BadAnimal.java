package oop.inter.animal;

// 인터페이스 - 클래스 : 구현(implements)
// 클래스 - 클래스, 인터페이스 - 인터페이스: 상속(extends)
// 인터페이스는 다중상속을 허용한다. 
// 하지만 애초에 내용이 없기 때문에
// death diamond의 위험성(어떤 부모의 것을 물려받아야할지 혼란)이 발생하지 않는다.
public interface BadAnimal extends Violent,Huntable {


}
