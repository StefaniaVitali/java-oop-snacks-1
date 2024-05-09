package Snack1;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args){
	   
		System.out.println("iniziamo!");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Scrivi il nome del nuovo studente");
		String nomeStudente = input.nextLine();
		
		System.out.println("Scrivi il cognome del nuovo studente");
		String cognomeStudente = input.nextLine();
		
		Studente studente1 = new Studente (nomeStudente, cognomeStudente);
		Studente studente2 = new Studente ("Luisa", "Marconi");
		Studente studente3 = new Studente (nomeStudente, cognomeStudente);
		studente3.setNome("Marcello");
		studente3.setCognome("Rossi");
		
	
		System.out.println(studente1);
		
		System.out.println("il nuovo studente è: " + nomeStudente + " " + cognomeStudente);
		
		
		RegistroStudenti registro1 = new RegistroStudenti();
		registro1.aggiungiStudenti(studente1);
		registro1.aggiungiStudenti(studente2);
		registro1.aggiungiStudenti(studente3);
		
		
		registro1.stampaRegistro();
		
		
		input.close();
	}

}
