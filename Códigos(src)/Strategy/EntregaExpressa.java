package Strategy;

public class EntregaExpressa implements TipoEncomenda{

	@Override
	public void entrega() {
		System.out.println("Serão obrados R$16,00 de frete na entrega expressa");
		//Calculo do frete
	}

}
