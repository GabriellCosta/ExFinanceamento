package core;

public class PorHoraComissao  extends PorHora implements Commission {

	public PorHoraComissao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private double sales;

	public void setVendas(double sales) {
		this.sales = sales;
	}

	public double getPlay() {
		return this.getNumHora() * this.getValorHora() + sales * Commission.COMMISION_RATE;
	}

}
