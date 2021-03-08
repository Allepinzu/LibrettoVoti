package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
	
	public static void main(String[] args) {
		
		System.out.println("Test medodi Libretto Voti");

    Libretto libretto = new Libretto();
    boolean controllo=false;
    
    Voto voto1=new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));
    Voto voto2=new Voto("Analisi 2", 25, LocalDate.of(2019, 3, 15));
    Voto voto3=new Voto("Analisi 3", 28, LocalDate.of(2019, 4, 15));
    
    libretto.add(voto1);
    libretto.add(voto2);
    libretto.add(voto3);
    
    System.out.println(libretto.toString());
    
   /* for(Voto v:libretto.voti)
    	if(v.getVoto()==25) {
    		System.out.println(v.getNome()+"\n");
    		controllo=true;
    		}
    if(controllo==false)
    	System.out.println("Nessun Corso" +"\n");
	}*/
    
    List<Voto> venticinque=libretto.listaVotiUguali(25);
    
    Libretto librettoventicinque= libretto.votiUguali(25);
    
    System.out.println(librettoventicinque.toString());
    System.out.println(venticinque.toString());
	}
}
