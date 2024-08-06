package java_1;

public class Variable_Scope {

	static int a=10;
	private int b=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variable_Scope s=new Variable_Scope();
		s.newMethod();

	}
	
	public void newMethod() {		
		Variable_Scope s=new Variable_Scope();
         this.a=20;
         b=25;         
         System.out.println("s.a"+s.a);
         System.out.println("Variable_Scope.a "+Variable_Scope.a);
         System.out.println("Variable_Scope.b  "+s.b);
         System.out.println("s.b  "+s.b);
         System.out.println("b  "+b);		
	}
}
