package porudzbine.pice;

import porudzbine.Obrok;

public class CocaCola implements Obrok {
	
	private int cena = 300;
	private int kolicina;
	private double zapremina = 0.5;
    
    public CocaCola(int kolicina){
        this.kolicina = kolicina;
    } 
    
    public double vratiZapreminu(double zapremina) {
    	return zapremina;
    }
	
	@Override
	public int vratiCenu() {
		return cena;
	}
	
	@Override
    public String toString() {
        return kolicina + "x " + "CocaCola";
    }

}
