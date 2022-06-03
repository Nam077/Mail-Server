package mail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class editprofile {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editprofile window = new editprofile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public editprofile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(-7, -42, 652, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EAn T\u00E0i Kho\u1EA3n");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel.setBounds(52, 99, 102, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblHVTn = new JLabel("H\u1ECD V\u00E0 t\u00EAn");
		lblHVTn.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblHVTn.setBounds(52, 140, 102, 31);
		frame.getContentPane().add(lblHVTn);
		
		JLabel lblNewLabel_1_1 = new JLabel("M\u1EADt Kh\u1EA9u");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(52, 222, 102, 31);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblMail.setBounds(52, 181, 102, 31);
		frame.getContentPane().add(lblMail);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("M\u00E3 L\u1EA5y L\u1EA1i M\u1EADt Kh\u1EA9u");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(52, 263, 137, 31);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(194, 99, 365, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(194, 140, 365, 26);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(194, 181, 365, 26);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("Thay \u0110\u1ED5i Th\u00F4ng Tin C\u00E1 Nh\u00E2n");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(206, 33, 255, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Thay M\u1EADt Kh\u1EA9u");
		btnNewButton.setBounds(194, 222, 365, 26);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnThayMi = new JButton("Thay M\u00E3 \u0110\u1ED5i M\u1EADt Kh\u1EA9u");
		btnThayMi.setBounds(194, 263, 365, 26);
		frame.getContentPane().add(btnThayMi);
	}

}
