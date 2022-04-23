import java.util.Scanner;
public class AccountingApp {

	public static void main(String[] args) {

		double valofsup = 10000.0;
		Scanner scan = new Scanner(System.in);
		valofsup = scan.nextDouble();
		scan.close();		
		double vatRate = 0.1;
		double vat = valofsup * vatRate;
		double expenseRate = 0.3;
		double income = valofsup - valofsup * expenseRate;
		double divideRate1 = 0.3;
		double divideRate2 = 0.2;
		
		

		if(valofsup < 10000.0) {
			divideRate1 = 0.2;
			divideRate1 = 0.14;
		}
		
		System.out.println("value of suply: " + valofsup);
		System.out.println("vat: " + vat);
		System.out.println("total: " + (vat + valofsup));
		System.out.println("expense: " + valofsup * expenseRate);
		
		System.out.println("income: " + income);
		System.out.println("dividend L1: " + income * divideRate1);
		System.out.println("dividend L2: " + income * divideRate2);
	}

}
