import java.math.*;
import java.rmi.*;
import java.rmi.server.*;

@SuppressWarnings("serial")
public class ComputePiServer implements ComputePiRemote {
	
	@Override
	public BigDecimal computePi(int precision) throws RemoteException {
		
		return Pi.computePi(precision);
	}


}
