package org.javainherite;

public class Televisore extends Prodotto {
		public String dimensioni;
		public boolean smart;
	    public Televisore(int codice, String nome, String marca, double prezzo, int iva, String dimensioni, boolean smart) {
			super(codice, nome, marca, prezzo, iva);
			this.dimensioni = dimensioni;
			this.smart = smart;
		}
	    public String toString() {

		    return "codice: " + getCodice() + " nome " + getNome() + " Marca: " + getMarca() + " " + "Prezzo: " + getPrezzo() + " iva: "+ getIva() + " "
		    + "dimensioni: " + dimensioni + " smart: " + smart;		
		    
		}
	}


