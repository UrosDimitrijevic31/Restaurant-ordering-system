package porudzbine.paste;

import porudzbine.Obrok;

public class Italiana implements Obrok{
	
	private int cena = 300;
	private int kolicina;//br narucenih pizza
    
    public Italiana(int kolicina){
        this.kolicina = kolicina;
    } 
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " +"Italiana";
    }

}
