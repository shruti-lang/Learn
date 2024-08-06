package java_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*BufferedReader bfr=new  BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Please enter Your Name");
		String name=bfr.readLine();
		System.out.println(name);
		
		Scanner scn =new Scanner(System.in);
		System.out.println("Please enter Your age");
		int age=scn.nextInt();
		System.out.println(age);*/
		
		SimpleDateFormat sd=new SimpleDateFormat("dd-MM-YYYY");
		String tdate=sd.format(new Date());	
		
    
    System.out.println("Formatted Date : " + tdate); 
		
		

	}
}
