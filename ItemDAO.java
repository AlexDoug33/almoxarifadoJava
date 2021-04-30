import java.util.ArrayList;

public class ItemDAO{
	private static ArrayList<Item> itens = new ArrayList<>();

	public static void adicionarItem(Item item){
		itens.add(item);
	}

	public static ArrayList<Item> getItens(){
		return itens;
	}

	public static Item buscarPorId(String id){
		Item retorno = null;
		for (Item item : itens) {
			if (item.getIdentificacao().equals(id)) {
				retorno = item;
				break;
			}
		}

		return retorno;
	}
}