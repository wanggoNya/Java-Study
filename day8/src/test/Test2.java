package test;
import java.util.Arrays;
public class Test2 {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 6 };
		int[] b = new int[2];
		int j = 0;
		for (int i = 0; i < a.length-1; i++) {
			if ((a[i] + a[i + 1]) % 2 == 0) {
				b[j] = i;
				b[j=1] = i+1;
				j++;
				System.out.println(Arrays.toString(b));
			}
		}
	}
}
