package porudzbine.prilozi;

import porudzbine.Obrok;

public class Majonez implements Obrok{
	
	private int cena = 25;
	private int kolicina;//br narucenih pizza
    
    public Majonez(int kolicina){
        this.kolicina = kolicina;
    } 
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " + "Majonez";
    }

}
