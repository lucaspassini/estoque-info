package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Toolkit;

public class Estoques extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estoques frame = new Estoques();
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
	public Estoques() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Estoques.class.getResource("/icons/icons8-services-50.png")));
		setFont(null);
		setTitle("Cadastro do Estoque");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Fira Code", contentPane.getFont().getStyle(), contentPane.getFont().getSize()));
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnCdigo = new JTextPane();
		txtpnCdigo.setEditable(false);
		txtpnCdigo.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnCdigo.setBackground(SystemColor.control);
		txtpnCdigo.setText("C\u00F3digo");
		txtpnCdigo.setBounds(28, 41, 53, 20);
		contentPane.add(txtpnCdigo);
		
		JTextPane txtpnSaldo = new JTextPane();
		txtpnSaldo.setEditable(false);
		txtpnSaldo.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnSaldo.setBackground(SystemColor.control);
		txtpnSaldo.setText("Saldo");
		txtpnSaldo.setBounds(28, 83, 53, 20);
		contentPane.add(txtpnSaldo);
		
		textField = new JTextField();
		textField.setBounds(107, 41, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 83, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), 11));
		btnNewButton.setBounds(29, 202, 95, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), 11));
		btnNewButton_1.setBounds(289, 202, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
