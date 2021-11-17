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

public class FrameCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textTitulo;
	private JTextField textField;

	
	

	
	public FrameCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Titulo do Jogo :");
		lblTitulo.setBounds(35, 27, 77, 14);
		contentPane.add(lblTitulo);
		
		textTitulo = new JTextField();
		textTitulo.setHorizontalAlignment(SwingConstants.TRAILING);
		textTitulo.setBounds(122, 24, 107, 20);
		contentPane.add(textTitulo);
		textTitulo.setColumns(10);
		
		JLabel lblFbricante = new JLabel("Fabricante :");
		lblFbricante.setBounds(54, 52, 58, 14);
		contentPane.add(lblFbricante);
		
		JCheckBox chckbxZerado = new JCheckBox("zerado");
		chckbxZerado.setBackground(Color.WHITE);
		chckbxZerado.setBounds(122, 76, 107, 23);
		contentPane.add(chckbxZerado);
		
		JLabel lblConsole = new JLabel("Console :");
		lblConsole.setBounds(54, 121, 46, 14);
		contentPane.add(lblConsole);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(122, 117, 107, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(122, 48, 107, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Valor estimado : ");
		lblNewLabel.setBounds(35, 160, 89, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(122, 157, 107, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
