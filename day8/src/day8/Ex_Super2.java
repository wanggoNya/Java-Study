package day8;

class superA{
	superA(){
		System.out.println("A constructor");
	}
}

class superB extends superA {
	superB() {
		super(); //생략하면 자바가 자동으로 만들어준다.
		System.out.println("B constructor");
	}
}

class superC {
	superC(int a){ //그냥 생성자
	System.out.println("C constructor");
	}
}

class superD extends superC {
	/*
	 * 자동으로 자바가 추가해줌
	 * superD() {
	 * 	super();
	 * }
	 */
	superD(){
		super(3);
	}
}

public class Ex_Super2 {
public static void main(String[] args) {
	superA sa = new superA();
	System.out.println();
	
	superB sb = new superB();
}
}

