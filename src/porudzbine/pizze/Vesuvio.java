package porudzbine.pizze;

import porudzbine.Obrok;

public class Vesuvio implements Obrok{
	
	private int cena = 450;
	private int kolicina;//br narucenih pizza
    
    public Vesuvio(int kolicina){
        this.kolicina = kolicina;
    } 
	
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " + "Vesuvio";
    }

}
