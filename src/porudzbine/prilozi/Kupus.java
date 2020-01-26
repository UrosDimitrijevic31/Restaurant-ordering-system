package porudzbine.prilozi;

import porudzbine.Obrok;

public class Kupus implements Obrok{
	
	private int cena = 30;
	private int kolicina;//br narucenih pizza
    
    public Kupus(int kolicina){
        this.kolicina = kolicina;
    } 
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " + "Kupus";
    }

}
