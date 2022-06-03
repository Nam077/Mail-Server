package mail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sendmail {

	private JFrame framemail;
	private JTextField to;
	private JTextField sub;
	String mesege = "";

	/**
	 * @wbp.parser.entryPoint
	 */
	public String initialize() {
		framemail = new JFrame();
		framemail.setBounds(100, 100, 682, 408);
		framemail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framemail.getContentPane().setLayout(null);
		
		to = new JTextField();
		to.setBounds(129, 40, 483, 19);
		framemail.getContentPane().add(to);
		to.setColumns(10);
		
		sub = new JTextField();
		sub.setColumns(10);
		sub.setBounds(129, 63, 483, 19);
		framemail.getContentPane().add(sub);
		
		JTextArea body = new JTextArea();
		body.setBounds(129, 120, 483, 198);
		framemail.getContentPane().add(body);
		
		JButton send = new JButton("Send Mail");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tos = to.getText();
				String subs = sub.getText();
				String bodys =  body.getText();
				mesege = tos+"/a/"+subs+"/a/"+bodys;	
			}
		});
		send.setBackground(Color.WHITE);
		send.setBounds(129, 328, 120, 33);
		framemail.getContentPane().add(send);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(311, 328, 120, 33);
		framemail.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(492, 328, 120, 33);
		framemail.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("To");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel.setBounds(68, 26, 64, 31);
		framemail.getContentPane().add(lblNewLabel);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSubject.setBounds(68, 55, 64, 31);
		framemail.getContentPane().add(lblSubject);
		
		JLabel lblBody = new JLabel("Body");
		lblBody.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblBody.setBounds(127, 86, 64, 31);
		framemail.getContentPane().add(lblBody);
		framemail.setVisible(true);
		while (mesege.isEmpty()) {
			System.out.print("");
		}
		return mesege;
	}
	public void close() {
		framemail.dispose();
	}
}
