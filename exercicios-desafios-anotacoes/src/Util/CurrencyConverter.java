package Util;

public class CurrencyConverter {
	
	
		public static double dollarConverter(double dollarP, double dollarB ) {
			
			double calc = dollarP * dollarB  ;
			double conversion = calc * 0.06;
			return conversion + calc;
			
		}

		

		
}
