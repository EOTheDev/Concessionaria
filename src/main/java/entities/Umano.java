package entities;

import java.util.Date;

public class Umano {
	protected String nome;
	protected String cognome;
	protected Date birthday;
	protected String birthLocation;
	
	
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
	
	
	
}
