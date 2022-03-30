package day20_HW23;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n 입력");
		int n = sc.nextInt();
		System.out.println("k 입력");
		int k = sc.nextInt();
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		int num = 1;
		for(int i = 0; i < n; i++) {
			ar.add(num);
			num++;
		}
//		-5의 규칙
		int index = 0;
		while(true) {
			if(ar.size() != 0) {
				index += k;
				if(index > (n-1)) {
					index += (k-n);
					ar.remove(index);
					System.out.println(ar.get(index)+"번 병사가 죽었습니다");
					n -= 1;
				}else {
					ar.remove(index);
					System.out.println(ar.get(index)+"번 병사가 죽었습니다");
					n -= 1;
				}
			}else if(ar.size() == 0) {
				System.out.println("김신은"+ ar.get(0)+"에 서있으셈");
			break;
		}
		}

	}
}
