package day23_HW25;
import java.util.*;
public class Question {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	Solution solution = new Solution();

	System.out.print("version1 = ");
	String v1 = sc.next();
	System.out.print("version2 = ");
	String v2 = sc.next();

	System.out.println(solution.version(v1, v2));
}
}

class Solution {
	int version(String v1, String v2) {
		List<String> v1_list = new ArrayList<String>(Arrays.asList(v1.split("\\.")));
		List<String> v2_list = new ArrayList<String>(Arrays.asList(v1.split("\\.")));

		v1_list.remove("0");
		v2_list.remove("0");
		
		int output = 0;
		int size;
		
		if( v1_list.size() > v2_list.size()) {
			size = v2_list.size();
		} else {
			size = v1_list.size();
		}
		
		for(int i = 0; i < size ; i++ ) {
			int v1_num = Integer.parseInt(v1_list.get(i));
			int v2_num = Integer.parseInt(v1_list.get(i));
			
			if (v1_num > v2_num) {
				output = 1;
				break;
			}else if (v1_num < v2_num) {
				output = -1;
				break;
			}else if (v1_num == v2_num) {
				if( v1_list.size() > v2_list.size()) {
					output = 1;
				} else if( v1_list.size() < v2_list.size()){
					output = -1;
				}
			}else {
				output = 0;
			}
		}

		return output;
	}
}

// 0이면 다음 글자로 넘어감

