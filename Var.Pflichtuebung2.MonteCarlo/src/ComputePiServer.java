import java.math.BigDecimal;
import java.rmi.*;
import java.rmi.server.*;

@SuppressWarnings("serial")
public class ComputePiServer extends UnicastRemoteObject implements ComputePiRemote {
	
	protected ComputePiServer() throws RemoteException{
		super(); 
	}
	
	@Override
	public BigDecimal computePi(int g) throws RemoteException {
		// Tropfen im Viertelkreis
		int v=0;
		// Koordinaten des Punktes P
		double x;
		double y;
		System.out.println("Monte Carlo Methode");
		System.out.println("Naeherung fuer Pi: ");
				
		for(int i = 0; i < g; i++) {
			x = Math.random();
			y = Math.random();
					
			if(Math.hypot(x, y) < 1){
				v = v + 1;
			}
		}	
		double pi = 4*(double)v / g;
			System.out.printf("%d Tropfen, davon %d  Tropfen im Viertelkreis, Pi etwa %g%n", g, v, pi);
		    return new BigDecimal(pi);	
	}


}
