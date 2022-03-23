package day15;

public class Ex_generic2 {
public static void main(String[] args) {
 
}
}

//class Apple {}
//class Pencil {}

class Goods { // 모든 타입의 객체 저장 가능
	private Object object = new Object();
	public Object get() {
		return object;
	}
	
	public void set(Object object) {
		this.object = object;
	}
}