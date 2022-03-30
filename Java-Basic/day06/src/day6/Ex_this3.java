package day6;

public class Ex_this3 {
public static void main(String[] args) {
	// this() 매서드 (this 키워드와 완전 다름)
	// this()매서드는 this키워드와 비슷하게 보이지만 의미가 완전히 다르다. 
	// this()매서드는 자신이 속한 클래스 내부의 다른 생성자를 호출할 때 사용한다. 
	// 1. 생성자의 내부에서만 사용한다. 
	// 2. 생성자의 첫줄 위치한다. 
	// 두개 조건중 하나라도 지켜지지 않으면 에러가 발생된다. 
	
	T t1 = new T();
	System.out.println();
	T t2 = new T(3); //생성자 오버로딩
}

}


class T {
T() {
	System.out.println("첫번쨰 생성자");
}

T(int a) { //생성자 오버로딩
	this();
	System.out.println("두번쨰 생성자");	
}

}
