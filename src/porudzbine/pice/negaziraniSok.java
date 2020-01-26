package porudzbine.pice;

import porudzbine.Obrok;

public class negaziraniSok implements Obrok {
	
	int cena = 300;
	private int kolicina;
	private double zapremina = 0.25;
    
    public negaziraniSok(int kolicina){
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
        return kolicina + "x " + "negaziraniSok";
    }
}
