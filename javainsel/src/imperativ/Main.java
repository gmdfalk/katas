package imperativ;

/*
 * Übungen aus dem Buch "Java ist auch eine Insel"
 * http://tutego.de/javabuch/aufgaben/imperativ.html
 */

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// eingabedialog();
		// muenzmaschine(159);
		// muenzmaschineOriginal(1.59);
		// bedingungsOperator(0);
		// alternativen(1);
		// gradeUngrade(3);
		// switchAnweisung("J");
		// stringWiederholen("*");
		// mathematischesPhaenomen();
		// forSchleifen();
		// geschachtelteSchleifen();
		denkenStattRechnen();
	}

	public static void wertebereiche() {
		System.out.println(1000000 * 1000000);
		System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1
				+ 0.1 - 1.0);
	}

	public static void eingabedialog() {
		String s = javax.swing.JOptionPane
				.showInputDialog("Bitte Zahl eingeben");

		System.out.println(s + " * " + s);
		javax.swing.JOptionPane.showMessageDialog(null,
				Math.pow(Integer.parseInt(s), 2));
		System.exit(0);
	}

	enum Muenze {

		ZWEI_EURO(2.0), EIN_EURO(1.0), FUENFZIG_CENT(0.5), ZWANZIG_CENT(0.2), ZEHN_CENT(
				0.1), FUENF_CENT(0.05), ZWEI_CENT(0.02), EIN_CENT(0.01);

		private double value;

		private Muenze(double value) {
			this.value = value;
		}

		public double getValue() {
			return value;
		}
	}

	public static void muenzmaschine(int value) {
		int[] muenzen = { 200, 100, 50, 20, 10, 5, 2, 1 };
		HashMap<Integer, String> translationMap = new HashMap<Integer, String>() {
			{
				put(200, "zwei Euro");
				put(100, "ein Euro");
				put(50, "fuenfzig Cent");
				put(20, "zwanzig Cent");
				put(10, "zehn Cent");
				put(5, "fuenf Cent");
				put(2, "zwei Cent");
				put(1, "ein Cent");
			}
		};

		int result = 0, count = 0;
		for (int i : muenzen) {
			while (result + i <= value) {
				result += i;
				count += 1;
			}
			System.out.println(count + " mal die " + translationMap.get(i)
					+ " Münze benutzt.");
			count = 0;
		}
	}

	public static void muenzmaschineOriginal(double d) {

		System.out.println((int) (d / 2) + " x 2 €");
		d %= 2;

		System.out.println((int) (d / 1) + " x 1 €");
		d %= 1;

		System.out.println((int) (d / 0.5) + " x 50 Cent");
		d %= 0.5;

		System.out.println((int) (d / 0.2) + " x 20 Cent");
		d %= 0.2;

		System.out.println((int) (d / 0.1) + " x 10 Cent");
		d %= 0.1;

		System.out.println((int) (d / 0.05) + " x 5 Cent");
		d %= 0.05;

		System.out.println((int) (d / 0.02) + " x 2 Cent");
		d %= 0.02;

		System.out.println((int) (d / 0.01) + " x 1 Cent");
	}

	public static void bedingungsOperator(int anzahlDateien) {
		System.out.printf("Es gibt %d %s.", anzahlDateien,
				anzahlDateien == 1 ? "Datei" : "Dateien");
	}

	public static void alternativen(double d) {
		double ueberraschung = Math.sin(d);

		if (ueberraschung > 0)
			System.out.println("positiv");
		else
			System.out.println("negativ");
		if (ueberraschung > 0 && ueberraschung < 1)
			System.out.println("... und passt");
	}

	public static void gradeUngrade(int n) {
		System.out.println(n % 2 == 0 ? "grade!" : "ungrade!");
	}

	public static void switchAnweisung(String anweisung) {
		switch (anweisung) {
		case "J":
		case "JA":
		case "j":
		case "ja":
			System.out.println("true");
			break;
		case "N":
		case "NEIN":
		case "n":
		case "nein":
			System.out.println("false");
			break;
		default:
			System.out.println("default");
			break;
		}
	}

	public static void stringWiederholen(String str) {
		for (int i = 0; i < 30; i++)
			System.out.print(str);
		System.out.println();
	}

	public static void mathematischesPhaenomen() {
		double t = Math.random();
		while (t != 0) {
			if (t < 1)
				t *= 2;
			else if (t >= 1)
				t -= 1;
			System.out.println(t);
		}
	}

	public static void forSchleifen() {
		for (int i = 1900; i <= 2000; i += 10)
			System.out.println(i);
	}

	public static void geschachtelteSchleifen() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(i + " ");
			System.out.println();
		}

		for (int i = 1; i < 6; i++) {
			for (int k = 0; k < (6 - i); k++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void denkenStattRechnen() {
		for (int x = 0; x < 10; x++) {
			for (int l = 0; l < 10; l++) {
				for (int o = 0; o < 10; o++) {
					for (int t = 0; t < 10; t++) {
						int xol = 100 * x + 10 * o + l;
						int lxx = 100 * l + 10 * x + x;
						int tlt = 100 * t + 10 * l + t;

						if ((xol + lxx) == tlt) {
							if ((l != o) && (l != x) && (l != t) && (o != x)
									&& (o != t) && (x != t))
								System.out.println("Ungleiche Variablen:");

							System.out.println("l = " + l + ", " + "o = " + o
									+ ", " + "x = " + x + ", " + "t = " + t);
						}
					}
				}
			}
		}
	}
}
