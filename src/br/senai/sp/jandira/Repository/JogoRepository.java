package br.senai.sp.jandira.Repository;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {

	private Jogo[] jogosgravados;

	public JogoRepository() {
		jogosgravados = new Jogo[20];

	}

	public JogoRepository(int quantidadejogos) {
		jogosgravados = new Jogo[quantidadejogos];
	}

	public void gravar(Jogo jogo, int posicao) {
		jogosgravados[posicao] = jogo;

	}

	public Jogo listarJogos(int posicao) {
		return jogosgravados[posicao];

	}

	public Jogo[] listartodos() {
		return jogosgravados;
	}

	public int getTamanho() {
		return jogosgravados.length;
	}
}