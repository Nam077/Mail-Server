package mail;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.*;
import java.net.*;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class servera {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					servera window = new servera();
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
	public servera() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Ch\u1EA1y Sever");
		
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(25, 344, 290, 33);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea view = new JTextArea();
		view.setBorder(new LineBorder(new Color(0, 0, 0)));
		view.setBounds(30, 27, 610, 307);
		frame.getContentPane().add(view);
		
		JButton btnDngServer = new JButton("D\u1EEBng Server");
		btnDngServer.setBackground(Color.WHITE);
		btnDngServer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDngServer.setBounds(325, 344, 310, 33);
		frame.getContentPane().add(btnDngServer);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				runserver();			
				view.append("Server đã chạy");
			}
		});
	}
	public void runserver() {
		ServerSocket listener = null;
	       String line;
	       BufferedReader is;
	       BufferedWriter os;
	       Socket socketOfServer = null;
	       try {
	           listener = new ServerSocket(9999);
	       } catch (IOException e) {
	           System.out.println(e);
	           System.exit(1);
	       }		 
	       try {
	           
	           JOptionPane.showMessageDialog(frame, "Server đã chạy");

	           // Chấp nhận một yêu cầu kết nối từ phía Client.
	           // Đồng thời nhận được một đối tượng Socket tại server.
	           while(true) {
	        	   socketOfServer = listener.accept();
		           System.out.println("Accept a client!");
		           // Mở luồng vào ra trên Socket tại Server.
		           is = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
		           os = new BufferedWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));        
		           // Nhận được dữ liệu từ người dùng và gửi lại trả lời.
		           line = is.readLine();
		           socketserver server_ = new socketserver();
	               // Ghi vào luồng đầu ra của Socket tại Server.
	               // (Nghĩa là gửi tới Client).
	               os.write(server_.method(line));
	               // Kết thúc dòng
	               os.newLine();
	               // Đẩy dữ liệu đi
	               os.flush();  
	           }
	       } catch (IOException e) {
	           System.out.println(e);
	           e.printStackTrace();
	       }
	       System.out.println("Sever stopped!");
	   
	}
}
