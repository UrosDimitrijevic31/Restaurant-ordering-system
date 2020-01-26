package porudzbine;

public class UkupnoCelaPorudzbina {
	
	int brojStola;
	
	public UkupnoCelaPorudzbina(Obrok o, int brojStola) {
		this.brojStola = brojStola;
		
		System.out.println(o + ", Broj stola: " + brojStola + ", naplata: " + o.vratiCenu());
	}
	
	public UkupnoCelaPorudzbina(Obrok o, Obrok o2,int brojStola) {
		this.brojStola = brojStola;
		System.out.println(o +"+ "+ o2 + ", Broj stola: "+ brojStola +", naplata: "+ (o.vratiCenu() +o2.vratiCenu()) );
	}
	
	public UkupnoCelaPorudzbina(Obrok o, Obrok o2, Obrok o3, int brojStola) {
		this.brojStola = brojStola;
		System.out.println(o +"+ "+ o2 + "+ " +o3 + ", Broj stola: "+ brojStola + ", naplata: "+(o.vratiCenu() + o2.vratiCenu() + o3.vratiCenu() ));
	}
	
	
	
}
