package Strategy;

public class Main {

	public static void main(String[] args) {
		
		TipoEncomenda prime    = new PrimeGratis();
		TipoEncomenda primeira = new PrimeiraCompra();
		TipoEncomenda padrao   = new EntregaPadrao();
		TipoEncomenda expressa = new EntregaExpressa();
		
		
		Encomenda encomenda1 = new Encomenda();
		Encomenda encomenda2 = new Encomenda();
		Encomenda encomenda3 = new Encomenda();
		Encomenda encomenda4 = new Encomenda();
		
		System.out.println();
		encomenda1.setStrategy(prime);
		encomenda1.entrega();
		
		System.out.println();
		encomenda2.setStrategy(primeira);
		encomenda2.entrega();
		
		System.out.println();
		encomenda3.setStrategy(padrao);
		encomenda3.entrega();
		
		System.out.println();
		encomenda4.setStrategy(expressa);
		encomenda4.entrega();
		
	
	}
	
}
