package mail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;



public class database {
	// Kết nối vào MySQL.
		 public static Connection getMySQLConnection() throws SQLException,
		         ClassNotFoundException {
		     String hostName = "localhost";
		     String dbName = "test";
		     String userName = "root";
		     String password = "";
		     return getMySQLConnection(hostName, dbName, userName, password);
		 }
		 
		 public static Connection getMySQLConnection(String hostName, String dbName,
		         String userName, String password) throws SQLException,
		         ClassNotFoundException {
		     Class.forName("com.mysql.jdbc.Driver");
		     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		     Connection conn = DriverManager.getConnection(connectionURL, userName, password);    
		     return conn;
		 }
	private Connection con;
	private Statement stn;
	private ResultSet rs;
	public void connect() {
		try {
			con = this.getMySQLConnection();
			stn = con.createStatement();			
		}
        catch(Exception e){
			e.printStackTrace();
		}
	}
	// Kiểm tra tài khoản đã có trong hệ thống hay chưa
	public boolean isRightUser(String user) {
		try {
			this.connect();
			rs = stn.executeQuery("select * from user_tb where user='" + user + "'");
			boolean b = rs.next();
			System.out.println(b);;
			con.close();
			return b;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// Kiểm tra mật khẩu có đúng hay không
	public boolean isRightPass(String user, String pass) {
		try {
			this.connect();
			rs = stn.executeQuery("select pass from user_tb where user='" + user + "'");
			String rs_pass = new String();
			while(rs.next()) rs_pass = rs.getString(1);
			con.close();
			//System.out.println(rs_pass);
			if (rs_pass.compareTo(pass) == 0) return true;
			else return false;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// Kiểm tra chuỗi để khôi phục mật khẩu có đúng hay không
	public boolean isRight_resetPass(String user, String resetPass) {
		try {
			this.connect();
			rs = stn.executeQuery("select resetPass from user_tb where user='" + user + "'");
			String rs_resetPass = new String();
			while(rs.next()) rs_resetPass = rs.getString(1);
			con.close();
			if (rs_resetPass.compareTo(resetPass) == 0) return true;
			else return false;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// Lấy mật khẩu
	public String getPass(String user) {
		try {
			this.connect();
			rs = stn.executeQuery("select pass from user_tb where user='" + user + "'");
			String rs_pass = new String();
			while(rs.next()) rs_pass = rs.getString(1);
			con.close();
			return rs_pass;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	// Tạo mới một tài khoản
	public boolean create_User(String user, String pass, String resetPass , String name) {
		try {
			String key = "";
			String mail = user+"@mailserver.com";
			this.connect();
			stn.executeUpdate("insert into user_tb values('" + name + "','" + pass + "','" + resetPass + "','" + name + "','"  + key + "')");
			con.close();
			return true;
		}
		catch(Exception e) {
					System.out.println(e.getMessage());
		}
		return false;
	}
	
	// Cập nhật mật khẩu mới
	
	
	// Cập nhật chuỗi khôi phục mật khẩu mới
	public void update_resetPass(String user, String resetPass) {
		try {
			this.connect();
			stn.executeUpdate("update user_tb set resetPass='" + resetPass + "' where user='" + user + "'");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String create_User_key(String user) {
		try {
			String key= randomKey();
			this.connect();
			stn.executeUpdate("update user_tb set key_access='" + key + "' where user='" + user + "'");
			con.close();
			return key;
		}
		catch(Exception e) {
			/* e.printStackTrace(); */
		}
		return "";
	}
	public String update_Pass(String key, String pass) {
		try {
			String user= getUsetCookie(key);
			this.connect();
			stn.executeUpdate("update user_tb set pass='" + pass + "' where user='" + user + "'");
			con.close();
			return key;
		}
		catch(Exception e) {
			/* e.printStackTrace(); */
		}
		return "";
	}
	public String update_Key(String key, String keypass) {
		try {
			String user= getUsetCookie(key);
			this.connect();
			stn.executeUpdate("update user_tb set resetPass='" + keypass + "' where user='" + user + "'");
			con.close();
			return key;
		}
		catch(Exception e) {
			/* e.printStackTrace(); */
		}
		return "";
	}
	public String randomKey() {
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 40;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
		return generatedString;
	}
	public boolean saveMail(String key,String to,String date,String subject,String body,String file) {
		try {
			String user = getUsetCookie( key);
			this.connect();
			stn.executeUpdate("insert into mail_tb values('" + to + "','" + date + "','" + subject +"','" + body  +"','"+ user +"','"  + file + "')");
			con.close();
			return true;
		}
		catch(Exception e) {
			 System.out.println(e.getMessage());
		}
		return false;
	}
	public List viewMail(String userMail) {
		try {
			this.connect();
			rs = stn.executeQuery("select * from mail_tb where userMail='" + userMail + "'");
			while (rs.next()) {
				   System.out.println(rs.getString("userMail"));
				   System.out.println(rs.getString("date"));
				   System.out.println(rs.getString("subject"));
				   System.out.println(rs.getString("body"));
				   System.out.println(rs.getString("from"));
				   System.out.println(rs.getString("file"));
			}				      
			con.close();		
		}
		catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			// TODO: handle exception
		}
		return null;
	}
	public String  getUsetCookie(String key) {
		try {
			this.connect();
			rs = stn.executeQuery("select * from user_tb where key_access='" + key + "'");
			String rs_user = new String();
			while(rs.next()) rs_user = rs.getString(1);
			con.close();
			return rs_user;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "";	
	}
	public String getInforCookie(String key) {
		try {
			this.connect();
			rs = stn.executeQuery("select * from user_tb where key_access='" + key + "'");
			String rs_user = new String();
			String rs_pass = new String();
			String rs_resetpass = new String();
			String rs_name = new String();
			while(rs.next()) { 
				rs_user = rs.getString(1);
				rs_pass = rs.getString(2);
				rs_resetpass = rs.getString(3);
				rs_name = rs.getString(4);
			}
			con.close();
			String data = rs_user+"/a/"+rs_pass+"/a/"+rs_resetpass+"/a/"+rs_name;
			System.out.println(data);
			return data;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "";	
	}

	

}

