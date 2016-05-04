package it.polito.tdp.dizionario.controller;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.dizionario.model.Dizionario;
import it.polito.tdp.dizionario.model.Parola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DizionarioController {

	
	private Dizionario dizionario;
	List<Parola> parole= new LinkedList<Parola>();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField lblNumeroLettere;

    @FXML
    private TextField lblparolaDaCercare;

    @FXML
    private TextArea txtRisultati;

    public void setModel(Dizionario dizionario){
    	this.dizionario=dizionario;
    }
    
    @FXML
    void doConnections(ActionEvent event) {

    	
    }

    @FXML
    void doGrafo(ActionEvent event) {

    }

    @FXML
    void doNeight(ActionEvent event) {
  
    	
    }

    @FXML
    void doReset(ActionEvent event) {

    	lblNumeroLettere.clear();
    	lblparolaDaCercare.clear();
    	txtRisultati.clear();
    }

    @FXML
    void initialize() {
        assert lblNumeroLettere != null : "fx:id=\"lblNumeroLettere\" was not injected: check your FXML file 'Dizionario.fxml'.";
        assert lblparolaDaCercare != null : "fx:id=\"lblparolaDaCercare\" was not injected: check your FXML file 'Dizionario.fxml'.";
        assert txtRisultati != null : "fx:id=\"txtRisultati\" was not injected: check your FXML file 'Dizionario.fxml'.";

    }
}
