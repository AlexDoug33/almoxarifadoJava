import java.util.Date;

public class Movimentacao{
	private Date data;
	private TipoMovimentacao tipo;
	private Item item;
	private Responsavel responsavel;

	public Movimentacao(Date data, TipoMovimentacao tipo, Item item, Responsavel responsavel){
		this.data = data;
		this.tipo = tipo;
		this.item = item;
		this.responsavel = responsavel;
	}

	@Override
	public String toString(){
		return String.format("Data: %s\nTipo: %s\nItem: %s\nResponsável: %s\n",
			this.data, this.tipo, this.item, this.responsavel);
	}
}

enum TipoMovimentacao{
	ENTRADA, SAIDA;
}