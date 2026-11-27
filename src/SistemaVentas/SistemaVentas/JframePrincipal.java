package SistemaVentas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JframePrincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar mnPrincipal;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmListar;
	private JMenuItem mntmVender;
	private JMenuItem mntmConfigurarDescuento;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmAcercaDe;

	public static String modelo0 = "Lenovo IdeaPad Slim 3";
	public static double precio0 = 2499.0;
	public static String procesador0 = "Intel Core i5-13420H";
	public static int ram0 = 16;
	public static int almacenamiento0 = 512;

	// Laptop 1
	public static String modelo1 = "HP Pavilion 15-eg300";
	public static double precio1 = 3199.0;
	public static String procesador1 = "Intel Core i7-1355U";
	public static int ram1 = 16;
	public static int almacenamiento1 = 1024;

	// Laptop 2
	public static String modelo2 = "Asus Vivobook Go 15";
	public static double precio2 = 1899.0;
	public static String procesador2 = "AMD Ryzen 5 7520U";
	public static int ram2 = 8;
	public static int almacenamiento2 = 512;

	// Laptop 3
	public static String modelo3 = "Acer Nitro V 15 Gamer";
	public static double precio3 = 3899.0;
	public static String procesador3 = "Intel Core i5-13420H RTX 4050";
	public static int ram3 = 16;
	public static int almacenamiento3 = 1024;

	// Laptop 4
	public static String modelo4 = "Apple MacBook Air M2";
	public static double precio4 = 4799.0;
	public static String procesador4 = "Chip M2 8 Núcleos ";
	public static int ram4 = 8;
	public static int almacenamiento4 = 512;

	//  DESCUENTO
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;

	// OBSEQUIOS
	public static String obsequio1 = "Mouse Inalambrico";
	public static String obsequio2 = "Mochila Porta Laptop";
	public static String obsequio3 = "Audifonos Gamer + Cooler";
	private JLabel lblBinvenido;
	private JSeparator separator;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JTextField txtUsuario;
	private JTextField txtPassword;
	private JButton btnNewButton;
	private JButton btnSalir;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframePrincipal frame = new JframePrincipal();
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
	public JframePrincipal() {
		setTitle("Sistemas de Ventas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 450);
		
		mnPrincipal = new JMenuBar();
		setJMenuBar(mnPrincipal);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setFont(new Font("Verdana", Font.BOLD, 12));
		mnPrincipal.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mntmSalir.setFont(new Font("Verdana", Font.BOLD, 12));
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Verdana", Font.BOLD, 12));
		mnPrincipal.add(mnMantenimiento);
		
		mntmConsultar = new JMenuItem("Consultar Laptops");
		mntmConsultar.addActionListener(this);
		mntmConsultar.setFont(new Font("Verdana", Font.BOLD, 12));
		mnMantenimiento.add(mntmConsultar);
		
		mntmModificar = new JMenuItem("Modificar Laptops");
		mntmModificar.addActionListener(this);
		mntmModificar.setFont(new Font("Verdana", Font.BOLD, 12));
		mnMantenimiento.add(mntmModificar);
		
		mntmListar = new JMenuItem("Listar Laptops");
		mntmListar.addActionListener(this);
		mntmListar.setFont(new Font("Verdana", Font.BOLD, 12));
		mnMantenimiento.add(mntmListar);
		
		mnVentas = new JMenu("Ventas");
		mnVentas.setFont(new Font("Verdana", Font.BOLD, 12));
		mnPrincipal.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mntmVender.setFont(new Font("Verdana", Font.BOLD, 12));
		mnVentas.add(mntmVender);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnConfiguracion.setFont(new Font("Verdana", Font.BOLD, 12));
		mnPrincipal.add(mnConfiguracion);
		
		mntmConfigurarDescuento = new JMenuItem("Configurar Descuento");
		mntmConfigurarDescuento.addActionListener(this);
		mntmConfigurarDescuento.setFont(new Font("Verdana", Font.BOLD, 12));
		mnConfiguracion.add(mntmConfigurarDescuento);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar Obsequio");
		mntmConfigurarObsequio.addActionListener(this);
		mntmConfigurarObsequio.setFont(new Font("Verdana", Font.BOLD, 12));
		mnConfiguracion.add(mntmConfigurarObsequio);
		
		mnAyuda = new JMenu("Ayuda");
		mnAyuda.setFont(new Font("Verdana", Font.BOLD, 12));
		mnPrincipal.add(mnAyuda);
		
		mntmAcercaDe = new JMenuItem("Acerca De");
		mntmAcercaDe.addActionListener(this);
		mntmAcercaDe.setFont(new Font("Verdana", Font.BOLD, 12));
		mnAyuda.add(mntmAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBinvenido = new JLabel("BIENVENIDO");
		lblBinvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBinvenido.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblBinvenido.setBounds(143, 30, 259, 53);
		contentPane.add(lblBinvenido);
		
		separator = new JSeparator();
		separator.setForeground(SystemColor.inactiveCaption);
		separator.setBackground(SystemColor.windowBorder);
		separator.setBounds(10, 135, 544, 20);
		contentPane.add(separator);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(117, 156, 77, 35);
		contentPane.add(lblUsuario);
		
		lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		lblPassword.setBounds(117, 202, 107, 35);
		contentPane.add(lblPassword);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(259, 166, 110, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(259, 207, 110, 20);
		contentPane.add(txtPassword);
		
		btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 12));
		btnNewButton.setBounds(143, 259, 95, 25);
		contentPane.add(btnNewButton);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBackground(SystemColor.activeCaption);
		btnSalir.setFont(new Font("Verdana", Font.BOLD, 12));
		btnSalir.setBounds(288, 259, 95, 25);
		contentPane.add(btnSalir);
		
		lblNewLabel = new JLabel("El Mercado de las Laptops S.A.C - Grupo 4 ");
		lblNewLabel.setForeground(SystemColor.controlShadow);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(98, 94, 352, 20);
		contentPane.add(lblNewLabel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnSalir) {
			actionPerformedBtnSalir(e);
		}
		if (e.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(e);
		}
		if (e.getSource() == mntmModificar) {
			actionPerformedMntmModificar(e);
		}
		if (e.getSource() == mntmListar) {
			actionPerformedMntmListar(e);
		}
		if (e.getSource() == mntmConsultar) {
			actionPerformedMntmConsultar(e);
		}
		if (e.getSource() == mntmConfigurarDescuento) {
			actionPerformedMntmConfigurarDescuento(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmAcercaDe) {
			actionPerformedMntmAcercaDe(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent e) { // CONFIGURAR BOTON "SALIR"
		System.exit(0); // CERRAR TODAS LAS VENTANAS 
	}
	protected void actionPerformedMntmAcercaDe(ActionEvent e) { // CONFIGURAR BOTON "ACERCA DE"
		DialogAcercaDe dAcercade = new DialogAcercaDe() ; //Copia del DialogAcercaDe en el JframePrincipal
			dAcercade.setLocationRelativeTo(this); // Abrir el dialogAcercaDe
			dAcercade.setVisible(true); // para que se vea el JdialogAcercaDe
		
	}
	protected void actionPerformedMntmVender(ActionEvent e) { // configurar boton vender
		DialogVender dVender = new DialogVender(); // copiar la ventana en el Jframe
		dVender.setLocationRelativeTo(this); // abrir ventana
		dVender.setVisible(true); // Muestro la ventana 
		
		}
	protected void actionPerformedMntmConfigurarDescuento(ActionEvent e) {
		JDialogConfigurar dConfigurar = new JDialogConfigurar();
		dConfigurar.setLocationRelativeTo(this);
		dConfigurar.setVisible(true);
	}
	protected void actionPerformedMntmConsultar(ActionEvent e) {
		DlgConsultar dConsultar = new DlgConsultar();
		dConsultar.setLocationRelativeTo(this);
		dConsultar.setVisible(true);
		
	}
	protected void actionPerformedMntmListar(ActionEvent e) {
		DlgListar dListarLaptop = new DlgListar();
		dListarLaptop.setLocationRelativeTo(this);
		dListarLaptop.setVisible(true);
	}
	protected void actionPerformedMntmModificar(ActionEvent e) {
		DlgModificar dModificarLaptop = new DlgModificar();
		dModificarLaptop.setLocationRelativeTo(this);
		dModificarLaptop.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent e) {
		ConfigurarObsequios dConfigurarObsequios = new ConfigurarObsequios();
		dConfigurarObsequios.setLocationRelativeTo(this);
		dConfigurarObsequios.setVisible(true); 
	}
	protected void actionPerformedBtnSalir(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	
		
		//Lectura de datos 
		
	}
}
