package entities;

public class ModelloMacchina extends MarcaMacchina {
	
	private String modello = " ";

	public ModelloMacchina(String marca, String modello) {
		super(marca);
		this.modello = modello;
	}
	
	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}


	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return super.getMarca();
	}

	@Override
	public void setMarca(String marca) {
		// TODO Auto-generated method stub
		super.setMarca(marca);
	}

	@Override
	public int getPorte() {
		// TODO Auto-generated method stub
		return super.getPorte();
	}

	@Override
	public void setPorte(int porte) {
		// TODO Auto-generated method stub
		super.setPorte(porte);
	}

	@Override
	public int getRuote() {
		// TODO Auto-generated method stub
		return super.getRuote();
	}

	@Override
	public void setRuote(int ruote) {
		// TODO Auto-generated method stub
		super.setRuote(ruote);
	}

	@Override
	public int getRimanenza() {
		// TODO Auto-generated method stub
		return super.getRimanenza();
	}

	@Override
	public void setRimanenza(int rimanenza) {
		// TODO Auto-generated method stub
		super.setRimanenza(rimanenza);
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public double getVelocit‡Max() {
		// TODO Auto-generated method stub
		return super.getVelocit‡Max();
	}

	@Override
	public void setVelocit‡Max(double velocit‡Max) {
		// TODO Auto-generated method stub
		super.setVelocit‡Max(velocit‡Max);
	}

	@Override
	public int getCilindrata() {
		// TODO Auto-generated method stub
		return super.getCilindrata();
	}

	@Override
	public void setCilindrata(int cilindrata) {
		// TODO Auto-generated method stub
		super.setCilindrata(cilindrata);
	}

	@Override
	public int getMarce() {
		// TODO Auto-generated method stub
		return super.getMarce();
	}

	@Override
	public void setMarce(int marce) {
		// TODO Auto-generated method stub
		super.setMarce(marce);
	}

	@Override
	public int getPesoVuoto() {
		// TODO Auto-generated method stub
		return super.getPesoVuoto();
	}

	@Override
	public void setPesoVuoto(int pesoVuoto) {
		// TODO Auto-generated method stub
		super.setPesoVuoto(pesoVuoto);
	}

	@Override
	public byte getCarburante() {
		// TODO Auto-generated method stub
		return super.getCarburante();
	}

	@Override
	public void setCarburante(byte carburante) {
		// TODO Auto-generated method stub
		super.setCarburante(carburante);
	}

	@Override
	public int getCapienzaPersone() {
		// TODO Auto-generated method stub
		return super.getCapienzaPersone();
	}

	@Override
	public void setCapienzaPersone(int capienzaPersone) {
		// TODO Auto-generated method stub
		super.setCapienzaPersone(capienzaPersone);
	}

	@Override
	public String getTipoDiCambio() {
		// TODO Auto-generated method stub
		return super.getTipoDiCambio();
	}

	@Override
	public void setTipoDiCambio(String tipoDiCambio) {
		// TODO Auto-generated method stub
		super.setTipoDiCambio(tipoDiCambio);
	}

	@Override
	public String getColore() {
		// TODO Auto-generated method stub
		return super.getColore();
	}

	@Override
	public void setColore(String colore) {
		// TODO Auto-generated method stub
		super.setColore(colore);
	}

	@Override
	public String getURLImg() {
		// TODO Auto-generated method stub
		return super.getURLImg();
	}

	@Override
	public void setURLImg(String uRLImg) {
		// TODO Auto-generated method stub
		super.setURLImg(uRLImg);
	}

	@Override
	public String getOptional() {
		// TODO Auto-generated method stub
		return super.getOptional();
	}

	@Override
	public void setOptional(String optional) {
		// TODO Auto-generated method stub
		super.setOptional(optional);
	}

	@Override
	public String toString() {
		return "ModelloMacchina [modello=" + modello + ", marca=" + marca + ", porte=" + porte + ", id=" + id
				+ ", velocit‡Max=" + velocit‡Max + ", cilindrata=" + cilindrata + ", marce=" + marce + ", pesoVuoto="
				+ pesoVuoto + ", carburante=" + carburante + ", capienzaPersone=" + capienzaPersone + ", tipoDiCambio="
				+ tipoDiCambio + ", colore=" + colore + ", URLImg=" + URLImg + ", optional=" + optional + ", rimanenza="
				+ rimanenza + ", ruote=" + ruote + "]";
	}

}
