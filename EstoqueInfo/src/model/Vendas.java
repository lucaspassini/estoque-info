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
import java.awt.Font;
import java.awt.Toolkit;

public class Vendas extends JFrame {

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
					Vendas frame = new Vendas();
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
	public Vendas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vendas.class.getResource("/icons/icons8-services-50.png")));
		setTitle("Cadastro de Vendas");
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
		txtpnCdigo.setBounds(20, 36, 53, 20);
		contentPane.add(txtpnCdigo);
		
		JTextPane txtpnCdigoDoProduto = new JTextPane();
		txtpnCdigoDoProduto.setEditable(false);
		txtpnCdigoDoProduto.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnCdigoDoProduto.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnCdigoDoProduto.setText("C\u00F3digo do Produto");
		txtpnCdigoDoProduto.setBounds(20, 77, 126, 20);
		contentPane.add(txtpnCdigoDoProduto);
		
		JTextPane txtpnDataDaVenda = new JTextPane();
		txtpnDataDaVenda.setEditable(false);
		txtpnDataDaVenda.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnDataDaVenda.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnDataDaVenda.setText("Data da Venda");
		txtpnDataDaVenda.setBounds(20, 121, 115, 20);
		contentPane.add(txtpnDataDaVenda);
		
		JTextPane txtpnQuantidade = new JTextPane();
		txtpnQuantidade.setEditable(false);
		txtpnQuantidade.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnQuantidade.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnQuantidade.setText("Quantidade");
		txtpnQuantidade.setBounds(250, 36, 73, 20);
		contentPane.add(txtpnQuantidade);
		
		JTextPane txtpnTotal = new JTextPane();
		txtpnTotal.setEditable(false);
		txtpnTotal.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnTotal.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnTotal.setText("Total");
		txtpnTotal.setBounds(250, 77, 53, 20);
		contentPane.add(txtpnTotal);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		btnNewButton.setBounds(29, 202, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		btnNewButton_1.setBounds(289, 202, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(154, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 77, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(154, 121, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(333, 36, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(333, 77, 86, 20);
		contentPane.add(textField_4);
	}

}
