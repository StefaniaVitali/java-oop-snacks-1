package Snack1;

import java.util.Arrays;
/* CONSEGNA
 Crea una classe RegistroStudenti che rappresenti un registro di studenti. x
Utilizza un array privato per memorizzare oggetti Studente. x
 Implementa un costruttore senza parametri per
inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro.
Aggiungi un metodo che stampi la lista degli studenti.
 */


public class RegistroStudenti {
	
	private Studente [] studentiArr;
	
	private int index = 0;
	
	
	//COSTRUTTORE
    public RegistroStudenti () {
    	
    	studentiArr = new Studente [3];    	
       	
    }
    
    
  //METODO PER AGGIUNGERE STUDENTI ALL'ARRAY
    
    public void aggiungiStudenti(Studente studente) {
    	
    	if (index <studentiArr.length) {    		
    	    studentiArr[index] = studente;
    	    index++;
    	
    	}
    }
    
    
    //METODO PER STAMPARE LA LISTA DI STUDENTI
  	
  	   public void stampaRegistro () {  		
  		
  		  for (int i = 0; i < studentiArr.length; i++) {
  			System.out.println(studentiArr[i].stampa());
  		  }
  		  
  	   }
  		
  	  
  	
    
    	
    }
    
    


/*  CORREZIONE ESERCIZIO  
 * ARRAY da inizializzare con un valore, per definire una dimensione. Ogni posizione dell'indice avrà un valore
 * Null finché non definisco lo studente.
 * 
 * Nel medoto per assegnare un valore all'array devo indicare di aggiungere uno studente
 * finché c'è spazio nell'array  
 * 
 * 
 * */


  