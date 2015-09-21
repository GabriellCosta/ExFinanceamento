package core;

public class PorComissao extends Empregado implements Commission {

	private double sales;

	public PorComissao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPlay() {
		// TODO Auto-generated method stub
		return this.sales * Commission.COMMISION_RATE;
	}

	@Override
	public void setVendas(double sales) {
		this.sales = sales;
	}

}
