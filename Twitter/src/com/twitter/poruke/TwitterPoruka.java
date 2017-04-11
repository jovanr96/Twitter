package com.twitter.poruke;
/**
 *  Klasa predstavlja Twitter poruku.
 */
public class TwitterPoruka {
	/**
	 * Naizv korisnika
	 */
	private String korisnik;
	/**
	 * Kontekst poruke
	 */
	private String poruka;
	
	/**
	 * Metoda koja vraca ime korisnika.
	 * @return korisnik 
	 */
	public String getKorisnik() {
		return korisnik;
	}
	/**
	 * Metoda koja unosi ime korisnika
	 * Parametar mora biti razlicit od null i ne sme biti prazan string.
	 * @throws RuntimeException
	 * @param korisnik 
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || !korisnik.isEmpty())
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	/**
	 * Metoda koja vrac kontekst poruke
	 * @return poruka 
	 */
	public String getPoruka() {
		return "poruka";
	}
	/**
	 * Metoda koja unosi kontekts poruke
	 * Parametar mora biti razlicit od null, neprazan string i
	 *  ne sme sadrzati vise od 140 karaktera.
	 * @throws RuntimeException
	 * @param poruka 
	 */
	public void setPoruka(String poruka) {
		if (this.poruka == null || this.poruka == new String("") || this.poruka.length() > 140)
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	/**
	 * Metoda koja vraca naziv korisnika i kontekst poruke.
	 */
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
}