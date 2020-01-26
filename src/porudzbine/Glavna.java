package porudzbine;

public class Glavna {

	public static void main(String[] args) {
		
		Obrok pizza1 = FactoryJela.getInstance("Capricciosa", 1);
		Obrok prilog1 = FactoryJela.getInstance("kecap", 1);
		Obrok prilog2 = FactoryJela.getInstance("origano", 1);
		
        
        UkupnoCelaPorudzbina uk = new UkupnoCelaPorudzbina(pizza1,prilog1, prilog2,4);
        
        
       
	}

}
