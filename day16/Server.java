package day16;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Server {
	ServerSocket ss;BufferedReader br,in;PrintWriter out;
	Server no;
	Socket s;
	private ExecutorService executorService = Executors.newFixedThreadPool(10);
	List<ServerSocket> clients = new ArrayList<ServerSocket>();
	
	public Server() throws Exception{
		
		ss=new ServerSocket(2000);
		System.out.println("Server ready.....");
		while(true) {
			s=ss.accept();
		//	clients.add(ss);
			executorService.submit(new ServiceRequest(s));
			
		}
	}
	
	class ServiceRequest implements Runnable {

        private Socket socket;

        public ServiceRequest(Socket connection) {
            this.socket = connection;
        }

        public void run() {
        	try {
				out=new PrintWriter(s.getOutputStream(),true);
				in=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Message For Client..:");
				String msgToClient = null;
				msgToClient = in.readLine();
				out.println(msgToClient);
				br=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msg=br.readLine();
				System.out.println("Message From Client..:"+msg);
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
            }
        } 
	
//	void broadcast() {
//		
//		System.out.println("Broadcast a message::");
//		String msg=br.readLine();
//		
//	
//		  for(int i = clients.size(); --i >=0; ) {
//		
//			  ServerSocket st = clients.get(i);
//			  out=new PrintWriter(st.getOutputStream(),true);
//		
//		     if(Thread.currentThread().isAlive())
//		
//		        st.println(msg);
//		
//		     else
//		
//		    	 clients.remove(i);
//	
//		  }
//
//	}
	
	
	public static void main(String[] args) throws Exception{
		new Server();
	}
}
