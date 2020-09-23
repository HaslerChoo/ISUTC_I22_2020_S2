package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exemplo {
	private JButton bt_cima;
	private JButton bt_baixo;
	private JButton bt_esq;
	private JButton bt_dir;
	private JButton bt_centro;

	private JFrame tela;

	public Exemplo() {
		instancia();
		adionarComponete();
		telaPropriedade();
	}

	private void adionarComponete() {
		tela.add(BorderLayout.NORTH,bt_cima);
		tela.add(BorderLayout.SOUTH,bt_baixo);
		tela.add(BorderLayout.WEST,bt_esq);
		tela.add(BorderLayout.EAST,bt_dir);
		tela.add(BorderLayout.CENTER,bt_centro);
	}

	private void instancia() {
		tela = new JFrame("O gerenciamento de flowlayout");
		bt_cima = new JButton("cima");
		bt_baixo = new JButton("Baixo");
		bt_esq = new JButton("esq");
		bt_dir = new JButton("dir");
		bt_centro  = new JButton("centro");
	}

	private void telaPropriedade() {
		tela.setSize(300, 200);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		tela.setLayout(new BorderLayout());
	}
}
