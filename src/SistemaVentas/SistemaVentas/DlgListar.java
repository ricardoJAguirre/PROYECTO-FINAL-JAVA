package SistemaVentas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DlgListar extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scpScroll;
	private JTextArea txtScp;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgListar dialog = new DlgListar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); 
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DlgListar() {
		setTitle("Listar Laptops");
		getContentPane().setBackground(SystemColor.inactiveCaption);
		setBounds(100, 100, 500, 420);
		getContentPane().setLayout(null);
		
		scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 11, 464, 330);
		getContentPane().add(scpScroll);
		
		txtScp = new JTextArea();
		txtScp.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtScp.setEditable(false);
		scpScroll.setViewportView(txtScp);
		
		btnCerrar = new JButton("Cerrar"); 
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnCerrar.setBounds(126, 347, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnListar.setBounds(247, 347, 89, 23);
		getContentPane().add(btnListar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedbtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedbtnListar(ActionEvent e) {
		
		//LAPTOP1
		txtScp.setText("Modelo de Laptop \t : "+ JframePrincipal.modelo0 + "\n");
		txtScp.append("Precio de laptop \t : S/ " + String.format("%,.2f", JframePrincipal.precio0) + "\n");
		txtScp.append("Procesador \t \t : "+JframePrincipal.procesador0 +"\n");
		txtScp.append("Memoria Ram \t \t : " + JframePrincipal.ram0 + "GB\n");
		txtScp.append("Almacenamiento \t \t : " + JframePrincipal.almacenamiento0 + "GB\n \n");
		
		//LAPTOP 2
		txtScp.append("Modelo de Laptop \t : "+ JframePrincipal.modelo1 + "\n");
		txtScp.append("Precio de laptop \t : S/ " + String.format("%,.2f", JframePrincipal.precio1) + "\n");
		txtScp.append("Procesador \t \t : "+JframePrincipal.procesador1 +"\n");
		txtScp.append("Memoria Ram \t \t : " + JframePrincipal.ram1 + "GB\n");
		txtScp.append("Almacenamiento \t \t : " + JframePrincipal.almacenamiento1 + "GB\n \n");
		
		//LAPTOP 3 
		txtScp.append("Modelo de Laptop \t : "+ JframePrincipal.modelo2 + "\n");
		txtScp.append("Precio de laptop \t : S/ " + String.format("%,.2f", JframePrincipal.precio2) + "\n");
		txtScp.append("Procesador \t \t : "+JframePrincipal.procesador2 +"\n");
		txtScp.append("Memoria Ram \t \t : " + JframePrincipal.ram2 + "GB\n");
		txtScp.append("Almacenamiento \t \t : " + JframePrincipal.almacenamiento2 + "GB\n \n");
		
		//LAPTOP4
		txtScp.append("Modelo de Laptop \t : "+ JframePrincipal.modelo3 + "\n");
		txtScp.append("Precio de laptop \t : S/ " + String.format("%,.2f", JframePrincipal.precio3) + "\n");
		txtScp.append("Procesador \t \t : "+JframePrincipal.procesador3 +"\n");
		txtScp.append("Memoria Ram \t \t : " + JframePrincipal.ram3 + "GB\n");
		txtScp.append("Almacenamiento \t \t : " + JframePrincipal.almacenamiento3 + "GB\n \n");
		
		//LAPTOP5
		txtScp.append("Modelo de Laptop \t : "+ JframePrincipal.modelo4 + "\n");
		txtScp.append("Precio de laptop \t : S/ " + String.format("%,.2f", JframePrincipal.precio4) + "\n");
		txtScp.append("Procesador \t \t : "+JframePrincipal.procesador4 +"\n");
		txtScp.append("Memoria Ram \t \t : " + JframePrincipal.ram3 + "GB\n");
		txtScp.append("Almacenamiento \t \t : " + JframePrincipal.almacenamiento4 + "GB\n \n");
		
	}
}
