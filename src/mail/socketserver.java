	package mail;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.net.ServerSocket;
	import java.net.Socket;
	
	public class socketserver {
		String[] st1;
		String s;
		database db =new database();
		 public String method(String data) {
			 System.out.println(data);
			 st1 = data.split("/a/",100);
			 System.out.println(st1[1]);
			 String fun = st1[0];
			if(! data.isEmpty()) {	
				if(fun.equals("login")) {
//				bhnn
					 System.out.println(st1[1]);
					 for (int i =0;i<st1.length;i++) {
							System.out.println(st1[i]);
						}
				  {
					  if(db.isRightUser(st1[1])) {
						  	if(db.isRightPass(st1[1],st1[2]) ) {
								String key = db.create_User_key(st1[1]);	
								return key;
						  	}		  	
						  	else {
						  		s = "1";
						  		return s ;
						  	}
					}
					  else {
						  s = "2";
						  return s;
					  }	
					
				}
				}
				else if (fun.equals("register")){
					if ( db.isRightUser(st1[1]) == false) {
						db.create_User(st1[1], st1[2],st1[3],st1[4]);
						return "1a";
						}
					else return "1b";
					}
				else if (fun.equals("changepass")){
						db.update_Pass(st1[1], st1[2]);
					}
				else if (fun.equals("changekey")){
					
					
						db.update_Key(st1[1], st1[2]);
					}
				else if (fun.equals("resetpass")) {
					{
						  if(db.isRightUser(st1[1])) {
							  	if(db.isRight_resetPass(st1[1],st1[2]) ) {
									return db.getPass(st1[1]);
							  	}	  	
							  	else {
							  		s = "1";
							  		return s ;
							  	}
						}
						  else {
							  s = "2";
							  return s;
						  }				
					}	
				}
				else if (fun.equals("sendmail")) {	
					for (int i =0;i<st1.length;i++) {
						System.out.println("S["+i+"]= "+st1[i]);
					}
					if(db.isRightUser(st1[4])) {
						
							db.saveMail(st1[1], st1[4], st1[3], st1[2], st1[5],st1[6]);
							return "1";
						}
					}
					else return "2";
				}
				
			
			return "";		
		 				
		 }
	}
