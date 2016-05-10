import java.math.*;
import javax.naming.*;

public class ComputePiClient {

	public static void main(String[] args) {
		
		if(System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		
		
		try {
			String name = "/ComputePi";
			ComputePiRemote computePiRemote = (ComputePiRemote) new InitialContext().lookup(name);
			BigDecimal pi = computePiRemote.computePi(Integer.parseInt(args[0]));
			System.out.println(pi);
		}
		
		catch(Exception e) {
			System.err.println("ComputePiClient exception: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
