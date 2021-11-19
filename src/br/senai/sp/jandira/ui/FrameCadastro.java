package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Window.Type;

public class FrameCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textTitulo;
	private JTextField textValor;

	
	

	
	public FrameCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 460);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Titulo do Jogo :");
		lblTitulo.setBounds(10, 91, 89, 14);
		contentPane.add(lblTitulo);
		
		textTitulo = new JTextField();
		textTitulo.setBounds(97, 88, 180, 20);
		contentPane.add(textTitulo);
		textTitulo.setColumns(10);
		
		JLabel lblFbricante = new JLabel("Fabricante :");
		lblFbricante.setBounds(207, 128, 70, 14);
		contentPane.add(lblFbricante);
		
		JCheckBox chckbxZerado = new JCheckBox("zerado");
		chckbxZerado.setBackground(Color.WHITE);
		chckbxZerado.setBounds(97, 163, 107, 23);
		contentPane.add(chckbxZerado);
		
		JLabel lblConsole = new JLabel("Console :");
		lblConsole.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblConsole.setBounds(17, 128, 58, 14);
		contentPane.add(lblConsole);
		
		JComboBox combofabricante = new JComboBox();
		combofabricante.setBounds(287, 124, 107, 22);
		contentPane.add(combofabricante);
		
		JComboBox comboconsole = new JComboBox();
		comboconsole.setBounds(97, 124, 107, 22);
		contentPane.add(comboconsole);
		
		JLabel lblNewLabel = new JLabel("Valor estimado : ");
		lblNewLabel.setBounds(0, 196, 99, 14);
		contentPane.add(lblNewLabel);
		
		textValor = new JTextField();
		textValor.setToolTipText("");
		textValor.setBounds(97, 193, 107, 20);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		JLabel lbllistajogos = new JLabel("Meus Jogos");
		lbllistajogos.setIcon(new ImageIcon(FrameCadastro.class.getResource("/br/senai/sp/jandira/img/outline_sports_esports_black_24dp.png")));
		lbllistajogos.setBounds(407, 27, 107, 14);
		contentPane.add(lbllistajogos);
		
		JList list = new JList();
		list.setBounds(403, 52, 222, 347);
		contentPane.add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(403, 52, 222, 347);
		contentPane.add(scrollPane);
		
		JButton btnsalvar = new JButton("Salvar");
		btnsalvar.setIcon(new ImageIcon(FrameCadastro.class.getResource("/br/senai/sp/jandira/img/outline_save_alt_black_24dp.png")));
		btnsalvar.setBackground(Color.CYAN);
		btnsalvar.setBounds(94, 221, 127, 30);
		contentPane.add(btnsalvar);
		
		JList list_1 = new JList();
		list_1.setBounds(10, 283, 386, 116);
		contentPane.add(list_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 283, 386, 116);
		contentPane.add(scrollPane_1);
		
		JButton btnparacima = new JButton("");
		btnparacima.setBackground(Color.CYAN);
		btnparacima.setIcon(new ImageIcon(FrameCadastro.class.getResource("/br/senai/sp/jandira/img/outline_keyboard_arrow_up_black_24dp.png")));
		btnparacima.setBounds(330, 221, 64, 23);
		contentPane.add(btnparacima);
		
		JButton btnparabaixo = new JButton("");
		btnparabaixo.setBackground(Color.CYAN);
		btnparabaixo.setIcon(new ImageIcon(FrameCadastro.class.getResource("/br/senai/sp/jandira/img/outline_keyboard_arrow_down_black_24dp.png")));
		btnparabaixo.setBounds(330, 249, 64, 23);
		contentPane.add(btnparabaixo);
		
		JTextPane txtpnSeiLa = new JTextPane();
		txtpnSeiLa.setEditable(false);
		txtpnSeiLa.setForeground(new Color(0, 191, 255));
		txtpnSeiLa.setFont(new Font("Tahoma", Font.PLAIN, 45));
		txtpnSeiLa.setDropMode(DropMode.INSERT);
		txtpnSeiLa.setBackground(SystemColor.inactiveCaption);
		txtpnSeiLa.setText("JOGOS");
		txtpnSeiLa.setBounds(124, 11, 153, 61);
		contentPane.add(txtpnSeiLa);
		
		JLabel lblNewLabel_1 = new JLabel("Observa\u00E7\u00E3o :");
		lblNewLabel_1.setBounds(17, 262, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		
		
	}
}
