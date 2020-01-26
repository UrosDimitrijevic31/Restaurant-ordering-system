package porudzbine.prilozi;

import porudzbine.Obrok;

public class Origano implements Obrok{
	
	private int cena = 20;
	private int kolicina;//br narucenih pizza
    
    public Origano(int kolicina){
        this.kolicina = kolicina;
    } 
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " + "Origano";
    }
}
