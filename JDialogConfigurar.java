package SistemaVentas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogConfigurar extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblPrecio;
	private JLabel lblCalcular;
	private JTextField txtPrecio;
	private JTextField txtDescuento;
	private JButton btnCalcular;
	private JButton btnCerrar;
	private JLabel lbltotal;
	private JTextField txtDescuentoTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDialogConfigurar dialog = new JDialogConfigurar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialogConfigurar() {
		setTitle("Configurar Descuentos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblPrecio = new JLabel("PRECIO");
		lblPrecio.setBounds(31, 27, 82, 14);
		contentPanel.add(lblPrecio);
		
		lblCalcular = new JLabel("DESCUENTO %");
		lblCalcular.setBounds(31, 59, 82, 14);
		contentPanel.add(lblCalcular);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(123, 24, 86, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtDescuento = new JTextField();
		txtDescuento.setEditable(false);
		txtDescuento.setBounds(123, 52, 86, 20);
		contentPanel.add(txtDescuento);
		txtDescuento.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setForeground(SystemColor.text);
		btnCalcular.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnCalcular.setBackground(SystemColor.inactiveCaption);
		btnCalcular.setBounds(240, 23, 89, 23);
		contentPanel.add(btnCalcular);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setForeground(SystemColor.text);
		btnCerrar.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnCerrar.setBackground(SystemColor.inactiveCaption);
		btnCerrar.setBounds(240, 55, 89, 23);
		contentPanel.add(btnCerrar);
		
		lbltotal = new JLabel("TOTAL ");
		lbltotal.setBounds(31, 84, 46, 14);
		contentPanel.add(lbltotal);
		
		txtDescuentoTotal = new JTextField();
		txtDescuentoTotal.setEditable(false);
		txtDescuentoTotal.setBounds(123, 81, 86, 20);
		contentPanel.add(txtDescuentoTotal);
		txtDescuentoTotal.setColumns(10);
	}
	

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCalcular) {
			actionPerformedBtnCalcular(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnCalcular(ActionEvent e) {
		try {
			//DECLARO VARIABLE
			double precio, descuento, descuentoTotal;
			
			//Entrada de datos
			precio=Double.parseDouble(txtPrecio.getText());
			
			//PROCESO
			if (precio >=500) {
				descuento = 0.20 * precio;
								
			} else {
				descuento = 0.15 * precio;

			}
			
			descuentoTotal = precio - descuento;
			
			//SALIDA DE DATOS
			txtDescuento.setText(String.valueOf(descuento));
			txtDescuentoTotal.setText(String.valueOf(descuentoTotal));
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this,"Ingresa solo Numeros");
			// TODO: handle exception
		}
		
		
	
	
		}
	}
