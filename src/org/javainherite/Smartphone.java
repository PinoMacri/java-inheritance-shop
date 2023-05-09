package org.javainherite;

public class Smartphone extends Prodotto {
	public int codiceImei;
	public int memoria;
	public Smartphone(int codice, String nome, String marca, double prezzo, int iva, int codiceImei, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceImei=codiceImei;
		this.memoria=memoria;
	}
	 public String toString() {

		    return "codice: " + getCodice() + " nome " + getNome() + " Marca: " + getMarca() + " " + "Prezzo: " + getPrezzo() + " iva: "+ getIva() + " "
		    + "codiceImei: " + codiceImei + " memoria: " + memoria;		
		    
		}
	
}
