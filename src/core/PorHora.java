package core;

public class PorHora extends Empregado{

	private double valorHora;
	private int numHora;

	public PorHora(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double getPlay() {
		return getValorHora() * getNumHora();
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
