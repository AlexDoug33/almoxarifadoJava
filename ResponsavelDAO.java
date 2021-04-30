import java.util.ArrayList;

public class ResponsavelDAO{
	private static ArrayList<Responsavel> responsaveis = new ArrayList<>();

	public static void adicionarResponsavel(Responsavel responsavel){
		responsaveis.add(responsavel);
	}

	public static ArrayList<Responsavel> getResponsaveis(){
		return responsaveis;
	}

	public static Responsavel buscarPorId(String id){
		Responsavel retorno = null;
		for (Responsavel responsavel : responsaveis) {
			if (responsavel.getIdentificacao().equals(id)) {
				retorno = responsavel;
				break;
			}
		}

		return retorno;
	}
}