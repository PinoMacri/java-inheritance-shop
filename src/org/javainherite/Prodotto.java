package org.javainherite;

public class Prodotto {
private int codice;
private String nome;
private String marca;
private double prezzo;
private int iva;

public Prodotto(int codice, String nome, String marca, double prezzo, int iva) {
	this.codice = codice;
	setNome(nome);
	setMarca(marca);
	setPrezzo(prezzo);
	setIva(iva);
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public double getPrezzo() {
	return prezzo;
}

public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
}

public int getIva() {
	return iva;
}

public void setIva(int iva) {
	this.iva = iva;
}

public int getCodice() {
	return codice;
}

public double getPrezzoConIVA() {
    double prezzoIVA = prezzo + (prezzo * iva / 100);
    return prezzoIVA;
}
public String toString() {

    return "codice: " + codice + " nome " + nome + " Marca: " + marca + " " + "Prezzo: " + prezzo + " iva: "+ iva + " " ;
}
}
