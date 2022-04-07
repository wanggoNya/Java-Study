package day26_HW28;
import java.util.*;
public class Question_276 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("기둥 수 입력 >> ");
		int n = sc.nextInt();
		System.out.print("색깔 수 입력 >> ");
		int k = sc.hashCode();
		// 
		
		// 기둥 차례대로 인덱스(이름) 붙여주기 위한 배열 생성
		int[] column = new int[n]; // 0~ n-1번자리 생성
		
		// color 이름 붙여주기 위해 배열에 1부터 순서대로 넣어줌
		for(int i = 0; i < color.length; i++) {
			color[i] = i+1; // [1. 2. 3... ]배열 생성으로 컬러에 번호 매겨짐
		}
		
		// 경우의 수 구하는 class 생성
		Fence fence = new Fence();
		System.out.println(fence.color());
		
	}
}
// 경우의 수 구하는 법
//하나의 기둥에는 k개의 색이 올 수 있음. => k^n
// 예외 처리 : 옆 기둥과 같으면 개수에서 빼준다.

class Fence {
	double color(int a) {
//		double count = Math.pow(k, c[0].length); // k^n
		

		
		return count;
	}
	
}