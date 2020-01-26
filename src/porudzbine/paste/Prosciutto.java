package porudzbine.paste;

import porudzbine.Obrok;

public class Prosciutto implements Obrok{
	
	private int cena = 300;
	private int kolicina;//br narucenih pizza
    
    public Prosciutto(int kolicina){
        this.kolicina = kolicina;
    } 
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " + "Prosciutto";
    }

}
