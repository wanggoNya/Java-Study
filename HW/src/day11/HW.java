package day11;

import java.util.Random;
import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		
		Month month1 = new Month();
		Answer answer1 = new Answer();
		Correct correct1 = new Correct();
		
		month1.setMon(0); // 0 이 아닌 난수가 나온다 !??
		correct1.setMon(0);
		correct1.cor();
		
		
		
		System.out.println(month1.mon);
		System.out.println(correct1.mon);
//		System.out.println(correct1.correct);
	}
}

class Month {
	int mon;
	void setMon(int mon) {
		Random rand = new Random();
		this.mon = rand.nextInt(12) + 1;
	}
}

class Answer extends Month {
	void ans(String answer) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		answer = sc.next();
	}
}

class Correct extends Month {
	String cor() {
		String correct;
		if(this.mon == 1) {
			return correct = "January";
		}else if(this.mon == 2) {
			return correct = "February";
		}else if(this.mon == 3) {
			return correct = "March";
		}else if(this.mon == 4) {
			return correct = "April";
		}else if(this.mon == 5) {
			return correct = "May";
		}else if(this.mon == 6) {
			return correct = "June";
		}else if(this.mon == 7) {
			return correct = "July";
		}else if(this.mon == 8) {
			return correct = "August";
		}else if(this.mon == 9) {
			return correct = "September";
		}else if(this.mon == 10) {
			return correct = "October";
		}else if(this.mon == 11) {
			return correct = "November";
		}else if(this.mon == 12) {
			return correct = "December";
		}
		return "";
}
}