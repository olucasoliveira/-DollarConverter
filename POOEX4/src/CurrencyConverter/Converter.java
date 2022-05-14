package CurrencyConverter;

public class Converter {
	
	public static final double IOF = 0.06;
	
	
	
	public static double converter(double dollarToBought, double dollarPrice) {
		return (dollarToBought * dollarPrice )* (1+IOF);
	}
	
}
