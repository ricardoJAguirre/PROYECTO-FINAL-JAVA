package SistemaVentas;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgListar extends JDialog implements ActionListener {
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
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		
	}
}
