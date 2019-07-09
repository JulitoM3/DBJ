package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inicioS extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnEntrar;
	
	public JTextField getUsuario(){
		return this.textField;
	}
	public JPasswordField getContraseña(){
		return this.passwordField;
	}
	public JButton getEntrar(){
		return this.btnEntrar;
	}
	
	public inicioS() {
		setResizable(false);
		setTitle("Inicio de sesi\u00F3n");
		setIconImage(Toolkit.getDefaultToolkit().getImage(inicioS.class.getResource("/resources/tecnm.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 433);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		mntmAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent JA) {
				JOptionPane.showMessageDialog(null, "Contacte L161080043@iztapalapa.tecnm.mx para poder acceder","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnAyuda.add(mntmAyuda);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(inicioS.class.getResource("/resources/tecnm.jpg")));
		label.setBounds(10, 11, 400, 247);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(130, 301, 152, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 332, 152, 20);
		contentPane.add(passwordField);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(31, 301, 64, 20);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(31, 332, 75, 20);
		contentPane.add(lblContrasea);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(300, 314, 89, 23);
		contentPane.add(btnEntrar);
	}
}
