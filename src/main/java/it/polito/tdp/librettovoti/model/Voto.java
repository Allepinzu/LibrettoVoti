package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class Voto {
    private String nome;
    private int voto;
    private LocalDate data;
	
    /**
     * 
     * @param nome
     * @param voto
     * @param data
     */
    public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}
	
    /**
     * 
     * 
     * @return
     */
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Voto [nome=" + nome + ", voto=" + voto + ", data=" + data + "]";
	}
	

    
}
