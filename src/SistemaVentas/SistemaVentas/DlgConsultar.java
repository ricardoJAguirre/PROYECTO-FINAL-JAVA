package SistemaVentas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DlgConsultar extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblProcesador;
	private JLabel lblRam;
	private JLabel lblAlmacenamiento;
	private JTextField txtPrecio;
	private JTextField txtProcesador;
	private JTextField txtAlmacenamiento;
	private JComboBox<String> cboModelo;
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
		
		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] {"Lenovo IdeaPad Slim 3", "HP Pavilion 15-eg300", "Asus Vivobook Go 15", "Acer Nitro V 15 Gamer", "Apple MacBook Air M2"}));
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
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		dispose(); 
		
	}
	protected void actionPerformedCboModelo(ActionEvent e) { // PERSONALIZAR EL BOTON DE ComboBOX para LISTAR LAS CARACTERISTICAS DE LAPTOPS
		
		//DECLARO MIS VARIABLES PARA USAR MI SWITCH AND CASE
		int ram, almacenamiento,
		ModeloListar = cboModelo.getSelectedIndex();
		double precio;
		String procesador;
		
		//OBTENER LAS CARACTERISTICAS DE LAS LAPTOPS CON LAS VARIABLES
		 
		 switch (ModeloListar) {
		 
		 	case 0:
		 		precio = JframePrincipal.precio0;
		 		procesador = JframePrincipal.procesador0;
		 		ram = JframePrincipal.ram0;
		 		almacenamiento = JframePrincipal.almacenamiento0;
		 		break;
		 	 
		 	case 1:
		 		precio = JframePrincipal.precio1;
		 		procesador = JframePrincipal.procesador1;
		 		ram = JframePrincipal.ram1;
		 		almacenamiento = JframePrincipal.almacenamiento1;
		 		break;
		 		
		 	case 2:
		 		precio = JframePrincipal.precio2;
		 		procesador = JframePrincipal.procesador2;
		 		ram = JframePrincipal.ram2;
		 		almacenamiento = JframePrincipal.almacenamiento2;
		 		break;
		 		
		 	case 3:
		 		precio = JframePrincipal.precio3;
		 		procesador = JframePrincipal.procesador3;
		 		ram = JframePrincipal.ram3;
		 		almacenamiento = JframePrincipal.almacenamiento3;
		 		break;
		 		
		 	default:
		 		precio = JframePrincipal.precio4;
		 		procesador = JframePrincipal.procesador4;
		 		ram = JframePrincipal.ram4;
		 		almacenamiento = JframePrincipal.almacenamiento4;
		 		break;
		 		
		 		
		 	
				
			}
		 
		 //IMPRIMIR EN MI TXT
		 txtPrecio.setText(String.format("%,.2f",precio));
		 txtProcesador.setText(procesador);
		 txtRam.setText(String.valueOf(ram + "GB")); // USO EL "+" para añadir la palabra "GB" ya que mi variable publica solo es INT
		 txtAlmacenamiento.setText(String.valueOf(almacenamiento + "GB"));
		
		
		 }
			
			
			
		
		
		
	
	
}
