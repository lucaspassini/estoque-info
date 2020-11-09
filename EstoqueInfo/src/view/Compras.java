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
import java.awt.Font;
import java.awt.Toolkit;

public class Compras extends JFrame {

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
					Compras frame = new Compras();
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
	public Compras() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Compras.class.getResource("/icons/icons8-services-50.png")));
		setTitle("Cadastro de Compras");
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
		txtpnCdigo.setBounds(12, 26, 49, 20);
		contentPane.add(txtpnCdigo);
		
		JTextPane txtpnCdigoDoProduto = new JTextPane();
		txtpnCdigoDoProduto.setEditable(false);
		txtpnCdigoDoProduto.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnCdigoDoProduto.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnCdigoDoProduto.setText("C\u00F3digo do Produto");
		txtpnCdigoDoProduto.setBounds(12, 67, 140, 20);
		contentPane.add(txtpnCdigoDoProduto);
		
		JTextPane txtpnDataDaCompra = new JTextPane();
		txtpnDataDaCompra.setEditable(false);
		txtpnDataDaCompra.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnDataDaCompra.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnDataDaCompra.setText("Data da Compra");
		txtpnDataDaCompra.setBounds(12, 108, 106, 20);
		contentPane.add(txtpnDataDaCompra);
		
		JTextPane txtpnQuantidade = new JTextPane();
		txtpnQuantidade.setEditable(false);
		txtpnQuantidade.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnQuantidade.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnQuantidade.setText("Quantidade ");
		txtpnQuantidade.setBounds(258, 26, 80, 20);
		contentPane.add(txtpnQuantidade);
		
		JTextPane txtpnTotal = new JTextPane();
		txtpnTotal.setEditable(false);
		txtpnTotal.setFont(new Font("Fira Code", txtpnCdigo.getFont().getStyle(), txtpnCdigo.getFont().getSize()));
		txtpnTotal.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnTotal.setText("Total");
		txtpnTotal.setBounds(258, 67, 49, 20);
		contentPane.add(txtpnTotal);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Fira Code Medium", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		btnNewButton.setBounds(29, 202, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setFont(new Font("Fira Code Medium", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		btnNewButton_1.setBounds(289, 202, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(162, 26, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 67, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(162, 108, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(338, 26, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(338, 67, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}

}
