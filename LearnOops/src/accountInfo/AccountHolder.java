package accountInfo;

public class AccountHolder {

		String accountHolderName;
		String accountNum;
		static int balance;
		static int age;
		static boolean eligibleCreditCard;
		
		public static void eligibleForCredit(int age,int balance) {
			
			try {
				if(age>20 && balance>=20000) {
					eligibleCreditCard=true;
					System.out.println("Eligible for Credit card: "+eligibleCreditCard);
				}
				
				else {
					eligibleCreditCard=false;

					System.out.println("Eligible for Credit card: "+eligibleCreditCard);

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

	
	
}
