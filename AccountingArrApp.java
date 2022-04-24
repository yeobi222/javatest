import java.util.Scanner;
public class AccountingArrApp {

	public static void main(String[] args) {

		double valofsup = 10000.0;
		Scanner scan = new Scanner(System.in);
		valofsup = scan.nextDouble();
		scan.close();		
		double vatRate = 0.1;
		double vat = valofsup * vatRate;
		double expenseRate = 0.3;
		double income = valofsup - valofsup * expenseRate;
		
		double[] divideRate = new double[3];
		divideRate[0] = 0.3;
		divideRate[1] = 0.2;
		divideRate[2] = 0.1;
		
		double dividend1 = income * divideRate[0];
		double dividend2 = income * divideRate[1];
		double dividend3 = income * divideRate[2];
		
		System.out.println("value of suply: " + valofsup);
		System.out.println("vat: " + vat);
		System.out.println("total: " + (vat + valofsup));
		System.out.println("expense: " + valofsup * expenseRate);
		
		System.out.println("income: " + income);
		
		System.out.println("dividend L1: " + dividend1);
		System.out.println("dividend L2: " + dividend2);
		System.out.println("dividend L3: " + dividend3);
	}

}
