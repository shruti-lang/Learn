package java_1;

import java.util.Arrays;

public class Datataype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//There are two data types
		//Primitive and non primitive
		//primitive data types are char,int,long,float,double,boolean,byte,short
		
		char a='G';
		byte b=2;
		short c=56;
		int  d=456889996;
		long e=783929084;
		float f=2.45f;
		double g =6.789974747;
		boolean h=true;
		
		//non primitive data types strings,array,object type
		String i="shruti";
		String j=new String("Varshu and Vihu");
		String k[]= {"a","b","c","d"};
		int[] l = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		
		System.out.println(a);
		
		System.out.println(b);

		System.out.println(c);

		System.out.println(d);

		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k[0]);
		System.out.println(l[0]);

		
		//
		int[] M= {10,20,30,40};
		int[] N=M;
		
		System.out.println(Arrays.toString(M));
		System.out.println(Arrays.toString(N));
		
		N[1]=90;
		
		System.out.println(Arrays.toString(M));
		System.out.println(Arrays.toString(N));
		
		
	int o=10;
	int p=0;
	System.out.println(o);
	System.out.println(p);
	p=2;
			



	System.out.println(o);
	System.out.println(p);
	

		
		
		
		
		
	}

}
