package core;

public class PorComissao extends Empregado implements Commission{

	private double sales;

	public PorComissao() {
	}

	public PorComissao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPlay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVendas(double sales) {
		// TODO Auto-generated method stub
		
	}

}
