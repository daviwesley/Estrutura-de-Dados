package ListaEncadeada;
/*
 * Lista encadeada com ponteiro no inicio e no fim
 * 
 * 
 * */
public class ListaEncadeada {
	private No inicio;
	private No fim;
	private int tam;
	
	public void adicionarInicio(int x){
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
	
	public void adicionarFim(int x){
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
	
	public void adicionarPosicao(int posicao,int x){
		if(posicao  == 0){
			adicionarInicio(x);
			//adicionarFim(x);
		}else if(posicao - 1 == this.tam){
			adicionarFim(x);
			//adicionarInicio(x);
		}else{
		No n = new No();
		n.setConteudo(x);
		No temp = inicio;
		for(int i = 1; i < posicao - 1; i++){
			temp = temp.getProx();
		}
		n.setProx(temp.getProx());
		temp.setProx(n);
		this.tam++;
		
		}
		
	}
	
	public void removerInicio(){
		No temp = inicio;
		inicio = temp.getProx();
		this.tam--;
	}
	
	public void removerFinal(){
		if(this.tam == 1){
			this.removerInicio();
		}else{
		No temp = inicio;
		for(int i = 1; i < this.tam-1; i++){
			temp = temp.getProx();			
		}
		temp.setProx(null);
		fim = temp;
		this.tam--;	
		}
	}
	
	public void removerPosicao(int posicao){
		if(posicao == 1){
			this.removerInicio();
		}else if(posicao == tam){
			this.removerFinal();
		}else{
		No temp = inicio;
		for(int i = 1; i < posicao - 1; i++){
			temp = temp.getProx();			
		}
		temp.setProx(temp.getProx().getProx());
		this.tam--;
		}
	}
	
	public void ImprimirPosicao(int posicao){
		No temp = inicio;
		for(int i = 0; i < posicao-1; i++){
			temp = temp.getProx();			
		}
		System.out.println(temp.getConteudo());		
	}
	
	public void imprimir(){
		if(this.inicio == null){
			System.out.println("[!]Lista Vazia");
			return;
		}
		No temp = this.inicio;
		System.out.print(temp.getConteudo() + "\t");
		while(temp.getProx() != null){
			temp = temp.getProx();
			System.out.print(temp.getConteudo() + "\t");
		}
	}
	
		

}
