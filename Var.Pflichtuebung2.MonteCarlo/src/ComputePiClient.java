import java.math.*;
import java.rmi.Naming;

import javax.naming.*;

public class ComputePiClient {

    public static void main(String[] args){

        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
    }
        try{
            String name = "ComputePi";
            ComputePiRemote computePiRemote = (ComputePiRemote) Naming.lookup(name);
            BigDecimal pi = computePiRemote.computePi(Integer.parseInt(args[0]));
            System.out.println(pi);
            
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
