package SistemaVentas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class DlgConsultar extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblProcesador;
	private JLabel lblRam;
	private JLabel lblAlmacenamiento;
	private JTextField txtPrecio;
	private JTextField txtProcesador;
	private JTextField txtAlmacenamiento;
	private JComboBox cboModelo;
	private JTextField txtRam;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgConsultar dialog = new DlgConsultar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgConsultar() {
		setTitle("Consultar Laptop");
		setBounds(100, 100, 511, 260);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Verdana", Font.BOLD, 11));
		lblModelo.setBounds(10, 33, 82, 14);
		contentPanel.add(lblModelo);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Verdana", Font.BOLD, 11));
		lblPrecio.setBounds(10, 68, 46, 14);
		contentPanel.add(lblPrecio);
		
		lblProcesador = new JLabel("Procesador");
		lblProcesador.setFont(new Font("Verdana", Font.BOLD, 11));
		lblProcesador.setBounds(10, 105, 82, 14);
		contentPanel.add(lblProcesador);
		
		lblRam = new JLabel("RAM");
		lblRam.setFont(new Font("Verdana", Font.BOLD, 11));
		lblRam.setBounds(10, 143, 46, 14);
		contentPanel.add(lblRam);
		
		lblAlmacenamiento = new JLabel("Almacenamiento");
		lblAlmacenamiento.setFont(new Font("Verdana", Font.BOLD, 11));
		lblAlmacenamiento.setBounds(10, 180, 109, 14);
		contentPanel.add(lblAlmacenamiento);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(153, 66, 195, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtProcesador = new JTextField();
		txtProcesador.setEditable(false);
		txtProcesador.setBounds(153, 103, 195, 20);
		contentPanel.add(txtProcesador);
		txtProcesador.setColumns(10);
		
		txtAlmacenamiento = new JTextField();
		txtAlmacenamiento.setEditable(false);
		txtAlmacenamiento.setBounds(153, 178, 195, 20);
		contentPanel.add(txtAlmacenamiento);
		txtAlmacenamiento.setColumns(10);
		
		cboModelo = new JComboBox();
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Lenovo IdeaPad Slim 3", "HP Pavilion 15-eg300", "Asus Vivobook Go 15", "Acer Nitro V 15 Gamer", "Apple MacBook Air M2"}));
		cboModelo.setBounds(153, 31, 195, 20);
		contentPanel.add(cboModelo);
		
		txtRam = new JTextField();
		txtRam.setEditable(false);
		txtRam.setBounds(153, 141, 195, 20);
		contentPanel.add(txtRam);
		txtRam.setColumns(10);
		
		btnCerrar = new JButton("CERRAR");
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Verdana", Font.PLAIN, 9));
		btnCerrar.setBounds(374, 33, 82, 26);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		dispose();
		
	}
}
