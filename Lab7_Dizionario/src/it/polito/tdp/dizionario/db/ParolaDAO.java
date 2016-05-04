package it.polito.tdp.dizionario.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import it.polito.tdp.dizionario.model.Parola;

public class ParolaDAO {

	//Mappa di tutte le parole con chaive il numero di lettere
	public static Map<Integer,Parola> getParole(){
		final String sql= "SELECT * FROM parola";
		Map <Integer, Parola> parole = new HashMap <Integer, Parola>();
		try {
		Connection conn = DBConnect.getConnection();
		PreparedStatement st= conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()){
			Parola p = new Parola ( rs.getString("parola"), rs.getString("parola").length());
parole.put(rs.getString("parola").length(), p);
		}
		return parole;
	} catch (SQLException e){
		throw new RuntimeException("Errore DB");
	}
	
	
	
	}}
