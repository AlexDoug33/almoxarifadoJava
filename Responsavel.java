public class Responsavel{
	private String identificacao;
	private String nome;

	public Responsavel(String identificacao, String nome){
		this.identificacao = identificacao;
		this.nome = nome;
	}

	public String getIdentificacao(){
		return this.identificacao;
	}

	@Override
	public String toString(){
		return String.format("%s - %s",
			this.identificacao,
			this.nome);
	}
}