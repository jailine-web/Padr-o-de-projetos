package Strategy;

public class PrimeGratis implements TipoEncomenda{

	@Override
	public void entrega() {
		System.out.println("Clientes prime não pagam frete");
	}

}
