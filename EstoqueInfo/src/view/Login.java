package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.border.CompoundBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField pwdPassword;
	private JPanel panelLogin;
	private JLabel lblIconEstoqueInfo;
	private JLabel lblIconUsername;
	private JLabel lblIconPassword;
	private JLabel lblIconLogin;
	private JLabel lblIconX;
	private JLabel lblIconSignup;
	private JLabel lblLoginMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login - EstoqueInfo");
		setFont(null);
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/icons/icons8-empty-box-30.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 440);
		contentPane = new JPanel();
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelUsuario = new JPanel();
		panelUsuario.setBackground(Color.WHITE);
		panelUsuario.setBorder(new CompoundBorder());
		panelUsuario.setBounds(142, 207, 225, 35);
		contentPane.add(panelUsuario);
		panelUsuario.setLayout(null);
		
		txtUser = new JTextField();
		txtUser.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(txtUser.getText().equals("Usuário")) {
					txtUser.setText("");
				}
				else {
					txtUser.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if(txtUser.getText().equals("")) {
					txtUser.setText("Usuário");
				}
			}
		});
		txtUser.setBorder(null);
		txtUser.setBounds(45, 5, 160, 25);
		txtUser.setFont(new Font("Fira Code", txtUser.getFont().getStyle(), txtUser.getFont().getSize()));
		txtUser.setText("Usu\u00E1rio");
		panelUsuario.add(txtUser);
		txtUser.setColumns(10);
		
		lblIconUsername = new JLabel("New label");
		lblIconUsername.setBounds(6, 5, 30, 27);
		panelUsuario.add(lblIconUsername);
		lblIconUsername.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8-person-30.png")));
		
		JPanel panelSenha = new JPanel();
		panelSenha.setBackground(Color.WHITE);
		panelSenha.setBorder(new CompoundBorder());
		panelSenha.setBounds(142, 250, 225, 35);
		contentPane.add(panelSenha);
		panelSenha.setLayout(null);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(pwdPassword.getText().equals("Senha")) {
					pwdPassword.setEchoChar('●');
					  pwdPassword.setText("");
				}
				else {
					pwdPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if(pwdPassword.getText().equals("")) {
					pwdPassword.setText("Senha");
					pwdPassword.setEchoChar((char)0);
				}
			}
		});
		pwdPassword.setBorder(null);
		pwdPassword.setEchoChar((char)0);
		pwdPassword.setText("Senha\r\n");
		pwdPassword.setFont(new Font("Fira Code", pwdPassword.getFont().getStyle(), pwdPassword.getFont().getSize()));
		pwdPassword.setBounds(45, 5, 160, 25);
		panelSenha.add(pwdPassword);
		
		lblIconPassword = new JLabel("New label");
		lblIconPassword.setBounds(6, 5, 30, 27);
		panelSenha.add(lblIconPassword);
		lblIconPassword.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8-password-30.png")));
		
		panelLogin = new JPanel();
		panelLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
					if(txtUser.getText().equals("admin") &&  pwdPassword.getText().equals("admin123")) {
						//if user inputs are correct
					}
					else if(txtUser.getText().equals("") || txtUser.getText().equals("Usuário") || 
						pwdPassword.getText().equals("") || pwdPassword.getText().equals("Senha")) {
						lblLoginMessage.setText("Por favor preencha todos os campos.");
			} else {
				lblLoginMessage.setText("Usuário e senha inválidos.");
			}
				}
			}
		);
		panelLogin.setBorder(new CompoundBorder());
		panelLogin.setBackground(Color.GRAY);
		panelLogin.setBounds(142, 324, 225, 43);
		contentPane.add(panelLogin);
		panelLogin.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Fira Code SemiBold", lblLogin.getFont().getStyle(), 13));
		lblLogin.setBounds(96, 13, 55, 21);
		panelLogin.add(lblLogin);
		
		lblIconLogin = new JLabel("");
		lblIconLogin.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8-login-30.png")));
		lblIconLogin.setBounds(10, 10, 35, 24);
		panelLogin.add(lblIconLogin);
		
		lblIconEstoqueInfo = new JLabel("");
		lblIconEstoqueInfo.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8-empty-box-90.png")));
		lblIconEstoqueInfo.setBounds(216, 82, 95, 78);
		contentPane.add(lblIconEstoqueInfo);
		
		lblIconX = new JLabel("X");
		lblIconX.setFont(new Font("Fira Code SemiBold", lblIconX.getFont().getStyle(), 13));
		lblIconX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Sair do aplicativo?", "Confirmar", JOptionPane.YES_NO_OPTION) == 0) {
				Login.this.dispose();				
				}
			}
		
		@Override
		public void mouseEntered(MouseEvent arg0) {
			lblIconX.setForeground(Color.RED);
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			lblIconX.setForeground(Color.BLACK);
		}
		
		});
		lblIconX.setForeground(Color.BLACK);
		lblIconX.setIcon(null);
		lblIconX.setBounds(490, -5, 30, 43);
		contentPane.add(lblIconX);
		
		lblIconSignup = new JLabel("");
		lblIconSignup.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8-add-user-male-24.png")));
		lblIconSignup.setBounds(427, 330, 30, 31);
		contentPane.add(lblIconSignup);
		
		lblLoginMessage = new JLabel("");
		
		lblLoginMessage.setFont(new Font("Fira Code Light", lblLoginMessage.getFont().getStyle(), 10));
		lblLoginMessage.setBounds(142, 299, 225, 14);
		contentPane.add(lblLoginMessage);
	}
}
