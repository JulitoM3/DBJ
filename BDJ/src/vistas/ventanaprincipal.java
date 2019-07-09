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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		lblNmeroDeControl.setBounds(10, 190, 106, 21);
		contentPane.add(lblNmeroDeControl);
		
		JLabel lblCarrera = new JLabel("Carrera");
		lblCarrera.setBounds(10, 222, 106, 21);
		contentPane.add(lblCarrera);
		
		JLabel lblSemestre = new JLabel("Semestre");
		lblSemestre.setBounds(10, 254, 106, 21);
		contentPane.add(lblSemestre);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(135, 285, 89, 23);
		contentPane.add(btnAgregar);
		
		textField = new JTextField();
		textField.setBounds(112, 160, 215, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 192, 215, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 222, 215, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(112, 254, 215, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(477, 159, 89, 23);
		contentPane.add(btnConsultar);
		
		textField_4 = new JTextField();
		textField_4.setBounds(448, 129, 147, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNumeroDeControl = new JLabel("Numero de Control");
		lblNumeroDeControl.setBounds(325, 132, 113, 17);
		contentPane.add(lblNumeroDeControl);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(337, 188, 319, 120);
		contentPane.add(textArea);
	}
}
