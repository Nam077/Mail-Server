package mail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class login {

	private JFrame frmLogin;
	private JTextField userNamelg;
	private JLabel lblMtKhu;
	private JPasswordField passWordlg;
	String data = "";

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					login window = new login();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});z
//	}

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public String  initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 606, 405);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		userNamelg = new JTextField();
		userNamelg.setBounds(179, 122, 353, 39);
		frmLogin.getContentPane().add(userNamelg);
		userNamelg.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("T\u00EAn T\u00E0i Kho\u1EA3n");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel.setBounds(65, 120, 104, 36);
		frmLogin.getContentPane().add(lblNewLabel);
		
		lblMtKhu = new JLabel("M\u1EADt Kh\u1EA9u");
		lblMtKhu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMtKhu.setBounds(65, 190, 104, 36);
		frmLogin.getContentPane().add(lblMtKhu);
		
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.dispose();
				data = "register";
			}
		});
		register.setBackground(Color.WHITE);
		
		register.setBounds(308, 274, 92, 29);
		frmLogin.getContentPane().add(register);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userlg =  userNamelg.getText();
				String passlg = passWordlg.getText();
				data = userlg+"/a/"+passlg;	
			}
		});
		
		login.setBackground(Color.WHITE);
		
		login.setBounds(179, 274, 92, 29);
		frmLogin.getContentPane().add(login);
		
		
		JButton quenMk = new JButton("QuenMk");
		quenMk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.dispose();
				data = "forgotpass";
			}
		});
		quenMk.setBackground(Color.WHITE);
		quenMk.setBounds(440, 274, 92, 29);
		frmLogin.getContentPane().add(quenMk);
		
		
		JLabel lblNewLabel_1 = new JLabel("Đăng Nhập Vào Hệ Thống");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(180, 45, 269, 39);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		passWordlg = new JPasswordField();
		passWordlg.setBounds(179, 192, 353, 39);
		frmLogin.getContentPane().add(passWordlg);
		frmLogin.setLocationRelativeTo(null);
		frmLogin.setVisible(true);
		while (data.isEmpty()) {
			System.out.print("");
		}
		return data;
	}
	public void closelogin() {
		frmLogin.dispose();	
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getActionCommand()=="Login") { 
//			String username =  userName.getText().toString();
//			String pass =  passWord.getText().toString();
////			client cli = new client();
////			String s = cli.login(username,pass);
////			System.out.println(s.equals("1"));
////			if (s.equals("1")) {
////				JOptionPane.showMessageDialog(frmLogin, "Sai Mật Khẩu");
////			}
////			else if (s.equals("2")) {
////				JOptionPane.showMessageDialog(frmLogin, "Không Tồn Tại Tài Khoản");
////			}
////			else JOptionPane.showMessageDialog(frmLogin, s);
//		}
//		else if(e.getActionCommand()=="Register") { 
//			frmLogin.setVisible(false);
//			register re =  new register();
//		}
//		else if(e.getActionCommand()=="QuenMk") { 
//			frmLogin.setVisible(false);
//			forgotPass fp = new forgotPass();
//		}
//	}

}
