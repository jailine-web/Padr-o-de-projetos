package Strategy;

public class EntregaPadrao implements TipoEncomenda{

	@Override
	public void entrega() {
		System.out.println("Ser�o cobrados R$12,90 de frete na entrega padr�o");
		//Calculo do frete
	}

}
