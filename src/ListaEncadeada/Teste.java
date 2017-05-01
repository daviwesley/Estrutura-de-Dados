package ListaEncadeada;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaEncadeada l = new ListaEncadeada();
		
		l.adicionarInicio(3);
		l.adicionarInicio(4);
		l.adicionarFim(2);
		l.adicionarFim(90);
		l.imprimir();
		l.removerPosicao(4);
		System.out.println("");
		l.imprimir();
		
	}

}
