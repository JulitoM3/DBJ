package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class licencia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					licencia frame = new licencia();
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
	public licencia() {
		setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 11));
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(licencia.class.getResource("/resources/tecnm.jpg")));
		setTitle("Terminos y condiciones");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 235);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtArea1 = new JTextArea();
		txtArea1.setEditable(false);
		txtArea1.setText("**********************************************************************\r\n*     Este software fu\u00E9 creado para el ITIZ con fines educativos y         *\r\n*     todo us\u00F3 indebido es responsabilidad del usuario, asi mismo      *\r\n*                             se dar\u00E1 credito al autor del mismo                      *\r\n*                    Contacto: L161080043@iztapalapa.tecnm.mx                 *\r\n**********************************************************************");
		txtArea1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
		txtArea1.setBounds(10, 11, 424, 124);
		contentPane.add(txtArea1);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent DA) {
				Registro reg = new Registro();
				reg.setVisible(true);
				dispose();
				
			}
		});
		btnContinuar.setEnabled(false);
		btnContinuar.setBounds(180, 172, 89, 23);
		contentPane.add(btnContinuar);
		
		JCheckBox condiciones = new JCheckBox("He le\u00EDdo y acepto las condiciones de este software");
		condiciones.setBackground(Color.WHITE);
		condiciones.setFont(new Font("Tahoma", Font.ITALIC, 11));
		condiciones.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent JA) {
				if(condiciones.isSelected()){
					btnContinuar.setEnabled(true);
				}else{
					btnContinuar.setEnabled(false);
				}
			}
		});
		condiciones.setBounds(97, 142, 295, 23);
		contentPane.add(condiciones);
	}
}
