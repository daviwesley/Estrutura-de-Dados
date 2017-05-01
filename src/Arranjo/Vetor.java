/**
 * 
 */
package Arranjo;

/**
 * @author daviwesley
 *
 */
public class Vetor {
	private int conteudo[] = new int[100];
	public int tam;
	
	public void adicionaFim(int x){
		this.conteudo[tam] = x;
		this.tam++;
	}
	
	public void adicionaInicio(int x){
		if(tam == 0 ){
			adicionaFim(x);
		}else{
			for(int i = this.tam; i >= 0; i--){
				this.conteudo[i+1] = this.conteudo[i];				
			}
			this.conteudo[0] = x;
			this.tam++;
		}
	}
	
	public void adicionaPosicao(int x, int posicao){
		if(!posicaValida(posicao)){
			throw new IllegalArgumentException("Posicao inexistente!");
		}
		
		for(int i = this.tam; i >=posicao; i--){
			this.conteudo[i+1] = this.conteudo[i];
		}
		this.conteudo[posicao] = x;
		this.tam++;
		
	}
	
	public void removerInicio(){
		for(int i = 0; i < this.tam; i++){
			this.conteudo[i] = this.conteudo[i+1];
		}
		this.tam--;
	}
	
	public void removerFinal(){
		if(this.tam >= 0){
			this.tam--;
		}
	}
	
	public void removerPosicao(int posicao){
		//posicao++;
		if(!posicaValida(posicao)){
			throw new IllegalArgumentException("Posicao inexistente!");
		}
		
		for(int i = posicao; i <=this.tam - 1; i++){
			this.conteudo[i] = this.conteudo[i+1];
		}
		this.tam--;
	}
	
	public void Imprimir(){
		for(int i = 0; i < this.tam; i++){
			System.out.println(this.conteudo[i]);
		}
	}
		
	private boolean posicaValida(int posicao){
		return posicao >=0 && posicao <= this.tam;
	}
}
