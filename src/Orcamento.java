import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	private double valor;
	
	private List<Item> itens = new ArrayList<Item>();

	public Orcamento(double valor) {
		super();
		this.valor = valor;
	}

	public Orcamento() {
		super();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public void insereItem(Item item){
		itens.add(item);
	}

}
