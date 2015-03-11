package codechef.easy;

public class ATM {

	public static double main(int withdrawal, double balance) {
		double result;
		if (withdrawal % 5 != 0 || balance < withdrawal) {
			result = balance;
		} else {
			result = balance - withdrawal - 0.5;
		}
		return result;
	}

}
