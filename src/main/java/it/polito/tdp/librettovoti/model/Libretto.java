package it.polito.tdp.librettovoti.model;

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

}
