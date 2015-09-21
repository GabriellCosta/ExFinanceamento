package core;

public class FolhadePagamento {
	
	public static void main(String[] args) {
		PorComissao porComissao = new PorComissao("Ricardo");
		porComissao.setVendas(10);
		porComissao.printPlay();
		
		
		PorHora porHora = new PorHora("Gabriel");
		porHora.setNumHora(10);
		porHora.setValorHora(15);
		porHora.printPlay();
		
		PorHoraComissao porHoraComissao = new PorHoraComissao("Luiz");
		porHoraComissao.setNumHora(15);
		porHoraComissao.setValorHora(23);
		porHoraComissao.setVendas(150);
		porHoraComissao.printPlay();
	}

}
