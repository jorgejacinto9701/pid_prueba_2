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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ejercicio06 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JTextArea txtSalida;
	private JComboBox cboProducto;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio06 frame = new Ejercicio06();
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
	public Ejercicio06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEjercicio = new JLabel("Ejercicio03");
		lblEjercicio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEjercicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblEjercicio.setBounds(27, 11, 390, 24);
		contentPane.add(lblEjercicio);
		
		JLabel lblNota = new JLabel("Cantidad");
		lblNota.setBounds(27, 75, 59, 14);
		contentPane.add(lblNota);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(109, 72, 113, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(328, 71, 89, 23);
		contentPane.add(btnProcesar);
		
		txtSalida = new JTextArea();
		txtSalida.setBounds(27, 110, 390, 133);
		contentPane.add(txtSalida);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setBounds(27, 46, 59, 14);
		contentPane.add(lblProducto);
		
		cboProducto = new JComboBox();
		cboProducto.setModel(new DefaultComboBoxModel(new String[] {"Margarita", "Chomp", "Casino", "Morocha"}));
		cboProducto.setBounds(109, 41, 131, 20);
		contentPane.add(cboProducto);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesarJButton(e);
		}
	}
	protected void actionPerformedBtnProcesarJButton(ActionEvent e) {
		double precio, ic, id, ip; 
		int producto, cantidad;
		String obsequio ;
		
		cantidad = Integer.parseInt(txtCantidad.getText());
		producto = cboProducto.getSelectedIndex();
		
		//calculo del precio
		if (producto == 0)
			precio = 0.80;
		else if (producto == 1)
			precio = 1.00;
		else if (producto == 2)
			precio = 1.20;
		else 
			precio = 1.30;
		
		//Calculo importe de compra
		ic = precio * cantidad;
		
		//Calculo importe de descuento
		if (cantidad <=3)
			id = 0;
		else if (cantidad <=4)
			id = 0.05 * ic;
		else if (cantidad <=10)
			id = 0.10 * ic;
		else
			id = 0.12 * ic;
		
		//Calculo importe a pagar
		ip = ic - id;
		
		//obsequio
		if (cantidad>6 && (producto == 2 || producto==3))
			obsequio = "Gorrito";
		else
			obsequio = "No hay obsequio";
		
		txtSalida.setText("Resultados \n");
		txtSalida.append("Cantidad : "+ cantidad +"\n");
		txtSalida.append("Producto : "+ producto +"\n");
		txtSalida.append("Precio : "+ precio +"\n");
		txtSalida.append("ic : "+ ic +"\n");
		txtSalida.append("id : "+ id +"\n");
		txtSalida.append("ip : "+ ip +"\n");
		txtSalida.append("Obsequio : "+ obsequio +"\n");
	}
}
