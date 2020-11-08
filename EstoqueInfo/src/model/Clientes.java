package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

public class Clientes extends JFrame {

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
					Clientes frame = new Clientes();
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
	public Clientes() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Clientes.class.getResource("/icons/icons8-services-50.png")));
		setTitle("Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnCdiho = new JTextPane();
		txtpnCdiho.setEditable(false);
		txtpnCdiho.setFont(new Font("Fira Code", txtpnCdiho.getFont().getStyle(), txtpnCdiho.getFont().getSize()));
		txtpnCdiho.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnCdiho.setBounds(5, 26, 50, 20);
		txtpnCdiho.setText("C\u00F3digo");
		contentPane.add(txtpnCdiho);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setEditable(false);
		txtpnNome.setFont(new Font("Fira Code", txtpnCdiho.getFont().getStyle(), txtpnCdiho.getFont().getSize()));
		txtpnNome.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnNome.setText("Nome");
		txtpnNome.setBounds(5, 66, 40, 20);
		contentPane.add(txtpnNome);
		
		JTextPane txtpnCnpj = new JTextPane();
		txtpnCnpj.setEditable(false);
		txtpnCnpj.setFont(new Font("Fira Code", txtpnCdiho.getFont().getStyle(), txtpnCdiho.getFont().getSize()));
		txtpnCnpj.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnCnpj.setText("CNPJ");
		txtpnCnpj.setBounds(5, 104, 35, 20);
		contentPane.add(txtpnCnpj);
		
		JTextPane txtpnValor = new JTextPane();
		txtpnValor.setEditable(false);
		txtpnValor.setFont(new Font("Fira Code", txtpnCdiho.getFont().getStyle(), txtpnCdiho.getFont().getSize()));
		txtpnValor.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnValor.setText("Valor em Aberto");
		txtpnValor.setBounds(201, 26, 116, 20);
		contentPane.add(txtpnValor);
		
		JTextPane txtpnData = new JTextPane();
		txtpnData.setEditable(false);
		txtpnData.setFont(new Font("Fira Code", txtpnCdiho.getFont().getStyle(), txtpnCdiho.getFont().getSize()));
		txtpnData.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnData.setText("Data do Cadastro");
		txtpnData.setBounds(201, 57, 126, 20);
		contentPane.add(txtpnData);
		
		textField = new JTextField();
		textField.setBounds(55, 26, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(55, 66, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(55, 104, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(327, 26, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(327, 57, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(50, 202, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(289, 202, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
