package examen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio01 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtBono;
	private JButton btnAceptar;
	private JTextArea txtSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio01 frame = new Ejercicio01();
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
	public Ejercicio01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEjercicio = new JLabel("Ejercicio 01");
		lblEjercicio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEjercicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblEjercicio.setBounds(10, 11, 422, 31);
		contentPane.add(lblEjercicio);
		
		JLabel lblBono = new JLabel("Bono");
		lblBono.setBounds(51, 57, 46, 14);
		contentPane.add(lblBono);
		
		txtBono = new JTextField();
		txtBono.setBounds(107, 54, 134, 20);
		contentPane.add(txtBono);
		txtBono.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(282, 53, 89, 23);
		contentPane.add(btnAceptar);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(23, 101, 375, 141);
		contentPane.add(txtSalida);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptarJButton(e);
		}
	}
	protected void actionPerformedBtnAceptarJButton(ActionEvent e) {
		double bono, rh, ad, co, lo;
		
		bono = Double.parseDouble(txtBono.getText());
		
		rh = 0.10 * bono;
		ad = 0.20 * rh;
		co = 0.15  * ad;
		lo = bono - (rh + ad + co);
	
		txtSalida.setText("Resultado  \n");
		txtSalida.append("Recursos Humanos :  " + rh + "\n");
		txtSalida.append("Administración : " + ad + "\n");
		txtSalida.append("Contabilidad :  " + co + "\n");
		txtSalida.append("Logística :  " + lo + "\n");
	}
}









