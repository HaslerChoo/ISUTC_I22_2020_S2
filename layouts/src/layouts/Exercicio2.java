package layouts;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exercicio2 {
	private JButton [] bt;

	private JFrame tela;

	public Exercicio2() {
		instancia();
		adionarComponete();
		telaPropriedade();
	}

	private void adionarComponete() {
		for (int i = 0; i < bt.length; i++) {
			tela.add(bt[i]);
		}
		
	}

	private void instancia() {
		tela = new JFrame("O gerenciamento de Gridlayout");
		bt = new JButton[12];
		
		for (int i = 0; i < bt.length; i++) {
			bt[i]= new JButton("Button "+(i+1));
		}
	}

	private void telaPropriedade() {
		tela.setSize(300, 200);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		tela.setLayout(new GridLayout(4,3,5,5));
	}
}
