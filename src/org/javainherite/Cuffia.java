package org.javainherite;

public class Cuffia extends Prodotto{
	public String color;
	public boolean wireless;
	public Cuffia(int codice, String nome, String marca, double prezzo, int iva, String color, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		this.color=color;
		this.wireless=wireless;
		
	}
	
	public String toString() {

	    return "codice: " + getCodice() + " nome " + getNome() + " Marca: " + getMarca() + " " + "Prezzo: " + getPrezzo() + "iva: " + getIva() + " "
	    + "colore: " + color + " wireless: " + wireless;		
	    
	}
}
