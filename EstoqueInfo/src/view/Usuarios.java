package view;

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

public class Usuarios extends JFrame {

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
					Usuarios frame = new Usuarios();
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
	public Usuarios() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Usuarios.class.getResource("/icons/icons8-services-50.png")));
		setTitle("Cadastro de Usu\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnCdigo = new JTextPane();
		txtpnCdigo.setEditable(false);
		txtpnCdigo.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnCdigo.setBackground(SystemColor.control);
		txtpnCdigo.setText("C\u00F3digo");
		txtpnCdigo.setBounds(37, 45, 54, 20);
		contentPane.add(txtpnCdigo);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setEditable(false);
		txtpnNome.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnNome.setBackground(SystemColor.control);
		txtpnNome.setText("Nome");
		txtpnNome.setBounds(37, 94, 54, 20);
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
		textField.setBounds(101, 45, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 94, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane txtpnSenha = new JTextPane();
		txtpnSenha.setEditable(false);
		txtpnSenha.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnSenha.setBackground(SystemColor.control);
		txtpnSenha.setText("Senha");
		txtpnSenha.setBounds(37, 137, 54, 20);
		contentPane.add(txtpnSenha);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(101, 137, 86, 20);
		contentPane.add(textField_2);
	}

}
