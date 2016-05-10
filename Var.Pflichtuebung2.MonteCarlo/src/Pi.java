import java.math.BigDecimal;


public class Pi {

	public static BigDecimal computePi(int precision, String[] args) {
		
		// Gesamtzahl der Tropfen
		int g = Integer.parseInt(args[0]);
		// Tropfen im Viertelkreis
		int v = 0;
		// Koordinaten des Punktes P
		double x;
		double y;
		
		System.out.println("Monte Carlo Methode");
		System.out.println("Naeherung fuer Pi: ");
		
		for(int i = 1; i <= g; i++) {
			x = Math.random();
			y = Math.random();
			
			if(Math.hypot(x, y) <= 1)
				v = v + 1;
		}
		
		double pi = 4 * (double)v/g;
		System.out.printf("%d Tropfen, davon %d Tropfen in Viertelkreis, Pi etwa %g%n", g,v,pi);
		
		return null;
	}

}
