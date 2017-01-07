
public class IKCV extends TemplateImposto {

	@Override
	public boolean deveAplicarTaxaMaxima(Orcamento orcamento) {
		return (orcamento.getItens().size() < 10);
	}

	@Override
	public double aplicaTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.15;
	}

	@Override
	public double aplicaTaxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.075;
	}

}
