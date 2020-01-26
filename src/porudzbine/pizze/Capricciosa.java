package porudzbine.pizze;

import porudzbine.Obrok;

public class Capricciosa implements Obrok{
	
	private int cena = 300;
	private int kolicina;//br narucenih pizza
    
    public Capricciosa(int kolicina){
        this.kolicina = kolicina;
    } 
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " + "Capriccosa";
    }
}
