package porudzbine;

import porudzbine.pizze.*;
import porudzbine.paste.*;
import porudzbine.pice.*;
import porudzbine.prilozi.*;
	
public class FactoryJela {
	public static Obrok obrokIsok() {
		return null;
	}	
	
	public static Obrok getInstance(String ime, int kolicina){ 

        if(ime==null){
        return null;
        }
        //PIZZE************************************************
        else if(ime.equalsIgnoreCase("Capricciosa")) { //equalsIgnoreCase - ignorise da'l su mala ili velika slova
            return new Capricciosa(kolicina);
        }   
        else if(ime.equalsIgnoreCase("Siciliana")) { 
            return new Siciliana(kolicina);
        }
        else if(ime.equalsIgnoreCase("Margherita")) { 
            return new Margherita(kolicina);
        }
        else if(ime.equalsIgnoreCase("Vesuvio")) { 
            return new Vesuvio(kolicina);
        }
        //PASTE************************************************
        
        else if(ime.equalsIgnoreCase("Arrabbiata")) { 
            return new Arrabbiata(kolicina);
        }   
        else if(ime.equalsIgnoreCase("Carbonara")) { 
            return new Carbonara(kolicina);
        }
        else if(ime.equalsIgnoreCase("Italiana")) { 
            return new Italiana(kolicina);
        }
        else if(ime.equalsIgnoreCase("Napoletana")) { 
            return new Napoletana(kolicina);
        }
        else if(ime.equalsIgnoreCase("Prosciutto")) { 
            return new Prosciutto(kolicina);
        }
        //SOKOVI************************************************
        
        else if(ime.equalsIgnoreCase("CocaCola")) { 
            return new CocaCola(kolicina);
        }
        else if(ime.equalsIgnoreCase("negaziraniSok")) { 
            return new negaziraniSok(kolicina);
        }
        else if(ime.equalsIgnoreCase("Voda")) { 
            return new Voda(kolicina);
        } 
        
        //PRILOZI************************************************
        
        else if(ime.equalsIgnoreCase("Kecap")) { 
            return new Kecap(kolicina);
        }
        else if(ime.equalsIgnoreCase("Origano")) { 
            return new Origano(kolicina);
        }
        else if(ime.equalsIgnoreCase("ExtraCheese")) { 
            return new ExtraCheese(kolicina);
        }
        else if(ime.equalsIgnoreCase("Majonez")) { 
            return new Majonez(kolicina);
        }
        else if(ime.equalsIgnoreCase("Kupus")) { 
            return new Kupus(kolicina);
        }
        return null;
    }
	
	
}
