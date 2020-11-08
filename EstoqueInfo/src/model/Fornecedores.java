package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;

public class Fornecedores extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedores frame = new Fornecedores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fornecedores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fornecedores.class.getResource("/icons/icons8-services-50.png")));
		setTitle("Cadastro de Fornecedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnCdigo = new JTextPane();
		txtpnCdigo.setEditable(false);
		txtpnCdigo.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnCdigo.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnCdigo.setText("C\u00F3digo");
		txtpnCdigo.setBounds(32, 42, 52, 20);
		contentPane.add(txtpnCdigo);
		
		JTextPane txtpnDataDoCadastro = new JTextPane();
		txtpnDataDoCadastro.setEditable(false);
		txtpnDataDoCadastro.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnDataDoCadastro.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnDataDoCadastro.setText("Nome");
		txtpnDataDoCadastro.setBounds(32, 86, 52, 20);
		contentPane.add(txtpnDataDoCadastro);
		
		JTextPane txtpnValorEmAberto = new JTextPane();
		txtpnValorEmAberto.setEditable(false);
		txtpnValorEmAberto.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnValorEmAberto.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnValorEmAberto.setText("CNPJ");
		txtpnValorEmAberto.setBounds(32, 136, 44, 20);
		contentPane.add(txtpnValorEmAberto);
		
		JTextPane txtpnCnpj = new JTextPane();
		txtpnCnpj.setEditable(false);
		txtpnCnpj.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnCnpj.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnCnpj.setText("Valor em Aberto");
		txtpnCnpj.setBounds(209, 42, 119, 20);
		contentPane.add(txtpnCnpj);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setEditable(false);
		txtpnNome.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnNome.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnNome.setText("Data do Cadastro");
		txtpnNome.setBounds(209, 86, 119, 20);
		contentPane.add(txtpnNome);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		btnNewButton.setBounds(29, 202, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		btnNewButton_1.setBounds(289, 202, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(101, 42, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 86, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 136, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(338, 42, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(338, 86, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}

}
