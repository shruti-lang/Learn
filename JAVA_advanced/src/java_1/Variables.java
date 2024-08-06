package java_1;

public class Variables {

	public String I;
    public static String S = "I am static Variable";

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		
		Variables v1=new Variables();
		System.out.println(v1.I);
		System.out.println(Variables.S);

	}
	
	public Variables() {
	I="I am instance Variable";
	}

	
	 public static void test() {
		 
		 String l= "I am local variable";
		 System.out.println(l);
		 
		 
	 }
}
