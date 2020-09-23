package layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercicio1 {

	private JButton bt_voltar;
	private JButton bt_proximo;
	private JButton bt_cancelar;

	private JFrame tela;

	public Exercicio1() {
		instancia();
		adionarComponete();
		telaPropriedade();
	}

	private void adionarComponete() {
		tela.add(bt_voltar);
		tela.add(bt_proximo);
		tela.add(bt_cancelar);
	}

	private void instancia() {
		tela = new JFrame("O gerenciamento de flowlayout");
		bt_voltar = new JButton("voltar");
		bt_proximo = new JButton("proximo");
		bt_cancelar = new JButton("cancelar");
	}

	private void telaPropriedade() {
		tela.setSize(300, 200);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		tela.setLayout(new FlowLayout());
	}

}
