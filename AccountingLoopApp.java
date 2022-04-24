import java.util.Scanner;

public class AccountingLoopApp {

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
		divideRate[0] = 0.25;
		divideRate[1] = 0.15;
		divideRate[2] = 0.08;


		System.out.println("value of suply: " + valofsup);
		System.out.println("vat: " + vat);
		System.out.println("total: " + (vat + valofsup));
		System.out.println("expense: " + valofsup * expenseRate);
		System.out.println("income: " + income);
		
		int i=0;
		while (i < divideRate.length) {
			System.out.println("dividend " + (i+1) + " : " + income * divideRate[i]);
			i++;
		}

	}

}
