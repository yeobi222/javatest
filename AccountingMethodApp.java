

public class AccountingMethodApp {
	public static double valofsup;
	public static double vatRate;
	public static void main(String[] args) {

		valofsup = 10000.0;
		vatRate = 0.1;
		double vat = vatget();
		double total = getTotal(vat);
		double expenseRate = 0.3;
		double income = getIncome(expenseRate);
		double[] divideRate = new double[3];
		divideRate[0] = 0.25;
		divideRate[1] = 0.15;
		divideRate[2] = 0.08;


		System.out.println("value of suply: " + valofsup);
		System.out.println("vat: " + vat);
		System.out.println("total: " + total);
		System.out.println("expense: " + valofsup * expenseRate);
		System.out.println("income: " + income);
		
		printDividends(income, divideRate);
		

	}
	public static void printDividends(double income, double[] divideRate) {
		int i=0;
		while (i < divideRate.length) {
			System.out.println("dividend " + (i+1) + " : " + income * divideRate[i]);
			i++;
		}
	}
	public static double getIncome(double expenseRate) {
		double income = valofsup - valofsup * expenseRate;
		return income;
	}
	public static double getTotal(double vat) {
		double total = vat + valofsup;
		return total;
	}
	public static double vatget() {
		double vat = valofsup * vatRate;
		return vat;
	}

}
