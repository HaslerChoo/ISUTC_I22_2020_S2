package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercicio7 {

	private JButton[] bts;
	private String[] areas;
	private JFrame tela;

	// tela 1
	private JLabel jl_centro;
	private JPanel jp_panel1;

	public Exercicio7() {
		instancia();
		telaPropriedade();
		 adionarComponetePanel1();
		adionarComponete();
	}
	
	private void adionarComponetePanel1(){
		jp_panel1.add(jl_centro);
	}


	private void adionarComponete() {

		for (int i = 0; i < bts.length; i++) {
			tela.add(areas[i], bts[i]);
		}
		tela.add(BorderLayout.CENTER, jp_panel1);
	}

	private void instancia() {
		bts = new JButton[4];
		areas = new String[] { BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST };
		tela = new JFrame("Card Layout");
		for (int i = 0; i < bts.length; i++) {
			bts[i] = new JButton("Button " + (i + 1));
		}

		// tela 1
		jl_centro = new JLabel("LABEL");
		jp_panel1 = new JPanel();
	}

	private void telaPropriedade() {
		tela.setSize(300, 200);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		tela.setLayout(new BorderLayout());
		
		jp_panel1.setLayout(new FlowLayout());
	}
}
