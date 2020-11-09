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
	private JPanel panel_2;
	private JLabel lblIconGear;
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
		setTitle("EstoqueInfo");
		setFont(null);
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/icons/icons8-services-50.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new CompoundBorder());
		panel.setBounds(112, 130, 225, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
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
		txtUser.setBounds(10, 5, 160, 21);
		txtUser.setFont(new Font("Fira Code", txtUser.getFont().getStyle(), txtUser.getFont().getSize()));
		txtUser.setText("Usu\u00E1rio");
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		lblIconUsername = new JLabel("New label");
		lblIconUsername.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8-person-30.png")));
		lblIconUsername.setBounds(190, 2, 30, 27);
		panel.add(lblIconUsername);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new CompoundBorder());
		panel_1.setBounds(112, 166, 225, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
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
		pwdPassword.setBounds(10, 5, 160, 21);
		panel_1.add(pwdPassword);
		
		lblIconPassword = new JLabel("New label");
		lblIconPassword.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8-password-30.png")));
		lblIconPassword.setBounds(190, 2, 30, 27);
		panel_1.add(lblIconPassword);
		
		panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
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
		panel_2.setBorder(new CompoundBorder());
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(112, 226, 225, 43);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Fira Code Medium", lblLogin.getFont().getStyle(), 13));
		lblLogin.setBounds(99, 13, 40, 21);
		panel_2.add(lblLogin);
		
		lblIconLogin = new JLabel("");
		lblIconLogin.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8-login-30.png")));
		lblIconLogin.setBounds(45, 10, 35, 24);
		panel_2.add(lblIconLogin);
		
		lblIconGear = new JLabel("");
		lblIconGear.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8-services-50.png")));
		lblIconGear.setBounds(205, 41, 65, 78);
		contentPane.add(lblIconGear);
		
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
		lblIconX.setBounds(420, 0, 30, 43);
		contentPane.add(lblIconX);
		
		lblIconSignup = new JLabel("");
		lblIconSignup.setIcon(new ImageIcon(Login.class.getResource("/icons/icons8-add-user-male-24.png")));
		lblIconSignup.setBounds(382, 240, 30, 22);
		contentPane.add(lblIconSignup);
		
		lblLoginMessage = new JLabel("");
		
		lblLoginMessage.setFont(new Font("Fira Code Light", lblLoginMessage.getFont().getStyle(), 10));
		lblLoginMessage.setBounds(122, 207, 215, 14);
		contentPane.add(lblLoginMessage);
	}
}
