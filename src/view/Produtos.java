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

public class Produtos extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	
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
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setFont(new Font("Fira Code", txtpnNome.getFont().getStyle(), txtpnNome.getFont().getSize()));
		txtpnNome.setEditable(false);
		txtpnNome.setBackground(SystemColor.control);
		txtpnNome.setText("Nome");
		txtpnNome.setBounds(34, 80, 40, 20);
		contentPane.add(txtpnNome);
		
		JTextPane txtpnDataDoCadastro = new JTextPane();
		txtpnDataDoCadastro.setFont(new Font("Fira Code", txtpnDataDoCadastro.getFont().getStyle(), txtpnDataDoCadastro.getFont().getSize()));
		txtpnDataDoCadastro.setEditable(false);
		txtpnDataDoCadastro.setBackground(SystemColor.control);
		txtpnDataDoCadastro.setText("Data do Cadastro");
		txtpnDataDoCadastro.setBounds(34, 136, 131, 20);
		contentPane.add(txtpnDataDoCadastro);
		
			
		textField_1 = new JTextField();
		textField_1.setBounds(175, 80, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(30);
		
		textField_2 = new JTextField();
		textField_2.setBounds(175, 136, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
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
							
				statement.executeUpdate("Insert into produtos(cNomeProd,dDataCad) values('" + textField_1.getText() + "', '" 
	                    														   	        + textField_2.getText() + "')");
				

				JOptionPane optionPane = new JOptionPane("Cadastro salvo com sucesso!",JOptionPane.WARNING_MESSAGE);
				JDialog dialog = optionPane.createDialog("Aten��o");
				dialog.setAlwaysOnTop(true); // to show top of all other application
				dialog.setVisible(true); // to visible the dialog
				
				textField_1.setText(" ");
				textField_2.setText(" ");
				
				
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
		    	Produtos.this.dispose();		
				Menu frame = new Menu();
			    frame.setVisible(true);
		    }
		});
						
	}
}
		
		
