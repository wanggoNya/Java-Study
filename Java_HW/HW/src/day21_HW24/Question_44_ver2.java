package day21_HW24;
import java.util.*;
public class Question_44_ver2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String size = sc.nextLine();
		String[] size_ar = size.split("\\s+");
		System.out.println(Integer.parseInt(size_ar[1]));
	}
}
