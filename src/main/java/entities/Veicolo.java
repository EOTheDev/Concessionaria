package entities;

public class Veicolo {
	
	protected int id;
	protected double velocit‡Max;
	protected int cilindrata;
	protected int marce = 6;
	protected int pesoVuoto;
	protected byte carburante;
	protected int capienzaPersone;
	protected String tipoDiCambio = "manuale";
	protected String colore;
	protected String URLImg;
	protected String optional;
	protected int rimanenza;
	protected int ruote;
	
	public Veicolo() {}
	
	public int getRuote() {
		return ruote;
	}

	public void setRuote(int ruote) {
		this.ruote = ruote;
	}

	public int getRimanenza() {
		return rimanenza;
	}

	public void setRimanenza(int rimanenza) {
		this.rimanenza = rimanenza;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getVelocit‡Max() {
		return velocit‡Max;
	}
	
	public void setVelocit‡Max(double velocit‡Max) {
		this.velocit‡Max = velocit‡Max;
	}
	
	public int getCilindrata() {
		return cilindrata;
	}
	
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public int getMarce() {
		return marce;
	}
	
	public void setMarce(int marce) {
		this.marce = marce;
	}
	
	public int getPesoVuoto() {
		return pesoVuoto;
	}
	
	public void setPesoVuoto(int pesoVuoto) {
		this.pesoVuoto = pesoVuoto;
	}
	
	public byte getCarburante() {
		return carburante;
	}
	
	public void setCarburante(byte carburante) {
		this.carburante = carburante;
	}
	
	public int getCapienzaPersone() {
		return capienzaPersone;
	}
	
	public void setCapienzaPersone(int capienzaPersone) {
		this.capienzaPersone = capienzaPersone;
	}
	
	public String getTipoDiCambio() {
		return tipoDiCambio;
	}
	
	public void setTipoDiCambio(String tipoDiCambio) {
		this.tipoDiCambio = tipoDiCambio;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String getURLImg() {
		return URLImg;
	}
	
	public void setURLImg(String uRLImg) {
		URLImg = uRLImg;
	}
	
	public String getOptional() {
		return optional;
	}
	
	public void setOptional(String optional) {
		this.optional = optional;
	}
	
}
