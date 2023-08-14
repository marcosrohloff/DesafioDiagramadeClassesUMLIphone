package br.com.dio.iphone.navegador;

public class InternetExplorer implements Internet {

	@Override
	public void pagina() {
		System.out.println("Pagina Aberta");
	}

	@Override
	public void adicionandoNovaPagina() {
		System.out.println("Adicionar nova pagina");
	}

	@Override
	public void atualizaPagina() {
		System.out.println("Atualizando pagina");
	}

}
