package entities;

import java.util.HashMap;
import java.util.Map;

public class Garage {
	protected Map<Integer, Veicolo> veicoliInGarage;
	
	
	public Garage() {
		this.veicoliInGarage= new HashMap<>();
	}
	
	public void add(Veicolo veicoloToBeAdded) {
		veicoliInGarage.push(veicoloToBeAdded.getId(), veicoloToBeAdded);
	}
	public void delete(Veicolo veicoloToBeRemoved) {
		veicoloToBeRemoved.setRimanenza(veicoloToBeRemoved.getRimanenza()-1);
	}
	public Map<Integer, Veicolo> getGarage() {
		return this.veicoliInGarage;
	}
	public void print() {
		for (Map.Entry<Integer, Veicolo> entry : veicoliInGarage.entry()) {
			System.out.println(entry.getKey() +" "+entry.getValue().getNome());
		}	
	}
	
}
