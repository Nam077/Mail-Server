package mail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;

public class register{
	public register() {
	}
	/**
	 * Launch the application.
	 */

	private static JFrame frame;
	private JTextField name;
	private JTextField username;
	private JPasswordField password;
	private JTextField rspass;
	private JButton submit;
	private JButton login;
	private JButton cancel;
	private JLabel lblNhpLiMt;
	private JPasswordField password2;
	public static String data= "";
	
	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public String initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 592, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD T\u00EAn");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel.setBounds(29, 89, 103, 31);
		frame.getContentPane().add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(171, 93, 343, 30);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblUsername = new JLabel("T\u00EAn \u0110\u0103ng Nh\u1EADp");
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblUsername.setBounds(29, 132, 126, 31);
		frame.getContentPane().add(lblUsername);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(171, 133, 343, 30);
		frame.getContentPane().add(username);
		
		JLabel lblPass = new JLabel("M\u1EADt Kh\u1EA9u");
		lblPass.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPass.setBounds(29, 170, 103, 31);
		frame.getContentPane().add(lblPass);
		
		password = new JPasswordField();
		password.setBounds(172, 173, 342, 31);
		frame.getContentPane().add(password);
		
		JLabel lblMLyMk = new JLabel("M\u00E3 l\u1EA5y MK");
		lblMLyMk.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMLyMk.setBounds(29, 250, 103, 31);
		frame.getContentPane().add(lblMLyMk);
		
		rspass = new JTextField();
		rspass.setColumns(10);
		rspass.setBounds(171, 254, 343, 30);
		frame.getContentPane().add(rspass);
		
		submit = new JButton("\u0110\u0103ng K\u00FD");
		
		submit.setBackground(Color.WHITE);
		submit.setBounds(171, 310, 85, 31);
		frame.getContentPane().add(submit);
		
		login = new JButton("\u0110\u0103ng Nh\u1EADp");
		login.setBackground(Color.WHITE);
		login.setBounds(293, 310, 103, 31);
		frame.getContentPane().add(login);
		
		
		cancel = new JButton("Hu\u1EF7");
		cancel.setBackground(Color.WHITE);
		cancel.setBounds(429, 310, 85, 31);
		frame.getContentPane().add(cancel);
		
		lblNhpLiMt = new JLabel("Nh\u1EADp L\u1EA1i M\u1EADt Kh\u1EA9u");
		lblNhpLiMt.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNhpLiMt.setBounds(29, 213, 184, 31);
		frame.getContentPane().add(lblNhpLiMt);
		
		password2 = new JPasswordField();
		password2.setBounds(172, 213, 342, 31);
		frame.getContentPane().add(password2);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = username.getText();
				String s2 = password.getText();
				String s3 = rspass.getText();
				String s4 = name.getText();
				String s5 = password2.getText();
				if(s3.equals(s5)) {
					data = s1+"/a/"+s2+"/a/"+s3+"/a/"+s4;
					System.out.println(data);
				}
				else JOptionPane.showMessageDialog(frame, "2 mật khẩu không trùng nhau");
			}
		});
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		while (data.isEmpty()) {
			System.out.print("");
		}
		return data;
		
	}
	public static void close() {
		frame.dispose();

	} 


	
}
