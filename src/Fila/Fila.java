package Fila;

import ListaEncadeada.No;

public class Fila  {
	private int tam;
	private No inicio;
	private No fim;

	public void adicionar(int x){
		//adiciona no fim
		if(this.inicio == null){
			this.adicionarInicio(x);
		}else{
		No n = new No();
		n.setConteudo(x);
		fim.setProx(n);
		fim = n;
		this.tam++;
		}
	}
	
	private void adicionarInicio(int x){
		No n = new No();
		n.setConteudo(x);
		if(inicio == null){
			inicio = n;
			fim = n;			
		}else{
			n.setProx(inicio);
			this.inicio = n;				
		}		
		this.tam++;
	}
	
	public void remover(){
		//remove do inicio
		if(inicio == null){
			throw new IllegalArgumentException("A lista está vazia");
		}
		No temp = inicio;
		inicio = temp.getProx();
		this.tam--;
	}
	
	@Override
	public String toString() {
		StringBuffer string = new StringBuffer();
		for(No n = inicio; n != null; n = n.getProx()){
			string.append(n.getConteudo());
			string.append(" ");
		}
		return string.toString();
	}
	
	
}
