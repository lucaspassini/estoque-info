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
import javax.swing.border.MatteBorder;

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
		
		JLabel lblIconEstoqueInfo = new JLabel("");
		lblIconEstoqueInfo.setIcon(new ImageIcon(Menu.class.getResource("/icons/icons8-empty-box-90.png")));
		lblIconEstoqueInfo.setBounds(237, 22, 90, 131);
		contentPane.add(lblIconEstoqueInfo);
		
		JPanel panelClientes = new JPanel();
		panelClientes.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.menu));
		panelClientes.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelClientes.setName("");
		panelClientes.setBackground(Color.GRAY);
		panelClientes.setBounds(100, 171, 350, 60);
		contentPane.add(panelClientes);
		panelClientes.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRAR CLIENTES");
		lblNewLabel.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setBounds(108, 23, 155, 14);
		panelClientes.add(lblNewLabel);
		
		JLabel lblIconClientes = new JLabel("");
		lblIconClientes.setIcon(new ImageIcon(Menu.class.getResource("/icons/icons8-add-user-male-24.png")));
		lblIconClientes.setBounds(10, 11, 37, 38);
		panelClientes.add(lblIconClientes);
		
		JPanel panelFornecedores = new JPanel();
		panelFornecedores.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.menu));
		panelFornecedores.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelFornecedores.setBackground(Color.GRAY);
		panelFornecedores.setBounds(100, 231, 350, 60);
		contentPane.add(panelFornecedores);
		panelFornecedores.setLayout(null);
		
		JLabel lblCad = new JLabel("CADASTRAR FORNECEDORES");
		lblCad.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblCad.setForeground(SystemColor.menu);
		lblCad.setBounds(87, 23, 208, 14);
		panelFornecedores.add(lblCad);
		
		JLabel lblIconFornecedores = new JLabel("");
		lblIconFornecedores.setIcon(new ImageIcon(Menu.class.getResource("/icons/icons8-add-user-male-24.png")));
		lblIconFornecedores.setBounds(10, 11, 37, 38);
		panelFornecedores.add(lblIconFornecedores);
		
		JPanel panelProdutos = new JPanel();
		panelProdutos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.menu));
		panelProdutos.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelProdutos.setBackground(Color.GRAY);
		panelProdutos.setBounds(100, 291, 350, 60);
		contentPane.add(panelProdutos);
		panelProdutos.setLayout(null);
		
		JLabel lblCadastrarProdutos = new JLabel("CADASTRAR PRODUTOS");
		lblCadastrarProdutos.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblCadastrarProdutos.setForeground(SystemColor.menu);
		lblCadastrarProdutos.setBounds(109, 23, 198, 14);
		panelProdutos.add(lblCadastrarProdutos);
		
		JLabel lblIconProdutos = new JLabel("");
		lblIconProdutos.setIcon(new ImageIcon(Menu.class.getResource("/icons/icons8-gear-30.png")));
		lblIconProdutos.setBounds(10, 11, 37, 38);
		panelProdutos.add(lblIconProdutos);
		
		JPanel panelCompras = new JPanel();
		panelCompras.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.menu));
		panelCompras.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelCompras.setBackground(Color.GRAY);
		panelCompras.setBounds(100, 411, 350, 60);
		contentPane.add(panelCompras);
		panelCompras.setLayout(null);
		
		JLabel lblCompras = new JLabel("COMPRAS");
		lblCompras.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblCompras.setForeground(SystemColor.menu);
		lblCompras.setBounds(150, 23, 68, 14);
		panelCompras.add(lblCompras);
		
		JLabel lblIconCompras = new JLabel("");
		lblIconCompras.setIcon(new ImageIcon(Menu.class.getResource("/icons/icons8-buying-30.png")));
		lblIconCompras.setBounds(10, 11, 37, 38);
		panelCompras.add(lblIconCompras);
		
		JPanel panelVendas = new JPanel();
		panelVendas.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.menu));
		panelVendas.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelVendas.setBackground(Color.GRAY);
		panelVendas.setBounds(100, 471, 350, 60);
		contentPane.add(panelVendas);
		panelVendas.setLayout(null);
		
		JLabel lblVendas = new JLabel("VENDAS");
		lblVendas.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblVendas.setForeground(SystemColor.menu);
		lblVendas.setBounds(152, 22, 72, 14);
		panelVendas.add(lblVendas);
		
		JLabel lblIconVendas = new JLabel("");
		lblIconVendas.setIcon(new ImageIcon(Menu.class.getResource("/icons/icons8-sell-stock-30.png")));
		lblIconVendas.setBounds(10, 11, 37, 38);
		panelVendas.add(lblIconVendas);
		
		JPanel panelSair = new JPanel();
		panelSair.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.menu));
		panelSair.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelSair.setBackground(Color.GRAY);
		panelSair.setBounds(100, 531, 350, 60);
		contentPane.add(panelSair);
		panelSair.setLayout(null);
		
		JLabel lblSair = new JLabel("SAIR");
		lblSair.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblSair.setForeground(SystemColor.menu);
		lblSair.setBounds(160, 23, 44, 14);
		panelSair.add(lblSair);
		
		JLabel lblIconSair = new JLabel("");
		lblIconSair.setIcon(new ImageIcon(Menu.class.getResource("/icons/icons8-sign-out-30.png")));
		lblIconSair.setBounds(10, 11, 37, 38);
		panelSair.add(lblIconSair);
		
		JPanel panelEstoques = new JPanel();
		panelEstoques.setLayout(null);
		panelEstoques.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		panelEstoques.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.menu));
		panelEstoques.setBackground(Color.GRAY);
		panelEstoques.setBounds(100, 351, 350, 60);
		contentPane.add(panelEstoques);
		
		JLabel lblEstoques = new JLabel("ESTOQUES");
		lblEstoques.setForeground(SystemColor.menu);
		lblEstoques.setFont(new Font("Fira Code SemiBold", Font.BOLD, 13));
		lblEstoques.setBounds(150, 23, 83, 14);
		panelEstoques.add(lblEstoques);
		
		JLabel lblIconEstoques = new JLabel("");
		lblIconEstoques.setIcon(new ImageIcon(Menu.class.getResource("/icons/icons8-empty-box-30.png")));
		lblIconEstoques.setBounds(10, 11, 37, 38);
		panelEstoques.add(lblIconEstoques);
	}
}
