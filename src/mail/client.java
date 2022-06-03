package mail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import java.awt.Canvas;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class client{
	public static String key = "";
	public static String a = "";
	public static String mesege = "";
	private static JFrame frame_cl;
	private static JTextField mailuser;
	private static JTextField subjects;
	private static JTextField userName;
	private static JTextField name;
	private static JTextField mailname;
	private static JPasswordField passold;
	private static JPasswordField passnew;
	private static JTextField keyold;
	private static JTextField keynew;
	private static Panel edit;
	private static Panel login_pn;
	private static JTextField userName_lg;
	private static JPasswordField pass_lg;
	private static JTextField name_rs;
	private static JTextField user_rs;
	private static JPasswordField pass1_rs;
	private static JTextField key_rs;
	private static JPasswordField pass2_rs;
	private static JTextField user_fg;
	private static JTextField key_fg;
	private static JTextField pass_fg;
	private static JTextField to;
	private static JTable table;

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
	private static void initialize(String s,String name_,String passold_a, String keyold_a) {
		frame_cl = new JFrame();
		frame_cl.getContentPane().setEnabled(false);
		frame_cl.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame_cl.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JPanel sendmail = new JPanel();
		sendmail.setBounds(10, 12, 673, 144);
		layeredPane.add(sendmail);
		sendmail.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mail Của bạn");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(69, 23, 137, 37);
		sendmail.add(lblNewLabel);
		
		
		
		mailuser = new JTextField();
		mailuser.setEditable(false);
		mailuser.setBounds(232, 25, 397, 37);
		sendmail.add(mailuser);
		mailuser.setColumns(10);
		mailuser.setText(s+"@mailserver.com");
		
		JButton senmailbtn = new JButton("Gửi Mail");
		
		senmailbtn.setBackground(Color.WHITE);
		senmailbtn.setBounds(38, 77, 128, 37);
		sendmail.add(senmailbtn);
		
		JButton viewmail = new JButton("Xem Mail");
		viewmail.setBackground(Color.WHITE);
		viewmail.setBounds(185, 77, 128, 37);
		sendmail.add(viewmail);
		
		JButton editinfor = new JButton("Thay Đổi Thông Tin");
		
		editinfor.setBackground(Color.WHITE);
		editinfor.setBounds(327, 77, 164, 37);
		sendmail.add(editinfor);
		
		JButton logout = new JButton("New button");
		logout.setBackground(Color.WHITE);
		logout.setBounds(501, 77, 128, 37);
		sendmail.add(logout);
		
		edit = new Panel();
		edit.setBackground(Color.WHITE);
		edit.setBounds(10, 162, 673, 398);
		layeredPane.add(edit);
		edit.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("T\u00EAn T\u00E0i Kho\u1EA3n");
		lblNewLabel_2.setBounds(67, 100, 102, 31);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		edit.add(lblNewLabel_2);
		
		JLabel lblHVTn = new JLabel("H\u1ECD V\u00E0 t\u00EAn");
		lblHVTn.setBounds(67, 145, 102, 31);
		lblHVTn.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		edit.add(lblHVTn);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mật Khẩu Cũ");
		lblNewLabel_1_1.setBounds(67, 221, 102, 31);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		edit.add(lblNewLabel_1_1);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setBounds(67, 186, 102, 31);
		lblMail.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		edit.add(lblMail);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("M\u00E3 L\u1EA5y L\u1EA1i M\u1EADt Kh\u1EA9u");
		lblNewLabel_1_1_1.setBounds(67, 296, 137, 31);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		edit.add(lblNewLabel_1_1_1);
		
		userName = new JTextField();
		userName.setBounds(233, 104, 365, 26);
		userName.setEditable(false);
		userName.setColumns(10);
		edit.add(userName);
		
		name = new JTextField();
		name.setBounds(233, 145, 365, 26);
		name.setEditable(false);
		name.setColumns(10);
		edit.add(name);
		
		mailname = new JTextField();
		mailname.setBounds(233, 186, 365, 26);
		mailname.setEditable(false);
		mailname.setColumns(10);
		edit.add(mailname);
		
		JLabel lblNewLabel_1_2 = new JLabel("Thay \u0110\u1ED5i Th\u00F4ng Tin C\u00E1 Nh\u00E2n");
		lblNewLabel_1_2.setBounds(245, 38, 255, 39);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		edit.add(lblNewLabel_1_2);
		
		Panel mail = new Panel();
		mail.setBackground(Color.WHITE);
		mail.setBounds(9, 162, 673, 398);
		layeredPane.add(mail);
		mail.setLayout(null);
		
		
		subjects = new JTextField();
		subjects.setColumns(10);
		subjects.setBounds(132, 14, 483, 33);
		mail.add(subjects);
		
		JButton sendmail_sm = new JButton("Gửi Mail");
		sendmail_sm.setBackground(Color.WHITE);
		sendmail_sm.setBounds(132, 340, 120, 33);
		mail.add(sendmail_sm);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(314, 340, 120, 33);
		mail.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("New button");
		btnNewButton_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1.setBounds(495, 340, 120, 33);
		mail.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("To");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(71, 12, 64, 31);
		mail.add(lblNewLabel_1);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSubject.setBounds(71, 55, 64, 31);
		mail.add(lblSubject);
		
		JLabel lblBody = new JLabel("Body");
		lblBody.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblBody.setBounds(132, 83, 64, 31);
		mail.add(lblBody);
		
		to = new JTextField();
		to.setBounds(131, 55, 484, 31);
		mail.add(to);
		to.setColumns(10);
		
		JTextArea body = new JTextArea();
		body.setBorder(new LineBorder(new Color(0, 0, 0)));
		body.setBounds(132, 109, 483, 209);
		body.setLineWrap(true);
		body.setWrapStyleWord(true);
		mail.add(body);
		JButton editpass = new JButton("Thay Mật Khẩu");
		editpass.setBounds(474, 259, 124, 31);

		
		editpass.setBackground(Color.WHITE);
		edit.add(editpass);
		
		passold = new JPasswordField();
		passold.setBounds(233, 222, 365, 31);
		edit.add(passold);
		
		passnew = new JPasswordField();
		passnew.setBounds(233, 260, 231, 30);
		edit.add(passnew);
		
		keyold = new JTextField();
		keyold.setBounds(233, 296, 365, 31);
		edit.add(keyold);
		keyold.setColumns(10);
		
		keynew = new JTextField();
		keynew.setBounds(233, 336, 231, 31);
		keynew.setColumns(10);
		edit.add(keynew);
		
		JButton editkey = new JButton("Thay Mã");
		editkey.setBounds(474, 336, 124, 31);
		
		editkey.setBackground(Color.WHITE);
		edit.add(editkey);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Mật Khẩu Mới");
		lblNewLabel_1_1_2.setBounds(67, 258, 102, 31);
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		edit.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mã Lấy Lại Mật Khẩu Mới");
		lblNewLabel_1_1_1_1.setBounds(67, 335, 156, 31);
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		edit.add(lblNewLabel_1_1_1_1);
		
		name.setText(name_);
		userName.setText(s);
		mailname.setText(s+"@mailserver.com");
		
		JPanel login_pn = new JPanel();
		login_pn.setBackground(Color.WHITE);
		login_pn.setBounds(12, 162, 671, 398);
		layeredPane.add(login_pn);
		login_pn.setLayout(null);
		
		userName_lg = new JTextField();
		userName_lg.setColumns(10);
		userName_lg.setBounds(228, 156, 353, 39);
		login_pn.add(userName_lg);
		
		JLabel lblNewLabel_3 = new JLabel("Tên Tài Khoản");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(114, 154, 104, 36);
		login_pn.add(lblNewLabel_3);
		
		JLabel lblMtKhu = new JLabel("Mật Khẩu");
		lblMtKhu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMtKhu.setBounds(114, 224, 104, 36);
		login_pn.add(lblMtKhu);
		
		JButton register = new JButton("Register");
		register.setBackground(Color.WHITE);
		register.setBounds(357, 308, 92, 29);
		login_pn.add(register);
		
		JButton login = new JButton("Login");
		login.setBackground(Color.WHITE);
		login.setBounds(228, 308, 92, 29);
		login_pn.add(login);
		
		JButton quenMk = new JButton("QuenMk");
		quenMk.setBackground(Color.WHITE);
		quenMk.setBounds(489, 308, 92, 29);
		login_pn.add(quenMk);
		
		JLabel lblNewLabel_1_3 = new JLabel("Đăng Nhập Vào Hệ Thống");
		lblNewLabel_1_3.setForeground(Color.RED);
		lblNewLabel_1_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(229, 79, 269, 39);
		login_pn.add(lblNewLabel_1_3);
		
		pass_lg = new JPasswordField();
		pass_lg.setBounds(228, 226, 353, 39);
		login_pn.add(pass_lg);
		
		JPanel rg_pn = new JPanel();
		rg_pn.setLayout(null);
		rg_pn.setBackground(Color.WHITE);
		rg_pn.setBounds(9, 162, 671, 398);
		layeredPane.add(rg_pn);
		
		JLabel lblNewLabel_4 = new JLabel("Họ Tên");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(101, 96, 103, 31);
		rg_pn.add(lblNewLabel_4);
		
		name_rs = new JTextField();
		name_rs.setColumns(10);
		name_rs.setBounds(243, 100, 343, 30);
		rg_pn.add(name_rs);
		
		JLabel lblUsername = new JLabel("Tên Đăng Nhập");
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblUsername.setBounds(101, 139, 126, 31);
		rg_pn.add(lblUsername);
		
		user_rs = new JTextField();
		user_rs.setColumns(10);
		user_rs.setBounds(243, 140, 343, 30);
		rg_pn.add(user_rs);
		
		JLabel lblPass = new JLabel("Mật Khẩu");
		lblPass.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPass.setBounds(101, 177, 103, 31);
		rg_pn.add(lblPass);
		
		pass1_rs = new JPasswordField();
		pass1_rs.setBounds(244, 180, 342, 31);
		rg_pn.add(pass1_rs);
		
		JLabel lblMLyMk = new JLabel("Mã lấy MK");
		lblMLyMk.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMLyMk.setBounds(101, 257, 103, 31);
		rg_pn.add(lblMLyMk);
		
		key_rs = new JTextField();
		key_rs.setColumns(10);
		key_rs.setBounds(243, 261, 343, 30);
		rg_pn.add(key_rs);
		
		JButton submit = new JButton("Đăng Ký");
		
		submit.setBackground(Color.WHITE);
		submit.setBounds(243, 317, 85, 31);
		rg_pn.add(submit);
		
		JButton login_1 = new JButton("Đăng Nhập");
		login_1.setBackground(Color.WHITE);
		login_1.setBounds(340, 317, 103, 31);
		rg_pn.add(login_1);
		
		JButton qmk_rg = new JButton("Quên Mật Khẩu");
		qmk_rg.setBackground(Color.WHITE);
		qmk_rg.setBounds(455, 317, 131, 31);
		rg_pn.add(qmk_rg);
		
		JLabel lblNhpLiMt = new JLabel("Nhập Lại Mật Khẩu");
		lblNhpLiMt.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNhpLiMt.setBounds(101, 220, 184, 31);
		rg_pn.add(lblNhpLiMt);
		
		pass2_rs = new JPasswordField();
		pass2_rs.setBounds(244, 220, 342, 31);
		rg_pn.add(pass2_rs);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Đăng ký tài khoản");
		lblNewLabel_1_2_1.setForeground(Color.RED);
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(278, 35, 173, 39);
		rg_pn.add(lblNewLabel_1_2_1);
		
		JPanel fg_pn = new JPanel();
		fg_pn.setBackground(Color.WHITE);
		fg_pn.setBounds(9, 161, 674, 399);
		layeredPane.add(fg_pn);
		fg_pn.setLayout(null);
		
		JLabel lblTnngNhp = new JLabel("Tên Đăng Nhập");
		lblTnngNhp.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblTnngNhp.setBounds(84, 135, 130, 31);
		fg_pn.add(lblTnngNhp);
		
		JLabel lblNewLabel_1_4 = new JLabel("Quên Mật Khẩu");
		lblNewLabel_1_4.setForeground(Color.RED);
		lblNewLabel_1_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(284, 69, 152, 39);
		fg_pn.add(lblNewLabel_1_4);
		
		user_fg = new JTextField();
		user_fg.setColumns(10);
		user_fg.setBounds(209, 138, 358, 31);
		fg_pn.add(user_fg);
		
		key_fg = new JTextField();
		key_fg.setColumns(10);
		key_fg.setBounds(209, 181, 358, 31);
		fg_pn.add(key_fg);
		
		JLabel lblMQunMk = new JLabel("Mã Quên Mk");
		lblMQunMk.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMQunMk.setBounds(84, 178, 103, 31);
		fg_pn.add(lblMQunMk);
		
		JButton submit_fg = new JButton("Lấy Lại");
		submit_fg.setBackground(Color.WHITE);
		submit_fg.setBounds(209, 280, 85, 31);
		fg_pn.add(submit_fg);
		
		JButton login_fg = new JButton("Đăng Nhập");
		login_fg.setBackground(Color.WHITE);
		login_fg.setBounds(314, 280, 140, 31);
		fg_pn.add(login_fg);
		
		JButton rg_fg = new JButton("Đăng Ký");
		rg_fg.setBackground(Color.WHITE);
		rg_fg.setBounds(466, 280, 85, 31);
		fg_pn.add(rg_fg);
		
		pass_fg = new JTextField();
		pass_fg.setColumns(10);
		pass_fg.setBounds(209, 227, 358, 31);
		fg_pn.add(pass_fg);
		
		JLabel lblMQunMk_1 = new JLabel("Mật Khẩu");
		lblMQunMk_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMQunMk_1.setBounds(84, 224, 103, 31);
		fg_pn.add(lblMQunMk_1);
		
		rg_pn.setVisible(false);
		login_pn.setVisible(false);
		mail.setVisible(false);
		sendmail.setVisible(false);
		
		if(s.isEmpty()) {
		login_pn.setVisible(true);
		}
		else {
			sendmail.setVisible(true);
		}
		senmailbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edit.setVisible(false);
				mail.setVisible(true);
				
			}
		});
		login_fg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fg_pn.setVisible(false);
				login.setVisible(true);
				
			}
		});
		login_fg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fg_pn.setVisible(false);
				rg_pn.setVisible(true);
				
			}
		});
		quenMk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				login_pn.setVisible(false);
				fg_pn.setVisible(true);
				
			}
		});
		editinfor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mail.setVisible(false);
				edit.setVisible(true);
			}
		});
		
		sendmail_sm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tomail = to.getText();
				String subs = subjects.getText();
				String bodys =  body.getText();
				System.out.println(tomail);
				System.out.println(subs);
				System.out.println(bodys);
					if(!tomail.isEmpty()) {
						if(!subs.isEmpty()) {
							if(!bodys.isEmpty()) {
								LocalDateTime myDateObj = LocalDateTime.now();      
							    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");    
							    String formattedDate = myDateObj.format(myFormatObj); 
								 String date = formattedDate;
								 sendMail(tomail,date,subs,bodys,"");
								 
							}
						}
					}
			}
		});
		editpass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passold_ = passold.getText();
				String passnew_ = passnew.getText();
				if(!passold_.isEmpty()) {
					if(!passnew_.isEmpty()) {
						if(passold_.equals(passold_)) {
							changePass(key, passnew_);
							JOptionPane.showMessageDialog(frame_cl, "Đã thay đổi thành công");
							passnew.setText("");
							passold.setText("");
						}
						else JOptionPane.showMessageDialog(frame_cl, "Mật khẩu cũ không đúng");
					}
					else JOptionPane.showMessageDialog(frame_cl, "Chưa nhập mật khẩu cũ");
				}
				else JOptionPane.showMessageDialog(frame_cl, "Chưa nhập mật khẩu mới");
			}
		});
		editkey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passold_ = keyold.getText();
				String passnew_ = keynew.getText();
				if(!passold_.isEmpty()) {
					if(!passnew_.isEmpty()) {
						if(passold_.equals(passold_)) {
							changeKey(key, passnew_);
							JOptionPane.showMessageDialog(frame_cl, "Đã thay đổi thành công");
							keyold.setText("");
							keynew.setText("");
						}
						else JOptionPane.showMessageDialog(frame_cl, "Mã cũ không đúng");
					}
					else JOptionPane.showMessageDialog(frame_cl, "Chưa nhập mã cũ");
				}
				else JOptionPane.showMessageDialog(frame_cl, "Chưa nhập mã mới");
			
			
		}
		}
		);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(key);
				// TODO Auto-generated method stub
				String username = userName_lg.getText();
				String pass = pass_lg.getText();
				String hehe = login(username, pass);
				if(!username.isEmpty()) {
						if(!pass.isEmpty()) {
						if (hehe.equals("1")) {
							JOptionPane.showMessageDialog(frame_cl, "Sai mật khẩu vui lòng đăng nhập lại");
						}
						else if(hehe.equals("2")) {
							JOptionPane.showMessageDialog(frame_cl, "Tài khoản không tồn tại");
						}
						else {
							JOptionPane.showMessageDialog(frame_cl, "Đăng nhập thành công");
							key = hehe;
						}
					}
						else JOptionPane.showMessageDialog(frame_cl, " Vui Lòng Nhập Mật Khẩu");
				}
				else JOptionPane.showMessageDialog(frame_cl, "Vui Lòng Nhập Tài Khoản");
			}
		});
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_pn.setVisible(false);
				rg_pn.setVisible(true);
				
				
			}
		});
		login_1.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				
				rg_pn.setVisible(false);
				login_pn.setVisible(true);
			}
		});
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = name_rs.getText();
				String s2 = user_rs.getText();
				String s3 = pass1_rs.getText();
				String s4 = pass2_rs.getText();
				String s5 = key_rs.getText();
				if(!s1.isEmpty()) {
					if(!s2.isEmpty()) {
						if(!s3.isEmpty()) {
							if(!s4.isEmpty()) {
								if(!s5.isEmpty()) {
									if(s3.equals(s4)) {
										String s = register(s1, s3, s5, s1);
										if (s.equals("1a")) {
											JOptionPane.showMessageDialog(frame_cl, "Tài Khoản Đã Tồn Tại");
											
										}
										else 
										{
											JOptionPane.showMessageDialog(frame_cl, "Tạo Tài Khoản Thành Công");
											rg_pn.setVisible(false);
											login_pn.setVisible(true);
										}
										
									}
									else JOptionPane.showMessageDialog(frame_cl, "Hai mật khẩu không giống nhau");
								}
								else JOptionPane.showMessageDialog(frame_cl, "Vui Lòng Nhập Mã Quên Mật Khẩu");
							}
							else JOptionPane.showMessageDialog(frame_cl, "Vui Lòng Nhập Mật Khẩu 2");
						}
						else JOptionPane.showMessageDialog(frame_cl, "Vui Lòng Nhập Mật Khẩu 2");
					}
					else JOptionPane.showMessageDialog(frame_cl, "Vui Lòng Nhập Tài Khoản");
				}
				else JOptionPane.showMessageDialog(frame_cl, "Vui Lòng Nhập Họ Tên");
			}
		});
		pass_fg.setEditable(false);
		
		Panel panel = new Panel();
		panel.setBounds(709, 161, 673, 399);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("Dialog", Font.PLAIN, 13));
		table.setSurrendersFocusOnKeystroke(true);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"sdf", "sdfds", "sdf"},
				{"sdfsdf", "sdf", "sdf"},
				{"sdf", "sdf", "sdf"},
				{"sdf", "sdf", "sdf"},
				{"sdf", "sdf", "sdf"},
				{null, "sdf", "sdf"},
			},
			new String[] {
				"From", "Subject", "Body"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(162);
		table.getColumnModel().getColumn(1).setPreferredWidth(176);
		table.getColumnModel().getColumn(2).setPreferredWidth(163);
		table.setBackground(Color.WHITE);
		table.setBounds(429, 252, -304, -81);
		panel.add(table);
		submit_fg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(key);
				// TODO Auto-generated method stub
				String username = user_fg.getText();
				String pass = key_fg.getText();
				String hehe = resetpass(username, pass);
				if(!username.isEmpty()) {
						if(!pass.isEmpty()) {
						if (hehe.equals("1")) {
							JOptionPane.showMessageDialog(frame_cl, "Sai mã quên mật khẩu vui lòng đăng nhập lại");
						}
						else if(hehe.equals("2")) {
							JOptionPane.showMessageDialog(frame_cl, "Tài khoản không tồn tại");
						}
						else {
							JOptionPane.showMessageDialog(frame_cl, "Mật khẩu của bạn là"+hehe);
							pass_fg.setText(hehe);
							
						}
					}
						else JOptionPane.showMessageDialog(frame_cl, " Vui Lòng Nhập mã quên mật Khẩu");
				}
				else JOptionPane.showMessageDialog(frame_cl, "Vui Lòng Nhập Tài Khoản");
			}
		});
		edit.setVisible(false);
		fg_pn.setVisible(false);
		frame_cl.setBounds(100, 100, 1461, 608);
		frame_cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_cl.setVisible(true);
		frame_cl.setLocationRelativeTo(null);
	}
	

	/**
	 * @wbp.parser.entryPoint
	 */
	
	public static String login(String userName, String password) {
		return clientSocket.sendData("login/a/"+userName+"/a/"+password);
	}
	public static String register(String userName, String password, String resetPass, String name ) {
		return clientSocket.sendData("register/a/"+userName+"/a/"+password+"/a/"+resetPass+"/a/"+name);
	}
	public static String resetpass(String userName,  String resetPass ) {
		return clientSocket.sendData("resetpass/a/"+userName+"/a/"+resetPass);
	}
	public static String sendMail(String to2, String date,String subjects2, String body, String file) {
		return clientSocket.sendData("sendmail/a/"+key+"/a/"+to2+"/a/"+date+"/a/"+subjects2+"/a/"+body+"/a/"+file);
	}
	public static String changePass(String key, String pass) {
		return clientSocket.sendData("changepass/a/"+key+"/a/"+pass);
	}
	public static String changeKey(String key, String passkey) {
		return clientSocket.sendData("changekey/a/"+key+"/a/"+passkey);
	}
	public static String register_a() {
		register register =  new register();
		String data = register.initialize();
		String [] rs1;
		rs1 = data.split("/a/",100);
		for (int i =0;i<rs1.length;i++) {
			System.out.println(rs1[i]);
		}
		String S = register(rs1[0], rs1[1], rs1[2], rs1[3]);
		System.out.println(S);
		return S;
	}
	public void loginpn() {
		login_pn.setVisible(false);
	}
	public static void discopefr () {
		frame_cl.dispose();
		
	}
public static void main(String[] args) {
		
		database db = new database();
		// TODO Auto-generated method stub
		clientSocket clientsocket = new clientSocket();
		if(key.isEmpty()) {
			initialize("", "", "", "");
			while (key.isEmpty()) {
				System.out.print("");
			}
		}	
			discopefr();
			String user = db.getUsetCookie(key);
			String infor = db.getInforCookie(key);
			String[] inf;
			inf = infor.split("/a/",100);
			for(int i =0; i<inf.length;i++) {
				System.out.println("S["+i+"]"+inf[i]);
			}
			initialize(inf[0], inf[3], inf[1], inf[2]);
}
}
