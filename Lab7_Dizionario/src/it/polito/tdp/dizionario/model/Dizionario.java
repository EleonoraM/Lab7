package it.polito.tdp.dizionario.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import it.polito.tdp.dizionario.db.ParolaDAO;

public class Dizionario {

	static Map <Integer, Parola> paroletutte;
	static List <Parola> paroleConXlettere;

	
	
	//public static void main(String[] args) {
	//creaDizionario(3);
	//} 
	public static List<Parola>ottieniTutteLeParola(){
		
		return (List<Parola>) paroletutte.values();
	}
	
	public static List <Parola> creaDizionario ( int x){
		paroleConXlettere= new LinkedList<Parola>();
		paroletutte = new HashMap<Integer, Parola>();
		paroletutte.putAll(ParolaDAO.getParole());
		
		if (! paroletutte.containsKey(x))
		{
			return null;
		}
		paroleConXlettere.add(paroletutte.get(x));
		return paroleConXlettere;
	}
	
}
