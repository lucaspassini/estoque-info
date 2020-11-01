package model;

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

public class SwingMenu {
	private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel; 

	   public SwingMenu(){
	      prepareGUI();
	   }
	   public static void main(String[] args){
	      SwingMenu  swingMenu = new SwingMenu();     
	      swingMenu.showMenu();
	   }
	   private void prepareGUI(){
	      mainFrame = new JFrame("EstoqueInfo");
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

	      //create menus
	      JMenu fileMenu = new JMenu("Cadastros");
	      JMenu editMenu = new JMenu("Compras"); 
	      final JMenu aboutMenu = new JMenu("Vendas");
	      final JMenu linkMenu = new JMenu("Sair");
	     
	      //create menu items
	      JMenuItem newMenuItem = new JMenuItem("Clientes");
	      newMenuItem.setMnemonic(KeyEvent.VK_N);
	      newMenuItem.setActionCommand("Clientes");

	      JMenuItem openMenuItem = new JMenuItem("Fornecedores");
	      openMenuItem.setActionCommand("Fornecedores");

	      JMenuItem saveMenuItem = new JMenuItem("Produto");
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
