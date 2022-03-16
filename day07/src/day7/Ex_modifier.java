package day7;
//import am.F; default 로 선언한 F 클래스는 임포트 할수 없다. 
//public으로 선언된 클래스만 다른 패키지에서 임포트 가능하다. 
public class Ex_modifier {
	public static void main(String[] args) {
//		접근제어자 (지정자)
//		 접근 제어자(지정자) modifier 는 클래스, 필드, 매서드, 생성자 등에게
//		 어떤 특징을 부여하는 문법 요소이다. 일종의 형용사로 생각할수 있다. 멋진 자동자
//		 사용 범위를 정의하는 역할을 한다. 
//		 
//		 
//		 public  >   protected   >   default(아무 표시가 없으면)  >  private
//		public    : 같은 패키지 내의 모든 클래스 + 다른 패키지의 모든 클래스에서 접근 가능
//		protected : 같은 패키지 내의 모든 클래스 + 다른 패키지의 자식 클래스에서 접근 가능
//		default   : 같은 패키지 내의 모든 클래스
//		private   :                       같은 클래스 에서만 사용 가능
//		*/	
//
//
//		public static void main(String[] args) {
//			A a = new A();
			
//			System.out.println(a.a);
//			System.out.println(a.b);		
//			System.out.println(a.c);		
//			System.out.println(a.d);		
//			System.out.println();
//			a.print();
		
		/*
		클래스의 접근 지정자. 
		클래스는 public , default 접근 지정자만 사용할 수 있다. 
		다시 말해 class 키워드 앞에는 public 이 붙어 있거나 안 붙어있거나 둘중하나이다.
		default 클래스는 같은 패키지 내에서만 사용할수 있고 public 클래스는 다른 패키지에서도
		사용할 수 있다. 따라서 클래스를 default 로 선언하면 다른 패키지에서는 임포트가 불가능해진다. 		
				
		*/
		
	}
}
