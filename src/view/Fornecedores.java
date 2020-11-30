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
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Font;

public class Fornecedores extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
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
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnCdiho = new JTextPane();
		txtpnCdiho.setEditable(false);
		txtpnCdiho.setFont(new Font("Fira Code", txtpnCdiho.getFont().getStyle(), txtpnCdiho.getFont().getSize()));
		txtpnCdiho.setBackground(SystemColor.control);
		txtpnCdiho.setBounds(32, 42, 50, 20);
		txtpnCdiho.setText("C\u00F3digo");
		contentPane.add(txtpnCdiho);
	
		JTextPane txtpnDataDoCadastro = new JTextPane();
		txtpnDataDoCadastro.setEditable(false);
		txtpnDataDoCadastro.setFont(new Font("Fira Code", txtpnDataDoCadastro.getFont().getStyle(), txtpnDataDoCadastro.getFont().getSize()));
		txtpnDataDoCadastro.setBackground(SystemColor.control);
		txtpnDataDoCadastro.setText("Nome");
		txtpnDataDoCadastro.setBounds(32, 86, 52, 20);
		contentPane.add(txtpnDataDoCadastro);
		
		JTextPane txtpnValorEmAberto = new JTextPane();
		txtpnValorEmAberto.setEditable(false);
		txtpnValorEmAberto.setFont(new Font("Fira Code", txtpnValorEmAberto.getFont().getStyle(), txtpnValorEmAberto.getFont().getSize()));
		txtpnValorEmAberto.setBackground(SystemColor.control);
		txtpnValorEmAberto.setText("CNPJ");
		txtpnValorEmAberto.setBounds(32, 136, 44, 20);
		contentPane.add(txtpnValorEmAberto);
		
		JTextPane txtpnCnpj = new JTextPane();
		txtpnCnpj.setEditable(false);
		txtpnCnpj.setFont(new Font("Fira Code", txtpnCnpj.getFont().getStyle(), txtpnCnpj.getFont().getSize()));
		txtpnCnpj.setBackground(SystemColor.control);
		txtpnCnpj.setText("Valor em Aberto");
		txtpnCnpj.setBounds(209, 42, 119, 20);
		contentPane.add(txtpnCnpj);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setEditable(false);
		txtpnNome.setFont(new Font("Fira Code", txtpnNome.getFont().getStyle(), txtpnNome.getFont().getSize()));
		txtpnNome.setBackground(SystemColor.control);
		txtpnNome.setText("Data do Cadastro");
		txtpnNome.setBounds(209, 86, 119, 20);
		contentPane.add(txtpnNome);
		
		textField = new JTextField();
		textField.setBounds(100, 42, 86, 20);
		contentPane.add(textField);
		textField.setColumns(11);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 86, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(30);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 136, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(11);
		
		textField_3 = new JTextField();
		textField_3.setBounds(338, 42, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(338, 86, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Fira Code SemiBold", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		//btnNewButton.setBounds(29, 202, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				
			try {
				
				// Setup the connection with the DB
				connect = DriverManager.getConnection("jdbc:mysql://" + host + "/estoqueinfo?" + "user=" + user + "&password=" + passwd);
				statement = connect.createStatement();
		
				statement.executeUpdate("Insert into fornecedores(cNome,cCNPJ,nValor,dDataCad) values('" + textField_1.getText() + "', '" 
				                                                                                     + textField_2.getText() + "', '" 
				                                                                                     + textField_3.getText() + "', '" 
				                                                                                     + textField_4.getText() + "')");
				
				JOptionPane optionPane = new JOptionPane("Cadastro salvo com sucesso!",JOptionPane.WARNING_MESSAGE);
				JDialog dialog = optionPane.createDialog("Atenção");
				dialog.setAlwaysOnTop(true); // to show top of all other application
				dialog.setVisible(true); // to visible the dialog
				
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				
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
		       // System.exit(0);
		    	Fornecedores.this.dispose();		
				Menu frame = new Menu();
			    frame.setVisible(true);
		    }
		});
	
					
	}

}
