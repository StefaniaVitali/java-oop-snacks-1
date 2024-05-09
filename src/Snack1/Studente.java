package Snack1;

public class Studente {
	
	private String nome;
	private String cognome;
	
	public Studente (String nome, String cognome) {
		 this.nome = nome;
		 this.cognome = cognome;
	}
	
	
	//GETTER e SETTER perché potremmo voler creare un programma dove si inserisce il nome dello studente nuovo
	// e anche sovrascrivere il nome nuovo

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	} 
	
	
	public String stampa () {
		
		String nomeStudente = this.nome + " " + this.cognome;
		
		return nomeStudente;
		
	}
	
   
	
	

}


