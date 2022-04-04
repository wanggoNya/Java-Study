package day23_HW25;
import java.util.*;
public class test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);


	System.out.print("version1 = ");
	String v1 = sc.next();
	System.out.print("version2 = ");
	String v2 = sc.next();
	
	ArrayList<String> v1_list = new ArrayList<String>(Arrays.asList(v1.split("\\.")));
	ArrayList<String> v2_list = new ArrayList<String>(Arrays.asList(v2.split("\\.")));
	v1_list.remove("0");
	v2_list.remove("0");

	System.out.println("version1 의 사이즈는 " + v1_list.size());
	System.out.println("version2 의 사이즈는 " + v2_list.size());
//	for (String i : v1_list) {
//		System.out.println(i);
//	}
	
//	for(int i = 0; i < v1_array.length ; i++) {
//		v1_list.add(i, v1_array[i]);
//	}
//	for(int i = 0; i < v2_array.length ; i++) {
//		v2_list.add(i, v2_array[i]);
//	}
	
		v1_list.remove("0");
		v2_list.remove("0");
		
		int output = 0;
		int size;
		
		if( v1_list.size() > v2_list.size()) {
			size = v2_list.size();
		} else {
			size = v1_list.size();
		}
		
		
		
		
}
}