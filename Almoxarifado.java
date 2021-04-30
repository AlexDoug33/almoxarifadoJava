import java.util.Scanner;
import java.util.Date;

public class Almoxarifado{ 
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		int vezes;
		System.out.println("Inserir a quantidade de vezes que deseja utilizar o programa ");
		vezes = in.nextInt();
		int x = 0;
		while(x <= vezes){
			mostrarMenu();
		}
	}
			
	private static void mostrarMenu(){
		System.out.println("1 - Gerenciar Itens");
		System.out.println("2 - Gerenciar Responsáveis");
		System.out.println("3 - Gerenciar Movimentações");
		System.out.println("4 - Saída do Programa");
		int opcao = in.nextInt();
		in.nextLine();
		switch(opcao){
			case 1:
				mostrarMenuItens();
			break;

			case 2:
				mostrarMenuResponsaveis();
			break;

			case 3:
				mostrarMenuMovimentacoes();
			break;

			case 4:
				adicionarSaida(); 
			break; 
			default:
				System.out.println("Opção inválida");
		}
	}

	private static void mostrarMenuItens(){
		System.out.println("1 - Adicionar item");
		System.out.println("2 - Listar itens");
		int opcao = in.nextInt();
		in.nextLine();
		switch(opcao){
			case 1:
				adicionarItem();

			break;
				
			case 2:
				listarItens();

			break;
			default:
				System.out.println("Opção inválida");
		}
	}

	private static void adicionarItem(){
		String identificacao;
		String nome;
		String descricao;

		System.out.print("Digite a identificação do item: ");
		identificacao = in.nextLine();

		System.out.print("Digite o nome do item: ");
		nome = in.nextLine();

		System.out.print("Digite a descrição do item: ");
		descricao = in.nextLine();

		ItemDAO.adicionarItem(new Item(identificacao, nome, descricao));
	}

	private static void listarItens(){
		System.out.println();
		for (Item item : ItemDAO.getItens()) {
			System.out.println(item);
		}
		System.out.println();
	}

	private static void mostrarMenuResponsaveis(){
		System.out.println("1 - Adicionar responsável");
		System.out.println("2 - Listar responsáveis");
		int opcao = in.nextInt();
		in.nextLine();
		switch(opcao){
			case 1:
				adicionarResponsavel();
			break;
				
			case 2:
				listarResponsaveis();
			break;
			default:
				System.out.println("Opção inválida");
		}
	}

	private static void adicionarResponsavel(){
		String identificacao;
		String nome;

		System.out.print("Digite a identificação do responsável: ");
		identificacao = in.nextLine();

		System.out.print("Digite o nome do responsável: ");
		nome = in.nextLine();

		ResponsavelDAO.adicionarResponsavel(new Responsavel(identificacao, nome));
	}

	private static void listarResponsaveis(){
		System.out.println();
		for (Responsavel responsavel : ResponsavelDAO.getResponsaveis()) {
			System.out.println(responsavel);
		}
		System.out.println();
	}

	private static void mostrarMenuMovimentacoes(){
		System.out.println("1 - Adicionar entrada");
		System.out.println("2 - Adicionar saída");
		System.out.println("3 - Listar movimentações");
		int opcao = in.nextInt();
		in.nextLine();
		switch(opcao){
			case 1:
				adicionarEntrada();
			break;
				
			case 2:
				adicionarSaida();
			break;

			case 3:

				listarMovimentacoes();
			break;

			default:
				System.out.println("Opção inválida");
		}
	}


	private static void adicionarEntrada(){
		System.out.println("Itens:");
		listarItens();
		System.out.println("Digite a identificacao do item: ");
		String idItem = in.nextLine();
		Item item = ItemDAO.buscarPorId(idItem);

		System.out.println("Responsáveis:");
		listarResponsaveis();
		System.out.println("Digite a identificacao do responsavel: ");
		String idResponsavel = in.nextLine();
		Responsavel responsavel = ResponsavelDAO.buscarPorId(idResponsavel);

		Movimentacao m = new Movimentacao(new Date(),
			TipoMovimentacao.ENTRADA,
			item,
			responsavel);

		MovimentacaoDAO.adicionarMovimentacao(m);
	}

	private static void adicionarSaida(){
	
	}

	


	private static void listarMovimentacoes(){
		System.out.println();
	
		for (Movimentacao movimentacao : MovimentacaoDAO.getMovimentacoes()) {
			System.out.println(movimentacao);
		}
		System.out.println();
	}
}