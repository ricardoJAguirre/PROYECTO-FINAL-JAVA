package SistemaVentas;

import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class DialogVender extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JComboBox<String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JTextArea txtScp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogVender dialog = new DialogVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogVender() {
		setTitle("Vender");
		setBounds(100, 100, 450, 332);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.controlHighlight);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblModelo.setBounds(10, 11, 46, 14);
			contentPanel.add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio");
			lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblPrecio.setBounds(10, 36, 46, 14);
			contentPanel.add(lblPrecio);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad");
			lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblCantidad.setBounds(10, 62, 55, 14);
			contentPanel.add(lblCantidad);
		}
		{
			cboModelo = new JComboBox<String>();
			cboModelo.addActionListener(this);
			cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] {
					JframePrincipal.modelo0, JframePrincipal.modelo1, JframePrincipal.modelo2,
					JframePrincipal.modelo3, JframePrincipal.modelo4}));
			cboModelo.setBounds(80, 7, 199, 18);
			contentPanel.add(cboModelo);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setEditable(false);
			txtPrecio.setBounds(80, 33, 86, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBounds(80, 59, 86, 20);
			contentPanel.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		{
			btnVender = new JButton("Vender");
			btnVender.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnVender.addActionListener(this);
			btnVender.setBounds(310, 27, 89, 23);
			contentPanel.add(btnVender);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(310, 58, 89, 23);
			contentPanel.add(btnCerrar);
		}
		{
			JScrollPane scpScroll = new JScrollPane();
			scpScroll.setBounds(10, 98, 414, 184);
			contentPanel.add(scpScroll);
			{
				txtScp = new JTextArea();
				txtScp.setText("");
				scpScroll.setViewportView(txtScp);
			}
		}
	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnVender(ActionEvent e) {
		
		//declarar variable 
		int cantidad;
		double  ImpCompra,ImpDescuento,ImpTotal;
		String obsequio;
		
		//LEER CANTIDAD USANDO EL TRY 
		try { // LO USE PARA QUE CUANDO EL USUARIO PONGA CANTIDAD 0 ME DE ERROR Y NO EJECUTE EL PROGRAMA
	        cantidad = Integer.parseInt(txtCantidad.getText().trim());

	        if (cantidad <= 0) {
	            JOptionPane.showMessageDialog(
	                this,
	                "La cantidad debe ser mayor a 0.",
	                "Error",
	                JOptionPane.ERROR_MESSAGE
	            );
	            txtCantidad.requestFocus();
	            return; 
	        }

	       
	    } catch (NumberFormatException ex) {
	        JOptionPane.showMessageDialog(
	            this,
	            "Ingrese un número entero válido en cantidad.",
	            "Error",
	            JOptionPane.ERROR_MESSAGE
	        );
	        txtCantidad.requestFocus();
	        return;
	    }
		// Proceso de datos
		
		
		
		 
		
}
	
			//OBTENER EL PRECIO DE LAS LAPTOPS CON EL COMBO BOX
			protected void actionPerformedCboModelo(ActionEvent e) {
			    int precioModelo = cboModelo.getSelectedIndex();
			    double precio;

			    switch (precioModelo) {
			        case 0:
			            precio = JframePrincipal.precio0;
			            break;
			        case 1:
			            precio = JframePrincipal.precio1;
			            break;
			        case 2:
			            precio = JframePrincipal.precio2;
			            break;
			        case 3:
			            precio = JframePrincipal.precio3;
			            break;
			        default:
			            precio = JframePrincipal.precio4;
			            break;
			    }

			    txtPrecio.setText(String.valueOf(precio));
			}
		
		
		
	

	
	
	
	
	
	//BOTON DE CERRAR - NO TOCAR (YA PROGRAMADO)
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
		
	}
	
}