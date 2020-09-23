package accao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Accao implements ActionListener{
	private JFrame tela;
	private JButton jb;

	public Accao() {
		instancia();
		 darAccao();
		telaPropriedade();
		adionarComponete();
	}

	private void adionarComponete() {
		tela.add(jb);
	}

	private void darAccao() {
		jb.addActionListener(this);
	}

	private void instancia() {
		tela = new JFrame();
		jb = new JButton("Dar Accao");
	}

	private void telaPropriedade() {
		tela.setSize(300, 200);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		// tela.setLayout(new BorderLayout());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Acao");
	}
}
