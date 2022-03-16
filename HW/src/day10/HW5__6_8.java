package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class HW5__6_8 {
	public static void main(String[] args) {

		int[] a = { 22, 57, 11, 32, 91, 32, 70 };
//	6-11
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int checkData : a) {
			if (!list.contains(checkData)) {
				list.add(checkData);
			}
		}
		
		int[] newa = new int [list.size()];
		for(int i = 0; i < newa.length ; i++) {
			newa[i] = list.get(i);
		}
		
// 6-8
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 숫자 : ");
		int input = sc.nextInt();

		for (int i1 = 0; i1 < newa.length; i1++) {
			System.out.println("a[" + i1 + "] = " + newa[i1]);
		}

		for (int i1 = 0; i1 < newa.length; i1++) {
			if (input == newa[i1]) {
				System.out.println("그 값은 앞에서부터 찾았을 때 a[" + i1 + "] 에 있습니다.");
				break;
			}
		}

		for (int i1 = newa.length-1 ; i1 > 0; i1--) {
			if (input == newa[i1]) {
				System.out.println("그 값은 뒤에서부터 찾았을 때 a[" + i1 + "] 에 있습니다.");
				break;
			}
		}

	}
}
