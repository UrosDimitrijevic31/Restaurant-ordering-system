package porudzbine.pizze;

import porudzbine.Obrok;

public class Siciliana implements Obrok{
	
	private int cena = 350;
	private int kolicina;//br narucenih pizza
    
    public Siciliana(int kolicina){
        this.kolicina = kolicina;
    } 
    
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " + "Siciliana ";
    }
	
}
