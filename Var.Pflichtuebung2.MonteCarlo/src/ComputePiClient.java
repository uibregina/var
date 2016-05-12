import java.math.*;
import java.rmi.*;

public class ComputePiClient {

    public static void main(String[] args){

        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
    }
        try{
            String name = "//" + args[0] + "ComputePi";
            ComputePiRemote computePiRemote = (ComputePiRemote) Naming.lookup(name);
            
            //Gesamtanzahl der Tropfen
            int g = Integer.parseInt(args[1]);
            BigDecimal v = computePiRemote.computePi(g);
            }
        
        catch (Exception e){
            System.err.println("ComputePiClient exception: " + e.getMessage());
            e.printStackTrace();
            }
        }
}
