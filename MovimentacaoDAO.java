import java.util.ArrayList;

public class MovimentacaoDAO{
	private static ArrayList<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();

	public static void adicionarMovimentacao(Movimentacao movimentacao){
		movimentacoes.add(movimentacao);
	}

	public static ArrayList<Movimentacao> getMovimentacoes(){
		return movimentacoes;
	}
}