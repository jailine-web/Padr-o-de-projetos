package Strategy;

public class EntregaExpressa implements TipoEncomenda{

	@Override
	public void entrega() {
		System.out.println("Ser�o obrados R$16,00 de frete na entrega expressa");
		//Calculo do frete
	}

}
