package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Vendas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	final private String host = "localhost";
	final private String user = "root";
	final private String passwd = "";
	
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
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnCdigoDoProduto = new JTextPane();
		txtpnCdigoDoProduto.setEditable(false);
		txtpnCdigoDoProduto.setFont(new Font("Fira Code", txtpnCdigoDoProduto.getFont().getStyle(), txtpnCdigoDoProduto.getFont().getSize()));
		txtpnCdigoDoProduto.setBackground(SystemColor.control);
		txtpnCdigoDoProduto.setText("C\u00F3digo");
		txtpnCdigoDoProduto.setBounds(12, 26, 49, 20);
		contentPane.add(txtpnCdigoDoProduto);
		
		JTextPane txtpnDescri = new JTextPane();
		txtpnDescri.setEditable(false);
		txtpnDescri.setFont(new Font("Fira Code", txtpnDescri.getFont().getStyle(), txtpnDescri.getFont().getSize()));
		txtpnDescri.setBackground(SystemColor.control);
		txtpnDescri.setText("Descrição");
		txtpnDescri.setBounds(20, 77, 126, 20);
		contentPane.add(txtpnDescri);
		
		JTextPane txtpnQuantidade = new JTextPane();
		txtpnQuantidade.setEditable(false);
		txtpnQuantidade.setFont(new Font("Fira Code", txtpnQuantidade.getFont().getStyle(), txtpnQuantidade.getFont().getSize()));
		txtpnQuantidade.setBackground(SystemColor.control);
		txtpnQuantidade.setText("Quantidade");
		txtpnQuantidade.setBounds(20, 121, 115, 20);
		contentPane.add(txtpnQuantidade);
		
		JTextPane txtpnTotal = new JTextPane();
		txtpnTotal.setEditable(false);
		txtpnTotal.setFont(new Font("Fira Code", txtpnTotal.getFont().getStyle(), txtpnTotal.getFont().getSize()));
		txtpnTotal.setBackground(SystemColor.control);
		txtpnTotal.setText("Data Venda");
		txtpnTotal.setBounds(250, 77, 53, 20);
		contentPane.add(txtpnTotal);
		
		JTextPane txtpnDataDaVenda = new JTextPane();
		txtpnDataDaVenda.setEditable(false);
		txtpnDataDaVenda.setFont(new Font("Fira Code", txtpnDataDaVenda.getFont().getStyle(), txtpnDataDaVenda.getFont().getSize()));
		txtpnDataDaVenda.setBackground(SystemColor.control);
		txtpnDataDaVenda.setText("Total");
		txtpnDataDaVenda.setBounds(250, 36, 73, 20);
		contentPane.add(txtpnDataDaVenda);
						
		textField_1 = new JTextField();
		textField_1.setBounds(154, 36, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(11);
		
		textField_2 = new JTextField();
		textField_2.setBounds(154, 77, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(30);
		
		textField_3 = new JTextField();
		textField_3.setBounds(154, 121, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(14);
		
		textField_4 = new JTextField();
		textField_4.setBounds(333, 36, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(14);
		
		textField_5 = new JTextField();
		textField_5.setBounds(333, 77, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		btnNewButton.setBounds(29, 202, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

			try {
				// Setup the connection with the DB
				connect = DriverManager.getConnection("jdbc:mysql://" + host + "/estoqueinfo?" + "user=" + user + "&password=" + passwd);
				statement = connect.createStatement();
							
				statement.executeUpdate("Insert into vendas(nCodProd, cDescProd, nQuant, nTotal, dDataVenda) values('" + textField_1.getText() + "', '" 
					      + textField_2.getText() + "', '" 
					      + textField_3.getText() + "', '" 
					      + textField_4.getText() + "', '" 
					      + textField_5.getText() + "')");
	
				JOptionPane optionPane = new JOptionPane("Cadastro salvo com sucesso!",JOptionPane.WARNING_MESSAGE);
				JDialog dialog = optionPane.createDialog("Atenção");
				dialog.setAlwaysOnTop(true); // to show top of all other application
				dialog.setVisible(true); // to visible the dialog
				
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				textField_5.setText(" ");

				
			}catch(SQLException e){
			System.out.println(e.getMessage());
			}
		
		}
		});
		btnNewButton.setBounds(50, 202, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		btnNewButton_1.setBounds(289, 202, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e){
		        //System.exit(0);
		    	Vendas.this.dispose();		
				Menu frame = new Menu();
			    frame.setVisible(true);
		    }
		});
		
	}

}
