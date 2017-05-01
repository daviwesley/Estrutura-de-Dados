package ListaPrioridade;

public class ListaPrioridade {
	private int[] lista = new int[100];
	private int tam;
	
	public void subir(int i){
		int j = i/2;
		
		if(j >= i){
			if(lista[i] > lista[j]){
				int temp = lista[i];
				lista[i] = lista[j];
				lista[j] = temp;
				subir(j);				
			}
		}
	}

	public void descer(int i){
		
	}
	
	public void inserir(int x){
		
	}
	
	public int remover(){
		return 0;
	}
}

