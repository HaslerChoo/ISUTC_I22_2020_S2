package layouts;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploCard implements ActionListener {

	private JPanel jp_card;

	// tela superior
	private JPanel jp_panel_superior;
	private JButton bt_panel1;
	private JButton bt_panel2;
	private JButton bt_panel3;

	// tela1
	private JLabel jl_tela1;
	private JPanel jp_panel1;

	// tela2
	private JButton jb_tela2;
	private JPanel jp_panel2;

	// tela3
	private JTextField jtf_tela3;
	private JPanel jp_panel3;

	private JFrame tela;

	public ExemploCard() {
		instancia();
		darAccao();
		telaPropriedade();
		adionarComponete();
	}

	// inicio instancias
	private void instancia() {
		tela = new JFrame();
		jp_card = new JPanel();

		instanciaTelaSuperior();
		instanciaTela1();
		instanciaTela2();
		instanciaTela3();
	}

	private void instanciaTelaSuperior() {
		jp_panel_superior = new JPanel();
		bt_panel1 = new JButton("Panel 1");
		bt_panel2 = new JButton("Panel 2");
		bt_panel3 = new JButton("Panel 3");
	}

	private void instanciaTela1() {
		jp_panel1 = new JPanel();
		jl_tela1 = new JLabel("Esta e' a janela da tela 1");
	}

	private void instanciaTela2() {
		jp_panel2 = new JPanel();
		jb_tela2 = new JButton("Esta e' a janela da tela 2");
	}

	private void instanciaTela3() {
		jp_panel3 = new JPanel();
		jtf_tela3 = new JTextField(24);
	}

	// fim instancias

	// inicio adicionar elementos na tela

	private void adionarComponete() {
		jp_card.setLayout(new CardLayout());
		adionarComponetePanelSuperior();
		adionarComponeteTela1();
		adionarComponeteTela2();
		adionarComponeteTela3();
		tela.add(jp_card);
	}

	private void adionarComponetePanelSuperior() {
		jp_panel_superior.setLayout(new GridLayout());
		jp_panel_superior.add(bt_panel1);
		jp_panel_superior.add(bt_panel2);
		jp_panel_superior.add(bt_panel3);
		tela.add(BorderLayout.NORTH, jp_panel_superior);
	}

	private void adionarComponeteTela1() {
		jp_panel1.setLayout(new FlowLayout(FlowLayout.RIGHT, 70, 10));
		jp_panel1.add(jl_tela1);
		jp_card.add("tela1", jp_panel1);
	}

	private void adionarComponeteTela2() {
		jp_panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 70, 10));
		jp_panel2.add(jb_tela2);
		jp_card.add("tela2", jp_panel2);
	}

	private void adionarComponeteTela3() {
		jp_panel3.setLayout(new FlowLayout(FlowLayout.RIGHT, 70, 10));
		jp_panel3.add(jtf_tela3);
		jp_card.add("tela3", jp_panel3);
	}
	// fim adicionar elementos na tela

	// inicio propriedades da tela
	private void telaPropriedade() {
		tela.setSize(300, 200);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		tela.setLayout(new BorderLayout());
	}
	// fim propriedades da tela

	// accoes

	private void darAccao() {
		bt_panel1.addActionListener(this);
		bt_panel2.addActionListener(this);
		bt_panel3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cardLayout = (CardLayout) jp_card.getLayout();

		if (bt_panel1 == e.getSource()) {
			cardLayout.show(jp_card, "tela1");
		} else if (bt_panel2 == e.getSource()) {
			cardLayout.show(jp_card, "tela2");

		} else {
			cardLayout.show(jp_card, "tela3");
		}

	}

}
