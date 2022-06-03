package mail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class forgotPass  {
	
	public forgotPass() {
	}

	private JFrame frame;
	private JTextField userName;
	private JTextField ma;
	public static String data ="";

	/**
	 * Launch the application.
	 */

	
	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
 public String initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 589, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTnngNhp = new JLabel("T\u00EAn \u0110\u0103ng Nh\u1EADp");
		lblTnngNhp.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblTnngNhp.setBounds(31, 86, 130, 31);
		panel.add(lblTnngNhp);
		
		JLabel lblMQunMk = new JLabel("M\u00E3 Qu\u00EAn Mk");
		lblMQunMk.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMQunMk.setBounds(31, 158, 103, 31);
		panel.add(lblMQunMk);
		
		userName = new JTextField();
		userName.setBounds(156, 89, 358, 31);
		panel.add(userName);
		userName.setColumns(10);
		
		ma = new JTextField();
		ma.setColumns(10);
		ma.setBounds(156, 161, 358, 31);
		panel.add(ma);
		
		JButton submit = new JButton("L\u1EA5y L\u1EA1i");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = userName.getText();
				String s2 = ma.getText();
				data =  s1+"/a/"+s2;
			}
		});
		submit.setBackground(Color.WHITE);
		
		submit.setBounds(156, 264, 85, 31);
		panel.add(submit);
		
		
		JButton login = new JButton("\u0110\u0103ng Nh\u1EADp");
		login.setBackground(Color.WHITE);
		login.setBounds(266, 264, 140, 31);
		panel.add(login);
		
		JButton register = new JButton("\u0110\u0103ng K\u00FD");
		register.setBackground(Color.WHITE);
		register.setBounds(429, 264, 85, 31);
		panel.add(register);
		
		
		JLabel lblNewLabel_1 = new JLabel("Qu\u00EAn M\u1EADt Kh\u1EA9u");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(231, 21, 152, 39);
		panel.add(lblNewLabel_1);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		while (data.isEmpty()) {
			System.out.print("");
		}
		return data;
	}
 	public void closefg() {
 		frame.dispose();	
	}

}
