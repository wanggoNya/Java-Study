package day15;
// 제너릭
public class Ex_generic {
	public static void main(String[] args) {
		Goods1 goods1 = new Goods1();
		goods1.set(new Apple());
		
		Apple apple = goods1.get();
		goods2.set(new pencil());
		
		pencil pencil = goods2.get();
}
}

class Apple {}
class Pencil {}