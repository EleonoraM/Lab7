package it.polito.tdp.dizionario.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

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
	
 public List<Parola> listaParoleSimili(String s){
	 List<Parola> trovate= new LinkedList<Parola>();
	 Parola p2 = new Parola( s,s.length());
	 int lunghezzaParola= s.length();
	 List <Parola>diz= creaDizionario(lunghezzaParola);
	 for ( Parola p:diz ){
		 if (p.differiscePerUnaLettera(p2))
			 trovate.add(p);
	 }
	 trovate.add(p2);
	 return trovate;
 }
	
	public void provaGrafo (String s){
		UndirectedGraph <Parola,DefaultEdge> grafo= new SimpleGraph<Parola,DefaultEdge>(DefaultEdge.class);
	for ( Parola p : listaParoleSimili(s)){
		grafo.addVertex(p);
	
		//grafo.addEdge(p,p );
//for( Parola p : grafo.vertexSet()){
	//System.out.format("Il vertice %d è collegato con l'arco, p,p)
//}
	}

	}
}
