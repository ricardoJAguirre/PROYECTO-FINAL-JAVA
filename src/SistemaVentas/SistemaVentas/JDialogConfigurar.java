package SistemaVentas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JDialogConfigurar extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;   // SI EL FOCO AMARILLO ESTA SOBRE LA CLASE "JDialogConfigurar" LE DA CLICK Y
														// ECLIPSE ADICIONA ESTO Y LO USA PARA CUANDO QUIERA PASAR EL PROGRAMA A UN ARCHIVO 
													 
	private final JPanel contentPanel = new JPanel();
	private JLabel lblDscto1;
	private JLabel lblDscto2;
	private JLabel lblDscto3;
	private JLabel lblDscto4;
	private JTextField txtDscto1;
	private JTextField txtDscto2;
	private JTextField txtDscto3;
	private JTextField txtDscto4;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblPorcentaje1;
	private JLabel lblPorcentaje2;
	private JLabel lblPorcentaje3;
	private JLabel lblPorcentaje4;

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
		setBounds(100, 100, 450, 220);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.controlHighlight);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblDscto1 = new JLabel("1 a 5 Unidades");
		lblDscto1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDscto1.setBounds(31, 27, 82, 14);
		contentPanel.add(lblDscto1);
		
		lblDscto2 = new JLabel("6 a 10 Unidades");
		lblDscto2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDscto2.setBounds(31, 62, 89, 14);
		contentPanel.add(lblDscto2);
		
		lblDscto3 = new JLabel("11 a 15 Unidades");
		lblDscto3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDscto3.setBounds(31, 90, 96, 18);
		contentPanel.add(lblDscto3);
		
		lblDscto4 = new JLabel("M\u00E1s de 15 Unidades");
		lblDscto4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDscto4.setBounds(31, 125, 116, 14);
		contentPanel.add(lblDscto4);
		
		txtDscto1 = new JTextField();
		txtDscto1.setText("7.5");
		txtDscto1.setBounds(164, 21, 72, 20);
		contentPanel.add(txtDscto1);
		txtDscto1.setColumns(10);
		
		txtDscto2 = new JTextField();
		txtDscto2.setText("10");
		txtDscto2.setBounds(164, 53, 72, 20);
		contentPanel.add(txtDscto2);
		txtDscto2.setColumns(10);
		
		txtDscto3 = new JTextField();
		txtDscto3.setText("12.5");
		txtDscto3.setBounds(164, 84, 72, 20);
		contentPanel.add(txtDscto3);
		txtDscto3.setColumns(10);
		
		txtDscto4 = new JTextField();
		txtDscto4.setText("15");
		txtDscto4.setBounds(164, 119, 72, 20);
		contentPanel.add(txtDscto4);
		txtDscto4.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(302, 23, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(302, 58, 89, 23);
		contentPanel.add(btnCancelar);
		
		lblPorcentaje1 = new JLabel("%");
		lblPorcentaje1.setBounds(246, 27, 46, 14);
		contentPanel.add(lblPorcentaje1);
		
		lblPorcentaje2 = new JLabel("%");
		lblPorcentaje2.setBounds(246, 62, 46, 14);
		contentPanel.add(lblPorcentaje2);
		
		lblPorcentaje3 = new JLabel("%");
		lblPorcentaje3.setBounds(246, 92, 46, 14);
		contentPanel.add(lblPorcentaje3);
		
		lblPorcentaje4 = new JLabel("%");
		lblPorcentaje4.setBounds(246, 125, 46, 14);
		contentPanel.add(lblPorcentaje4);
	}
	

	
	protected void actionPerformedBtnAceptar(ActionEvent e) { //CONFIGURAR BOTON DE GUARDAR EL PORCENTAJE DE DESCUENTO
		
		try { //SE USA EL TRY  PARA QUE EL PROGRAMA NO SE CAIGA SI EL USUARIO ESCRIBE LETRAS EN VEZ DE NUMERO
			double p1 = Double.parseDouble(txtDscto1.getText().trim()	.replace(',', '.'));
			double p2 = Double.parseDouble(txtDscto2.getText().trim().replace(',', '.'));
			double p3 = Double.parseDouble(txtDscto3.getText().trim().replace(',', '.'));
			double p4 = Double.parseDouble(txtDscto4.getText().trim().replace(',', '.'));

			if (p1 < 0 || p2 < 0 || p3 < 0 || p4 < 0) {  // ESTOY COMPARANDO EN CONJUNTO LAS VARIABLES 
														//PARA QUE EL USUARIO NO PONGA UN NUMERO NEGATIVO
				JOptionPane.showMessageDialog(this, "Los porcentajes no pueden ser negativos.", 
						"Error", JOptionPane.ERROR_MESSAGE); // ESTO ES UNA VENTANA QUE DA ERROR SI PONEN NUMERO NEGATIVO
				return; //RETORNO LA VARIABLE SI SE CUMPLE LA CONDICION 
			}

			JframePrincipal.porcentaje1 = p1; // CAMBIO EL VALOR DE LA VARIABLE PUBLICA POR EL NUEVO VALOR LOCAL
			JframePrincipal.porcentaje2 = p2;
			JframePrincipal.porcentaje3 = p3;
			JframePrincipal.porcentaje4 = p4;
			dispose(); // SE CIERRA LA VENTANA CUANDO SE GUARADAN LOS CAMBIOS AUTOMATICAMENTE

		
		} catch (NumberFormatException ex) { // SI NO SE CUMPLE EL TRY EL CATCH BOTA EL ERROR 
											//AL NO CUMPLIR EL CONDICIONAL IF DENTRO DEL TRY
			
				JOptionPane.showMessageDialog(this, "Ingrese números válidos en los porcentajes.",
						"Error", JOptionPane.ERROR_MESSAGE);
			
		}			
				
			//IMPRIMIR DATOS EN LOS TXT DE MIS VARIABLES GLOBALES DECLARADAS
			txtDscto1.setText(String.valueOf(JframePrincipal.porcentaje1));
			txtDscto2.setText(String.valueOf(JframePrincipal.porcentaje2));
			txtDscto3.setText(String.valueOf(JframePrincipal.porcentaje3));
			txtDscto4.setText(String.valueOf(JframePrincipal.porcentaje4)); 
			
		}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	
	}
