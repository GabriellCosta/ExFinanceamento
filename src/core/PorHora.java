package core;

public class PorHora extends Empregado implements Commission {

	private double valorHora;
	private int numHora;

	public PorHora(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setVendas(double sales) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getPlay() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumHora() {
		return numHora;
	}

	public void setNumHora(int numHora) {
		this.numHora = numHora;
	}

}
