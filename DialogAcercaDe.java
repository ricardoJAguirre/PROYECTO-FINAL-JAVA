package SistemaVentas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;

public class DialogAcercaDe extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblintengrantes;
	private JLabel lblSefora;
	private JLabel lblGian;
	private JLabel lblJose;
	private JLabel lblRicardo;
	private JLabel lblJhimmy;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogAcercaDe dialog = new DialogAcercaDe();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogAcercaDe() {
		setTitle("Acerca De");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblintengrantes = new JLabel("INTEGRANTES :");
			lblintengrantes.setForeground(Color.BLACK);
			lblintengrantes.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
			lblintengrantes.setHorizontalAlignment(SwingConstants.CENTER);
			lblintengrantes.setBackground(new Color(192, 192, 192));
			lblintengrantes.setBounds(132, 34, 179, 43);
			contentPanel.add(lblintengrantes);
		}
		{
			lblSefora = new JLabel("Sefora");
			lblSefora.setForeground(SystemColor.textInactiveText);
			lblSefora.setBackground(new Color(192, 192, 192));
			lblSefora.setFont(new Font("Verdana", Font.BOLD, 14));
			lblSefora.setBounds(146, 93, 165, 14);
			contentPanel.add(lblSefora);
		}
		{
			lblGian = new JLabel("Gian");
			lblGian.setForeground(SystemColor.textInactiveText);
			lblGian.setBackground(new Color(192, 192, 192));
			lblGian.setFont(new Font("Verdana", Font.BOLD, 14));
			lblGian.setBounds(146, 118, 165, 14);
			contentPanel.add(lblGian);
		}
		{
			lblJose = new JLabel("Jose carlos");
			lblJose.setForeground(SystemColor.textInactiveText);
			lblJose.setBackground(new Color(192, 192, 192));
			lblJose.setFont(new Font("Verdana", Font.BOLD, 14));
			lblJose.setBounds(146, 143, 165, 14);
			contentPanel.add(lblJose);
		}
		{
			lblRicardo = new JLabel("Ricardo");
			lblRicardo.setForeground(SystemColor.textInactiveText);
			lblRicardo.setBackground(new Color(192, 192, 192));
			lblRicardo.setFont(new Font("Verdana", Font.BOLD, 14));
			lblRicardo.setBounds(146, 168, 165, 14);
			contentPanel.add(lblRicardo);
		}
		{
			lblJhimmy = new JLabel("Jhimmy ");
			lblJhimmy.setForeground(SystemColor.textInactiveText);
			lblJhimmy.setBackground(new Color(192, 192, 192));
			lblJhimmy.setFont(new Font("Verdana", Font.BOLD, 14));
			lblJhimmy.setBounds(146, 193, 165, 14);
			contentPanel.add(lblJhimmy);
		}
		
		separator = new JSeparator();
		separator.setBounds(10, 80, 414, 2);
		contentPanel.add(separator);
	
		
	}
}
