package br.senai.sp.jandira;

import br.senai.sp.jandira.ui.FrameCadastro;

public class App {
	public static void main(String[] args) {

		/*
		 * JogoRepository meusjogos = new JogoRepository(3);
		 * 
		 * Jogo a = new Jogo(); a.setTitulo("God of war");
		 * a.setConsole(Console.PLAYSTATIONTWO); a.setValor(10);
		 * a.setObservacao("jogo que vai ficar para a historia dos games");
		 * meusjogos.gravar(a, 0);
		 * 
		 * Jogo b = new Jogo(); b.setTitulo("God of War2");
		 * b.setConsole(Console.PLAYSTATIONTWO); b.setValor(40); meusjogos.gravar(b, 1);
		 * 
		 * Jogo c = new Jogo(); c.setTitulo("Manicraft"); c.setConsole(Console.XBOX);
		 * c.setValor(50); c.setObservacao("quaddrado"); meusjogos.gravar(c, 2);
		 * 
		 * for (Jogo jogoatual : meusjogos.listartodos()) {
		 * System.out.println(jogoatual.getTitulo());
		 * System.out.println(jogoatual.getConsole());
		 * System.out.println(jogoatual.getValor());
		 * System.out.println(jogoatual.getObservacao());
		 * System.out.println("------------------------");
		 * 
		 * }
		 */

		FrameCadastro frame = new FrameCadastro();
		frame.setVisible(true);
	}
}