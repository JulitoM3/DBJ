package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class ventanaprincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textNom,textControl,textCarrera, textSem, textlookfor;
	private JButton btnAgregar,btnConsultar;
	private JTextArea Info;
	public JTextArea getInfo(){
		return this.Info;
	}
	public JTextField getNombre(){
		return this.textNom;
	}
	public JTextField getControl(){
		return this.textControl;
	}
	public JTextField getSem(){
		return this.textSem;
	}
	public JTextField getlookfor(){
		return this.textlookfor;
	}
	public JTextField getCarrera(){
		return this.textCarrera;
	}
	public JButton AñadirRegistro(){
		return this.btnAgregar;
	}
	public JButton Buscar(){
		return this.btnConsultar;
	}
	public ventanaprincipal() {
		setTitle("Ventana principal");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaprincipal.class.getResource("/resources/tecnm.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 374);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(ventanaprincipal.class.getResource("/resources/logodgest.png")));
		img.setBounds(161, 11, 317, 138);
		contentPane.add(img);
		
		JLabel lblNombreCompleto = new JLabel("Nombre completo");
		lblNombreCompleto.setBounds(10, 160, 106, 21);
		contentPane.add(lblNombreCompleto);
		
		JLabel lblNmeroDeControl = new JLabel("N\u00FAmero de control");
		lblNmeroDeControl.setBounds(10, 190, 120, 21);
		contentPane.add(lblNmeroDeControl);
		
		JLabel lblCarrera = new JLabel("Carrera");
		lblCarrera.setBounds(10, 222, 106, 21);
		contentPane.add(lblCarrera);
		
		JLabel lblSemestre = new JLabel("Semestre");
		lblSemestre.setBounds(10, 254, 106, 21);
		contentPane.add(lblSemestre);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(135, 285, 89, 23);
		contentPane.add(btnAgregar);
		
		textNom = new JTextField();
		textNom.setBounds(120, 160, 215, 20);
		contentPane.add(textNom);
		textNom.setColumns(10);
		
		textControl = new JTextField();
		textControl.setBounds(120, 192, 106, 20);
		contentPane.add(textControl);
		textControl.setColumns(10);
		
		textCarrera = new JTextField();
		textCarrera.setBounds(112, 222, 44, 20);
		contentPane.add(textCarrera);
		textCarrera.setColumns(10);
		
		textSem = new JTextField();
		textSem.setBounds(112, 254, 44, 20);
		contentPane.add(textSem);
		textSem.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(477, 159, 89, 23);
		contentPane.add(btnConsultar);
		
		textlookfor = new JTextField();
		textlookfor.setBounds(448, 129, 147, 20);
		contentPane.add(textlookfor);
		textlookfor.setColumns(10);
		
		JLabel lblNumeroDeControl = new JLabel("Numero de Control");
		lblNumeroDeControl.setBounds(325, 132, 113, 17);
		contentPane.add(lblNumeroDeControl);
		
		 Info = new JTextArea();
		Info.setEditable(false);
		Info.setBounds(337, 188, 319, 120);
		contentPane.add(Info);
	}
}
