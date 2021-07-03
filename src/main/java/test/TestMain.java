package test;

import entities.Garage;
import entities.ModelloMacchina;
import entities.ModelloMoto;

public class TestMain {

	public static void main(String[] args) {
		Garage asti= new Garage();
		ModelloMoto zeroSR= new ModelloMoto("zero", "SR");
		asti.add(zeroSR);
		ModelloMacchina ferrariTestaRossa= new ModelloMacchina("Ferrari", "TestaRossa");
		asti.add(ferrariTestaRossa);
		asti.print();

	}

}
