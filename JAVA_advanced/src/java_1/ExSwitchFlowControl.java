package java_1;

import java.util.Scanner;

public class ExSwitchFlowControl {

	 static int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter your age");

		int a = scn.nextInt();
		switch (a) {

		case 39:
			System.out.println("it is Basavaraj");

			age = a;
			break;

		case 35:
			System.out.println("it is Shruti");
			age = a;

			break;

		case 8:
			System.out.println("it is Varshini");
			break;

		case 1:
			System.out.println("it is Vihaan");
			break;
		}

		 ExSwitchFlowControl shsh = new ExSwitchFlowControl();
		 shsh.shruti();
		
	}

	private static void shruti() {
		// TODO Auto-generated method stub
		if (age == 35) {
			System.out.println("I am shruti");

		}
	}

	
}
