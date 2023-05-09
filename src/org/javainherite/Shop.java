package org.javainherite;

public class Shop {
	public static void main(String[] args) {
		Prodotto prodotto1 = new Prodotto(1020, "Lavatrice", "Hariston", 400, 22);
		Cuffia cuffia1 = new Cuffia (2080, "A40", "Astro", 189.00, 22, "blue", false);
		Televisore televisore1 = new Televisore (83027, "Larounge", "Samsung", 287.00, 22, "200 x 200", false);
		Smartphone smartphone1 = new Smartphone (20398, "Pro-Plus", "iPhone", 769.0, 22, 3489, 32);
	
		
		Prodotto[] arrayProdotti = {prodotto1, cuffia1, televisore1, smartphone1};
		for (int i=0; i<arrayProdotti.length;i++) {
			Prodotto p = arrayProdotti[i];
			System.out.println(p.toString());
			if (p instanceof Cuffia) {
				Cuffia c = (Cuffia) p;
				System.out.println(c.getMarca());
			} else if (p instanceof Televisore) {
				Televisore t = (Televisore) p;
				System.out.println(t.getMarca());
			} else if (p instanceof Smartphone) {
				Smartphone s = (Smartphone) p;
				System.out.println(s.getMarca());
			}
		
		}
	}	
	
}
