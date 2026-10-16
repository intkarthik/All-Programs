package ElseIf;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int marks = sc.nextInt();
		String grade;
		String remarks;
		if (marks > 90 && marks <= 100) {
			grade = "A+";
			System.out.println("Grade :" + grade);
		} else if (marks > 80 && marks <= 90) {
			grade = "A";
			System.out.println("Grade :" + grade);
		} else if (marks > 70 && marks <= 80) {
			grade = "B";
			System.out.println("Grade :" + grade);
		} else if (marks > 60 && marks <= 70) {
			grade = "C";
			System.out.println("Grade :" + grade);
		} else if (marks > 50 && marks <= 60) {
			grade = "D";
			System.out.println("Grade :" + grade);
		} else {
			grade = "Fail";
			System.out.println("Grade :" + grade);
		}
	}

}
