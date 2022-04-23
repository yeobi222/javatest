
public class AccountingApp {

	public static void main(String[] args) {
		
		System.out.println("value of suply: " + 10000.0);
		System.out.println("vat: " + 10000.0*0.1);
		System.out.println("total: " + 10000.0*0.1+10000.0);
		System.out.println("expense: " + 10000.0*0.3);
		System.out.println("income: " + (10000.0 - 10000.0*0.3));
		System.out.println("divide: " + (10000.0-10000.0*0.3)*0.1);
	}

}
