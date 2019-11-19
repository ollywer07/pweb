import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Request implements Runnable {
	
	private Socket soc;
	
	public Request(Socket soc) {
		this.soc = soc;
		
	}

	@Override
	public void run() {
		
		try {
			Scanner sn = new Scanner(soc.getInputStream());
			String msg = sn.nextLine().toUpperCase();
			
			PrintWriter pw = new PrintWriter(soc.getOutputStream());
			pw.print(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}
