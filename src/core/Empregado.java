package core;

public abstract class Empregado {

	private String nome;

	public Empregado(String nome) {
		this.nome = nome;
	}

	public void printPlay() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Valor: " + getPlay());
	}

	public abstract double getPlay();

}
