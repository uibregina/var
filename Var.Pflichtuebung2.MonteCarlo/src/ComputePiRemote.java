import java.math.BigDecimal;
import java.rmi.*;

public interface ComputePiRemote extends Remote {
	
	BigDecimal computePi(int g) throws RemoteException;

}
