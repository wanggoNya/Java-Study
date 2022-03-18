package day11;

import java.util.Random;
import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Correct cor = new Correct();
		Month mon = new Month();
		
		System.out.println(cor.cor());
		System.out.println();
		
		
		
	}
}

class Month {
	int mon;
	void setMon(int mon) {
		Random rand = new Random();
		this.mon = rand.nextInt(12) + 1;
	}
}

class Enter {
	Enter(String answer) {
		return;
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
		}else if(this.mon == 12){
			return correct = "December";
		}
}
}