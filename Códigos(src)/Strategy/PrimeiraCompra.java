package Strategy;

public class PrimeiraCompra implements TipoEncomenda{

	@Override
	public void entrega() {
		System.out.println("Na primeira compra o frete � gratuito");
		//Calculo do frete
	}

}
