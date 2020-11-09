package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

import com.sun.glass.events.KeyEvent;
import com.sun.glass.events.WindowEvent;
import java.awt.Toolkit;
import java.awt.Font;

public class Menu {
	private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel; 

	   public Menu(){
	      prepareGUI();
	   }
	   public static void main(String[] args){
	      Menu  menu = new Menu();     
	      menu.showMenu();
	   }
	   private void prepareGUI(){
	      mainFrame = new JFrame("EstoqueInfo");
	      mainFrame.setFont(null);
	      mainFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/icons/icons8-services-50.png")));
	      mainFrame.setSize(946,757);
	      mainFrame.getContentPane().setLayout(new GridLayout(3, 1));

	      //headerLabel = new JLabel("",JLabel.CENTER );
	      //statusLabel = new JLabel("",JLabel.CENTER);        
	      //statusLabel.setSize(350,100);
	      
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      //controlPanel = new JPanel();
	      //controlPanel.setLayout(new FlowLayout());

	      mainFrame.getContentPane().add(headerLabel);
	      mainFrame.getContentPane().add(controlPanel);
	      mainFrame.getContentPane().add(statusLabel);
	      mainFrame.setVisible(true);  
	   }
	   private void showMenu(){
	      //create a menu bar
	      final JMenuBar menuBar = new JMenuBar();
	      menuBar.setFont(new Font("Fira Code", menuBar.getFont().getStyle(), 12));

	      //create menus
	      JMenu fileMenu = new JMenu("Cadastros");
	      fileMenu.setFont(new Font("Fira Code Retina", fileMenu.getFont().getStyle(), 12));
	      JMenu editMenu = new JMenu("Compras"); 
	      editMenu.setFont(new Font("Fira Code Retina", editMenu.getFont().getStyle(), 12));
	      final JMenu aboutMenu = new JMenu("Vendas");
	      aboutMenu.setFont(new Font("Fira Code Retina", aboutMenu.getFont().getStyle(), aboutMenu.getFont().getSize()));
	      final JMenu linkMenu = new JMenu("Sair");
	      linkMenu.setFont(new Font("Fira Code Retina", linkMenu.getFont().getStyle(), linkMenu.getFont().getSize()));
	     
	      //create menu items
	      JMenuItem newMenuItem = new JMenuItem("Clientes");
	      newMenuItem.setFont(new Font("Fira Code", newMenuItem.getFont().getStyle(), newMenuItem.getFont().getSize()));
	      newMenuItem.setMnemonic(KeyEvent.VK_N);
	      newMenuItem.setActionCommand("Clientes");

	      JMenuItem openMenuItem = new JMenuItem("Fornecedores");
	      openMenuItem.setFont(new Font("Fira Code", openMenuItem.getFont().getStyle(), openMenuItem.getFont().getSize()));
	      openMenuItem.setActionCommand("Fornecedores");

	      JMenuItem saveMenuItem = new JMenuItem("Produto");
	      saveMenuItem.setFont(new Font("Fira Code", saveMenuItem.getFont().getStyle(), saveMenuItem.getFont().getSize()));
	      saveMenuItem.setActionCommand("Produto");

	      

	      MenuItemListener menuItemListener = new MenuItemListener();

	      newMenuItem.addActionListener(menuItemListener);
	      openMenuItem.addActionListener(menuItemListener);
	      saveMenuItem.addActionListener(menuItemListener);
	      

	     
	
	      //add menu items to menus
	      fileMenu.add(newMenuItem);
	      fileMenu.addSeparator();
	      fileMenu.add(openMenuItem);
	      fileMenu.addSeparator();
	      fileMenu.add(saveMenuItem);
	     
	     

	      //add menu to menubar
	      menuBar.add(fileMenu);
	      menuBar.add(editMenu);
	      menuBar.add(aboutMenu);       
	      menuBar.add(linkMenu);

	      //add menubar to the frame
	      mainFrame.setJMenuBar(menuBar);
	      mainFrame.setVisible(true);     
	   }
	   class MenuItemListener implements ActionListener {
	      public void actionPerformed1(ActionEvent e) {            
	         statusLabel.setText(e.getActionCommand() + " JMenuItem clicked.");
	      }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}    
	   }
}
