package mail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class server {		 
		   public static void main(String args[]) {
		 
		       ServerSocket listener = null;
		       String line;
		       BufferedReader is;
		       BufferedWriter os;
		       Socket socketOfServer = null;
		       // Mở một ServerSocket tại cổng 9999.
		       // Chú ý bạn không thể chọn cổng nhỏ hơn 1023 nếu không là người dùng
		       // đặc quyền (privileged users (root)).
		       try {
		           listener = new ServerSocket(9999);
		       } catch (IOException e) {
		           System.out.println(e);
		           System.exit(1);
		       }		 
		       try {
		           System.out.println("Server is waiting to accept user...");		 
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