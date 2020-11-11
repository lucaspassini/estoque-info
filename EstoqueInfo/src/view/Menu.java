package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Menu - EstoqueInfo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/icons/icons8-empty-box-30.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 640);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setIcon(new ImageIcon(Menu.class.getResource("/icons/icons8-empty-box-90.png")));
		lblIconLogo.setBounds(240, 26, 90, 131);
		contentPane.add(lblIconLogo);
		
		JPanel panelClientes = new JPanel();
		panelClientes.setBorder(new CompoundBorder(new CompoundBorder(), null));
		panelClientes.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelClientes.setName("");
		panelClientes.setBackground(Color.GRAY);
		panelClientes.setBounds(100, 168, 350, 60);
		contentPane.add(panelClientes);
		panelClientes.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRAR CLIENTES");
		lblNewLabel.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setBounds(108, 24, 155, 14);
		panelClientes.add(lblNewLabel);
		
		JPanel panelFornecedores = new JPanel();
		panelFornecedores.setBorder(new CompoundBorder(new CompoundBorder(), null));
		panelFornecedores.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelFornecedores.setBackground(Color.GRAY);
		panelFornecedores.setBounds(100, 237, 350, 60);
		contentPane.add(panelFornecedores);
		panelFornecedores.setLayout(null);
		
		JLabel lblCad = new JLabel("CADASTRAR FORNECEDORES");
		lblCad.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblCad.setForeground(SystemColor.menu);
		lblCad.setBounds(90, 23, 208, 14);
		panelFornecedores.add(lblCad);
		
		JPanel panelProdutos = new JPanel();
		panelProdutos.setBorder(new CompoundBorder(new CompoundBorder(), null));
		panelProdutos.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelProdutos.setBackground(Color.GRAY);
		panelProdutos.setBounds(100, 308, 350, 60);
		contentPane.add(panelProdutos);
		panelProdutos.setLayout(null);
		
		JLabel lblCadastrarProdutos = new JLabel("CADASTRAR PRODUTOS");
		lblCadastrarProdutos.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblCadastrarProdutos.setForeground(SystemColor.menu);
		lblCadastrarProdutos.setBounds(108, 24, 198, 14);
		panelProdutos.add(lblCadastrarProdutos);
		
		JPanel panelCompras = new JPanel();
		panelCompras.setBorder(new CompoundBorder(new CompoundBorder(), null));
		panelCompras.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelCompras.setBackground(Color.GRAY);
		panelCompras.setBounds(100, 379, 350, 60);
		contentPane.add(panelCompras);
		panelCompras.setLayout(null);
		
		JLabel lblCompras = new JLabel("COMPRAS");
		lblCompras.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblCompras.setForeground(SystemColor.menu);
		lblCompras.setBounds(152, 22, 68, 14);
		panelCompras.add(lblCompras);
		
		JPanel panelVendas = new JPanel();
		panelVendas.setBorder(new CompoundBorder(new CompoundBorder(), null));
		panelVendas.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelVendas.setBackground(Color.GRAY);
		panelVendas.setBounds(100, 450, 350, 60);
		contentPane.add(panelVendas);
		panelVendas.setLayout(null);
		
		JLabel lblVendas = new JLabel("VENDAS");
		lblVendas.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblVendas.setForeground(SystemColor.menu);
		lblVendas.setBounds(155, 23, 72, 14);
		panelVendas.add(lblVendas);
		
		JPanel panelSair = new JPanel();
		panelSair.setBorder(new CompoundBorder(new CompoundBorder(), null));
		panelSair.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelSair.setBackground(Color.GRAY);
		panelSair.setBounds(100, 521, 350, 60);
		contentPane.add(panelSair);
		panelSair.setLayout(null);
		
		JLabel lblSair = new JLabel("SAIR");
		lblSair.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblSair.setForeground(SystemColor.menu);
		lblSair.setBounds(166, 23, 44, 14);
		panelSair.add(lblSair);
	}
}
