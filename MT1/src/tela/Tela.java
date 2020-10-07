package tela;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela implements ActionListener {

	private JFrame tela;

	private final String TELA_1 = "tela1";
	private final String TELA_2 = "tela2";

	private JLabel jl_titulo;
	private JLabel jl_rodape;

	private JPanel jp_rodape;
	private JPanel jp_cardLayout;

	private JLabel t1_jl_opcao_1;
	private JLabel t1_jl_opcao_2;
	private JLabel t1_jl_opcao_3;

	private JButton t1_jb_opcao_1;
	private JButton t1_jb_opcao_2;
	private JButton t1_jb_opcao_3;

	private JPanel t1_jp_centro;
	private JPanel t1_jp;

	// Tela 2
	private JLabel t2_jl_opcao_1;
	private JLabel t2_jl_opcao_2;
	private JLabel t2_jl_opcao_3;
	private JLabel t2_jl_opcao_4;
	private JLabel t2_jl_opcao_5;
	private JLabel t2_jl_opcao_6;

	private JButton t2_jb_enviar;
	private JButton t2_jb_voltar;

	private JTextField t2_jtf_message;

	private JPanel t2_jp_centro;
	private JPanel t2_jp_rodape;
	private JPanel t2_jp;

	public Tela() {
		criarTela1();
		criarTela2();
		criarTela();
	}

	private void criarTela2() {
		instanciarTela2();
		adiconarTela2();
		darEventoTela2();
	}

	private void darEventoTela2() {
		t2_jb_enviar.addActionListener(this);
		t2_jb_voltar.addActionListener(this);
	}

	private void adiconarTela2() {
		t2_jp.setLayout(new BorderLayout());
		adiconarTela2Centro();
		adiconarTela2Esq();
		adiconarTela2Sul();

	}

	private void adiconarTela2Sul() {
		t2_jp_rodape.setLayout(new FlowLayout(FlowLayout.CENTER));
		t2_jp_rodape.add(t2_jtf_message);
		t2_jp_rodape.add(t2_jb_enviar);
		t2_jp.add(BorderLayout.SOUTH, t2_jp_rodape);
	}

	private void adiconarTela2Esq() {
		t2_jp.add(BorderLayout.WEST, t2_jb_voltar);
	}

	private void adiconarTela2Centro() {

		t2_jp_centro.setLayout(new GridLayout(3, 2));

		t2_jp_centro.add(t2_jl_opcao_1);
		t2_jp_centro.add(t2_jl_opcao_2);
		t2_jp_centro.add(t2_jl_opcao_3);
		t2_jp_centro.add(t2_jl_opcao_4);
		t2_jp_centro.add(t2_jl_opcao_5);
		t2_jp_centro.add(t2_jl_opcao_6);

		t2_jp.add(BorderLayout.CENTER, t2_jp_centro);

	}

	private void instanciarTela2() {
		t2_jl_opcao_1 = new JLabel("Docente: Bom dia Turma");
		t2_jl_opcao_2 = new JLabel("");
		t2_jl_opcao_3 = new JLabel("");
		t2_jl_opcao_4 = new JLabel("Estudante: Bom dia");
		t2_jl_opcao_5 = new JLabel("");
		t2_jl_opcao_6 = new JLabel("Estudante: Qual é a materia do Teste?");

		t2_jb_enviar = new JButton("Enviar");
		t2_jb_voltar = new JButton("Voltar");

		t2_jp_centro = new JPanel();
		t2_jp_rodape = new JPanel();
		t2_jp = new JPanel();

		t2_jtf_message = new JTextField(15);
	}

	private void criarTela() {
		instanciarTela();
		propriedadeTela();
		adiconarTop();
		adiconarSul();
		adicionarCentro();
	}

	private void adicionarCentro() {
		jp_cardLayout.setLayout(new CardLayout());
		jp_cardLayout.add(TELA_1, t1_jp);
		jp_cardLayout.add(TELA_2, t2_jp);
		tela.add(jp_cardLayout);

	}

	private void propriedadeTela() {
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(400, 300);
		tela.setVisible(true);

	}

	private void criarTela1() {
		instanciarTela1();
		adiconarTela1();
		darEventoTela1();
	}

	private void darEventoTela1() {
		t1_jb_opcao_1.addActionListener(this);
		t1_jb_opcao_2.addActionListener(this);
		t1_jb_opcao_3.addActionListener(this);
	}

	private void adiconarTela1() {
		t1_jp.setLayout(new BorderLayout());
		adiconarTela1Centro();

	}

	private void adiconarSul() {
		jp_rodape.setLayout(new FlowLayout(FlowLayout.CENTER));
		jp_rodape.add(jl_rodape);
		tela.add(BorderLayout.SOUTH, jp_rodape);

	}

	private void adiconarTop() {
		tela.add(BorderLayout.NORTH, jl_titulo);
	}

	private void adiconarTela1Centro() {
		t1_jp_centro.setLayout(new GridLayout(3, 2));

		t1_jp_centro.add(t1_jl_opcao_1);
		t1_jp_centro.add(t1_jb_opcao_1);

		t1_jp_centro.add(t1_jl_opcao_2);
		t1_jp_centro.add(t1_jb_opcao_2);

		t1_jp_centro.add(t1_jl_opcao_3);
		t1_jp_centro.add(t1_jb_opcao_3);

		t1_jp.add(BorderLayout.CENTER, t1_jp_centro);
	}

	private void instanciarTela() {
		tela = new JFrame();

		jl_titulo = new JLabel("Whatsapp I22");
		jl_rodape = new JLabel("Projecto do Estudante @Hasler Choo");

		jp_rodape = new JPanel();
		jp_cardLayout = new JPanel();

	}

	private void instanciarTela1() {
		t1_jl_opcao_1 = new JLabel("PROG 3-I22 LEIT 2020");
		t1_jl_opcao_2 = new JLabel("Moz Devz - ISUTC");
		t1_jl_opcao_3 = new JLabel("Software Frustration");

		t1_jb_opcao_1 = new JButton("Ver Messagens");
		t1_jb_opcao_2 = new JButton("Ver Messagens");
		t1_jb_opcao_3 = new JButton("Ver Messagens");

		t1_jp_centro = new JPanel();
		t1_jp = new JPanel();

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		CardLayout card = (CardLayout) jp_cardLayout.getLayout();

		if (evento.getSource().equals(t2_jb_enviar) || evento.getSource().equals(t2_jb_voltar)) {
			card.show(jp_cardLayout, TELA_1);
		} else {
			card.show(jp_cardLayout, TELA_2);

		}

	}

}
