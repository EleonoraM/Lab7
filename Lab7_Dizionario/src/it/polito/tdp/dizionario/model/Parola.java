package it.polito.tdp.dizionario.model;


/**
 * @author Sergio
 *
 */
public class Parola {

	private String parola;
	private int lenght;

	//costruttore con parola e lunghezza
	public Parola(String parola, int i) {
		this.parola = parola;
		this.lenght = i;
	}
	@Override
	public String toString() {
		return   parola ;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public int getNumeroLettere() {
		return lenght;
	}
	public void setNumeroLettere(int numeroLettere) {
		this.lenght = numeroLettere;
	}
	//confronto basato su parola e lunghezza
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lenght;
		result = prime * result + ((parola == null) ? 0 : parola.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (lenght != other.lenght)
			return false;
		if (parola == null) {
			if (other.parola != null)
				return false;
		} else if (!parola.equals(other.parola))
			return false;
		return true;
	}
	
	
	// riceva una parola , vede se contiene i caratteri di quella , se ci sono n-1 corrispondenze restituisce true , se no false
	public boolean differiscePerUnaLettera(Parola p1){
		
		int match = 0;
		
		
		for ( int i =0; i<= parola.length();i++){
			if ( this.parola.contains(Character.toString(p1.getParola().charAt(i))));
			match++;
	}
		if ( match == this.lenght-1){
			return true;
		}
		return false;}
	
	
}
