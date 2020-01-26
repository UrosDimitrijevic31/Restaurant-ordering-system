package porudzbine.paste;

import porudzbine.Obrok;

public class Napoletana implements Obrok{
	
	private int cena = 300;
	private int kolicina;//br narucenih pizza
    
    public Napoletana(int kolicina){
        this.kolicina = kolicina;
    } 
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " + "Napoletana";
    }

}
