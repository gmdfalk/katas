package various;

public class Link {
	protected int daten;
	protected Link naechster;

	Link(int daten, Link naechster) {
		this.daten = daten;
		this.naechster = naechster;
	}

	public static void main(String[] args) {
		RecursiveLink a = new RecursiveLink();
		a.rückwärtsausgeben();
	}

}

class RecursiveLink {
	protected Link anfang;

	public RecursiveLink() {
		anfang = null;
	}

	public void rückwärtsausgeben() {
		rückwärtsausgebenR(this.anfang);
	}

	public Link rückwärtsausgebenR(Link element) {
		// In dieser Methode soll die rekurisve Methode enstehen
		if (element.naechster == null)
			return element;
		return rückwärtsausgebenR(element.naechster);
	}
}