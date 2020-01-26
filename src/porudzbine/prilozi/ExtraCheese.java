package porudzbine.prilozi;

import porudzbine.Obrok;

public class ExtraCheese implements Obrok{
	
	private int cena = 40;
	private int kolicina;//br narucenih pizza
    
    public ExtraCheese(int kolicina){
        this.kolicina = kolicina;
    } 
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " + "ExtraCheese";
    }
}
