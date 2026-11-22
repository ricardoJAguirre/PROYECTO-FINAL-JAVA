package SistemaVentas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class DlgListarLaptops extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextArea txtS;
	private JButton btnCerrar, btnListar;

	public DlgListarLaptops() {
		getContentPane().setBackground(SystemColor.inactiveCaption);
		setTitle("Listado de laptops");
		setModal(true);
		setBounds(100, 100, 500, 420);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 15, 455, 315);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtS);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(145, 345, 95, 25);
		btnCerrar.addActionListener(this);
		getContentPane().add(btnCerrar);

		btnListar = new JButton("Listar");
		btnListar.setBounds(255, 345, 95, 25);
		btnListar.addActionListener(this);
		getContentPane().add(btnListar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			dispose();
		} else if (e.getSource() == btnListar) {
			listarLaptops();
		}
	}

	private void listarLaptops() {
		txtS.setText("LISTADO DE LAPTOPS\n\n");
		imprimirLaptop(JframePrincipal.modelo0, JframePrincipal.precio0, JframePrincipal.procesador0, JframePrincipal.ram0, JframePrincipal.almacenamiento0);
		imprimirLaptop(JframePrincipal.modelo1, JframePrincipal.precio1, JframePrincipal.procesador1, JframePrincipal.ram1, JframePrincipal.almacenamiento1);
		imprimirLaptop(JframePrincipal.modelo2, JframePrincipal.precio2, JframePrincipal.procesador2, JframePrincipal.ram2, JframePrincipal.almacenamiento2);
		imprimirLaptop(JframePrincipal.modelo3, JframePrincipal.precio3, JframePrincipal.procesador3, JframePrincipal.ram3, JframePrincipal.almacenamiento3);
		imprimirLaptop(JframePrincipal.modelo4, JframePrincipal.precio4, JframePrincipal.procesador4, JframePrincipal.ram4, JframePrincipal.almacenamiento4);
	}

	private void imprimirLaptop(String modelo, double precio, String procesador, int ram, int almacenamiento) {
		txtS.append("Modelo         : " + modelo + "\n");
		txtS.append("Precio         : S/. " + String.format("%.2f", precio) + "\n");
		txtS.append("Procesador     : " + procesador + "\n");
		txtS.append("RAM            : " + ram + " GB\n");
		txtS.append("Almacenamiento : " + almacenamiento + " GB\n\n");
	}
}
