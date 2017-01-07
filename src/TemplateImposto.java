
public abstract class TemplateImposto implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveAplicarTaxaMaxima(orcamento)) {
			return aplicaTaxaMaxima(orcamento);
		} else {
			return aplicaTaxaMinima(orcamento);

		}
	}

	public abstract boolean deveAplicarTaxaMaxima(Orcamento orcamento);

	public abstract double aplicaTaxaMaxima(Orcamento orcamento);

	public abstract double aplicaTaxaMinima(Orcamento orcamento);

}
