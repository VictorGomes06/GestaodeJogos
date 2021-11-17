package br.senai.sp.jandira.Repository;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {

	private Jogo[] meusjogos;

	public JogoRepository() {
		meusjogos = new Jogo[20];

	}

	public JogoRepository(int quantidadejogos) {
		meusjogos = new Jogo[quantidadejogos];
	}

	public void gravar(Jogo jogo, int posicao) {
		meusjogos[posicao] = jogo;

	}

	public Jogo listarJogos(int posicao) {
		return meusjogos[posicao];

	}

	public Jogo[] listartodos() {
		return meusjogos;
	}

}
