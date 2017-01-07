
public class ICCC extends TemplateImposto {

	@Override
	public boolean deveAplicarTaxaMaxima(Orcamento orcamento) {
		return (orcamento.getValor() > 1000);
	}

	@Override
	public double aplicaTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double aplicaTaxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

}
