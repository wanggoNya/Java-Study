package day20_HW23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz2 {
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
	int index = (k-1);
	while(true) {
		if(index > (n-1)) {
			index -= (n-k);
		}
		if(ar.get(index)== 0) {
			index += 1;
			
		}else if(ar.get(index)!= 0) {
			System.out.println(ar.get(index)+"번 병사가 죽었습니다");
			ar.set(index, 0);
			index += k;
		}
		if(Collections.frequency(ar, 0) == n) {
			System.out.println("김신은"+ ar.get(index-1)+"에 서있으셈");
			break;
		}
	}
	
}
}