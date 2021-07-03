package entities;

import java.util.ArrayList;


public class Salesman extends Umano{
	protected int SALARIO_BASE=1250;
	protected final int PROVVIGIONE= 260;
	protected int BONUS=120;
	
	ArrayList<Veicolo> veicoliVendutiTOT;
	ArrayList<Veicolo> veicoliVendutiQuestoMese;
	
	
	public int getSalario() {
		int stipendio=SALARIO_BASE;
		if(veicoliVendutiQuestoMese.size()>0) {
			stipendio+=veicoliVendutiQuestoMese.size()*PROVVIGIONE;
			stipendio+=BONUS;
		}
		return stipendio;
	}
}
