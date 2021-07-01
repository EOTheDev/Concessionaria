package entities;

import java.util.ArrayList;

public class Cliente extends Umano {
	
	protected String indirizzo;
	protected String telefono;
	protected String email;
	
	
	protected ArrayList<Veicolo> veicoliCliente=new ArrayList<>();
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Veicolo> getVeicoliCliente() {
		return veicoliCliente;
	}
	public void setVeicoliCliente(ArrayList<Veicolo> veicoliCliente) {
		this.veicoliCliente = veicoliCliente;
	}
	
	
	
	
	
}
