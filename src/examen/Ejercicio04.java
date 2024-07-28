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

public class Ejercicio04 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNota;
	private JButton btnProcesar;
	private JTextArea txtSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio04 frame = new Ejercicio04();
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
	public Ejercicio04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEjercicio = new JLabel("Ejercicio01 - If-else");
		lblEjercicio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEjercicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblEjercicio.setBounds(27, 11, 390, 24);
		contentPane.add(lblEjercicio);
		
		JLabel lblNota = new JLabel("Nota");
		lblNota.setBounds(27, 75, 59, 14);
		contentPane.add(lblNota);
		
		txtNota = new JTextField();
		txtNota.setBounds(109, 72, 86, 20);
		contentPane.add(txtNota);
		txtNota.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(328, 71, 89, 23);
		contentPane.add(btnProcesar);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(27, 110, 390, 133);
		contentPane.add(txtSalida);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesarJButton(e);
		}
	}
	protected void actionPerformedBtnProcesarJButton(ActionEvent e) {
		double nota;
		String obsequio;
		
		nota = Double.parseDouble(txtNota.getText());
	
		if (nota <= 16)
			obsequio = "Un saludo";
		else
			obsequio = "Una Bicicleta";
		
		txtSalida.setText("obsequio : " + obsequio + "\n");
	}
}


