public class Item{
	private String identificacao;
	private String nome;
	private String descricao;

	public Item(String identificacao, String nome, String descricao){
		this.identificacao = identificacao;
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getIdentificacao(){
		return this.identificacao;
	}

	@Override
	public String toString(){
		return String.format("%s - %s - %s",
			this.identificacao,
			this.nome,
			this.descricao);
	}
}