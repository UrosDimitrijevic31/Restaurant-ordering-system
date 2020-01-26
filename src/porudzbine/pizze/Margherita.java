package porudzbine.pizze;

import porudzbine.Obrok;

public class Margherita implements Obrok{
	
	private int cena = 400;
	private int kolicina;//br narucenih pizza
    
    public Margherita(int kolicina){
        this.kolicina = kolicina;
    } 
    
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " + "Margherita";
    }
}
