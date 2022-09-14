package Strategy;

public class Encomenda {
	
	private TipoEncomenda estrategia;
	
	public void setStrategy(TipoEncomenda strategy) {
		this.estrategia = strategy;
	}
	
	public void entrega() {
		estrategia.entrega();
	}

}
