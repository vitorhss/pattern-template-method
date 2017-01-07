
public class TestaCalculoDeImposto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(100);
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		System.out.println("ICCC: " + calculador.realizaCalculo(orcamento, new ICCC()));
		System.out.println("IKCV:" + calculador.realizaCalculo(orcamento, new IKCV()));
		
	}

}
