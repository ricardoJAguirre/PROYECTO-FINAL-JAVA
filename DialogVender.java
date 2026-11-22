package SistemaVentas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;

public class DialogVender extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnCerrar;

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
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 11, 46, 14);
			contentPanel.add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(10, 36, 46, 14);
			contentPanel.add(lblPrecio);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad");
			lblCantidad.setBounds(10, 62, 55, 14);
			contentPanel.add(lblCantidad);
		}
		{
			JComboBox<String>cboModelo = new JComboBox<>();
			cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Lenovo IdeaPad Slim 3", "HP Pavilion 15-eg300", "Asus Vivobook Go 15", "Acer Nitro V 15 Gamer", "Apple MacBook Air M2"}));
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
			JButton btnVender = new JButton("VENDER");
			btnVender.setBounds(310, 27, 89, 23);
			contentPanel.add(btnVender);
		}
		{
			btnCerrar = new JButton("CERRAR");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(310, 58, 89, 23);
			contentPanel.add(btnCerrar);
		}
		{
			JScrollPane scpScroll = new JScrollPane();
			scpScroll.setBounds(10, 98, 414, 184);
			contentPanel.add(scpScroll);
			{
				JTextArea txtScp = new JTextArea();
				txtScp.setText("");
				scpScroll.setViewportView(txtScp);
			}
		}
	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
		
	}
}
