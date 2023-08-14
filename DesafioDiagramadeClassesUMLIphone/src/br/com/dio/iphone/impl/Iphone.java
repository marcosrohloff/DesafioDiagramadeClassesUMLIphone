package br.com.dio.iphone.impl;

import br.com.dio.iphone.musica.Musica;
import br.com.dio.iphone.navegador.Internet;
import br.com.dio.iphone.telefone.Telefone;

public class Iphone implements Musica, Internet, Telefone {

	@Override
	public void ligar() {
		System.out.println("Ligar via equipamento Iphone");		
	}

	@Override
	public void atender() {
		System.out.println("Atender via equipamento Iphone");		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz via equipamento Iphone");
	}

	@Override
	public void pagina() {
		System.out.println("Abrindo a pagina via equipamento Iphone");
	}

	@Override
	public void adicionandoNovaPagina() {
		System.out.println("Adicionando nova pagina via equipamento Iphone");
	}

	@Override
	public void atualizaPagina() {
		System.out.println("Atualizando a pagina via equipamento Iphone");
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo musica via equipamento Iphone");
	}

	@Override
	public void pausar() {
		System.out.println("Parado na musica via equipamento Iphone");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Escolhendo musica via equipamento Iphone");
	}

}
