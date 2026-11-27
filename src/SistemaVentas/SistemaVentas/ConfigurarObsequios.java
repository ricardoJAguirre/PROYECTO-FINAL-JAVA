package SistemaVentas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConfigurarObsequios extends JDialog implements ActionListener {

	
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblObsequio1;
	private JLabel lblObsequio2;
	private JLabel lblObsequio3;
	private JTextField txtObsequio1;
	private JTextField txtObsequio2;
	private JTextField txtObsequio3;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarObsequios dialog = new ConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequios() {
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblObsequio1 = new JLabel("1 Unidad");
		lblObsequio1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObsequio1.setBounds(10, 28, 107, 14);
		contentPanel.add(lblObsequio1);
		
		lblObsequio2 = new JLabel("2 a 5 Unidades");
		lblObsequio2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObsequio2.setBounds(10, 63, 107, 14);
		contentPanel.add(lblObsequio2);
		
		lblObsequio3 = new JLabel("6 a m\u00E1s Unidades");
		lblObsequio3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObsequio3.setBounds(10, 97, 107, 14);
		contentPanel.add(lblObsequio3);
		
		txtObsequio1 = new JTextField();
		txtObsequio1.setText(JframePrincipal.obsequio1);
		txtObsequio1.setBounds(127, 22, 163, 20);
		contentPanel.add(txtObsequio1);
		txtObsequio1.setColumns(10);
		
		txtObsequio2 = new JTextField();
		txtObsequio2.setText(JframePrincipal.obsequio2);
		txtObsequio2.setBounds(127, 57, 163, 20);
		contentPanel.add(txtObsequio2);
		txtObsequio2.setColumns(10);
		
		txtObsequio3 = new JTextField();
		txtObsequio3.setText(JframePrincipal.obsequio3);
		txtObsequio3.setBounds(127, 91, 163, 20);
		contentPanel.add(txtObsequio3);
		txtObsequio3.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAceptar.setBounds(321, 21, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setBounds(321, 56, 89, 23);
		contentPanel.add(btnCancelar);
	} 
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) { // BOTON DE CERRAR CONFIGURADO
		dispose();
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) { //BOTON ACEPTAR Y GUARDAR VALORES
	
			String obsq1 = txtObsequio1.getText().trim();  // STRING PARA OBTENER DATOS EN LOS TXT Y DECLARADAS COMO VARIABLES A LA VEZ
			String obsq2 = txtObsequio2.getText().trim();  // STRING PARA OBTENER DATOS EN LOS TXT Y DECLARADAS COMO VARIABLES A LA VEZ
			String obsq3 = txtObsequio3.getText().trim();  // STRING PARA OBTENER DATOS EN LOS TXT Y DECLARADAS COMO VARIABLES A LA VEZ
			
			//AHORA PROCESO LA ENTRADA PARA EVALUAR LOS CAMBIOS DE OBSEQUIO DENTRO DE LOS TXT
			
			String letras = "[a-zA-Z·ÈÌÛ˙¸¡…Õ”⁄‹Ò—+ ]+"; // HACER UNA VARIABLE DONDE LOS VALORES DENTRO SON UN CONJUNTO DE CARACTERES 
														//PERMITIDOS PARA REALIZAR LA CONDICIONAL

			if (!obsq1.matches(letras)) { //COMPARO SI LA VARIABLE LETRAS ES IGUAL A OBSQ1 QUE NO INCLUYA NUMEROS 
				JOptionPane.showMessageDialog(this, "El obsequio 1 debe tener solo letras."); //REALIZO UN MENSAJE DE ERROR SI EL USUARIO PONE NUMEROS Y NO STRING
			} else if (!obsq2.matches(letras)) {
				JOptionPane.showMessageDialog(this, "El obsequio 2 debe tener solo letras.");
			} else if (!obsq3.matches(letras)) {
				JOptionPane.showMessageDialog(this, "El obsequio 3 debe tener solo letras.");
			} else {
				JframePrincipal.obsequio1 = obsq1; //GUARDO EL VALOR DE MI VARIABLE PUBLICA POR LA VARIABLE LOCAL
				JframePrincipal.obsequio2 = obsq2;
				JframePrincipal.obsequio3 = obsq3;
				dispose(); // CIERRO MI PROGRAMA CUANDO SE GUARDEN LOS VALORES
			}
			
			
			
		
		
		
		 
	}
}
