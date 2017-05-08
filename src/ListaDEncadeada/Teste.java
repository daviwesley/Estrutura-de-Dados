package ListaDEncadeada;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDEncadeada l = new ListaDEncadeada();
		
		l.adicionarInicio(3);
		l.adicionarFim(4);
		l.adicionarPosicao(2, 23);
		l.removerPosicao(2);
		l.imprimir();
		System.out.println("\nTotal da Soma " + l.somarElementosRecursao());
	}

}
