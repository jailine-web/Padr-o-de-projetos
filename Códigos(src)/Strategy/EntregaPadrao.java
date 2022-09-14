package Strategy;

public class EntregaPadrao implements TipoEncomenda{

	@Override
	public void entrega() {
		System.out.println("Serão cobrados R$12,90 de frete na entrega padrão");
		//Calculo do frete
	}

}
