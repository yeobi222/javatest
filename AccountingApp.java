
public class AccountingApp {

	public static void main(String[] args) {

		double valofsup = 10000.0;
		double vatRate = 0.1;
		System.out.println("value of suply: " + valofsup);
		double vat = valofsup * vatRate;
		System.out.println("vat: " + vat);
		System.out.println("total: " + vat + valofsup);
		double expenseRate = 0.3;
		System.out.println("expense: " + valofsup * expenseRate);
		System.out.println("income: " + (valofsup - valofsup * expenseRate));
		System.out.println("divide: " + (valofsup - valofsup * 0.3) * vatRate);
	}

}
