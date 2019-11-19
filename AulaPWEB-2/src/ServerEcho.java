import java.net.ServerSocket;
import java.net.Socket;



public class ServerEcho {

	public static void main(String[] args) throws Exception {	
		
		int porta = 1234;
		
		ServerSocket soc = new ServerSocket(porta);
		
		while(true) {
			
			Socket sc = soc.accept();
			Thread t = new Thread((Runnable) new Request(sc));
			t.start();
		}
		
		
	}

}
