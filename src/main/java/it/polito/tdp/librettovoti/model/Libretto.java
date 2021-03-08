package it.polito.tdp.librettovoti.model;

import java.awt.List;
import java.util.LinkedList;

public class Libretto {
	
	public LinkedList<Voto> voti=new LinkedList<Voto>();
	
	public void add(Voto v) {
		
		voti.add(v);
	}
	
	public String toString() {
		String s="";
		for(Voto v:this.voti)
			s=s+v.toString()+"\n";
		
		return s;
		}
	
	public LinkedList <Voto> listaVotiUguali(int punteggio){
		LinkedList<Voto> risultato =new LinkedList<Voto>();
		for(Voto v:this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
				
			}
		}
		return risultato;
	}
	
	public Libretto votiUguali(int punteggio) {
		
		Libretto risultato =new Libretto();
		for(Voto v:this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
				
			}
			
		}return risultato;
		
	}
	

}
