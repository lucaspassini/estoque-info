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

public class Produtos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produtos frame = new Produtos();
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
	public Produtos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Produtos.class.getResource("/icons/icons8-services-50.png")));
		setTitle("Cadastro de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnCdigo = new JTextPane();
		txtpnCdigo.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnCdigo.setEditable(false);
		txtpnCdigo.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnCdigo.setText("C\u00F3digo");
		txtpnCdigo.setBounds(34, 35, 49, 20);
		contentPane.add(txtpnCdigo);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnNome.setEditable(false);
		txtpnNome.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnNome.setText("Nome");
		txtpnNome.setBounds(34, 80, 40, 20);
		contentPane.add(txtpnNome);
		
		JTextPane txtpnDataDoCadastro = new JTextPane();
		txtpnDataDoCadastro.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnDataDoCadastro.setEditable(false);
		txtpnDataDoCadastro.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnDataDoCadastro.setText("Data do Cadastro");
		txtpnDataDoCadastro.setBounds(34, 136, 131, 20);
		contentPane.add(txtpnDataDoCadastro);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), 11));
		btnNewButton.setBounds(29, 202, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), 11));
		btnNewButton_1.setBounds(289, 202, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(175, 35, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(175, 80, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(175, 136, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}
