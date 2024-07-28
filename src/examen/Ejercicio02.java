package examen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio02 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private JButton btnProcesar;
	private JTextArea txtSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio02 frame = new Ejercicio02();
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
	public Ejercicio02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEjercicio = new JLabel("Ejercicio 02");
		lblEjercicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblEjercicio.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEjercicio.setBounds(10, 11, 496, 28);
		contentPane.add(lblEjercicio);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(42, 61, 70, 14);
		contentPane.add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(42, 92, 70, 14);
		contentPane.add(lblPrecio);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(146, 58, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(146, 89, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(318, 61, 89, 23);
		contentPane.add(btnProcesar);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(35, 139, 457, 166);
		contentPane.add(txtSalida);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesarJButton(e);
		}
	}
	protected void actionPerformedBtnProcesarJButton(ActionEvent e) {
		double precio, nuevoPrecio, ic, id, ip;
		int cantidad;
		
		cantidad = Integer.parseInt(txtCantidad.getText());
		precio = Double.parseDouble(txtPrecio.getText());
		
		nuevoPrecio = precio - 0.10 * precio;
		ic = nuevoPrecio * cantidad;
		id = 0.05 * ic;
		ip = ic - id;
		
		txtSalida.setText("Resultados \n");
		txtSalida.append("Nuevo Precio : " + nuevoPrecio + "\n");
		txtSalida.append("I.compra  : " + ic + "\n");
		txtSalida.append("I.descuento  : " + id + "\n");
		txtSalida.append("I.pagar  : " + ip + "\n");
	}
}



