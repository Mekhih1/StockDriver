package Chapter9;

public class Stock {

	
		String symbol; 
		String name;
		double previousClosingPrice;
		double currentPrice;
		
	 public Stock(String symbol, String name, double previousPriceChange, double currentPrice) {
			this.symbol = symbol;
			this.name = name;
			this.previousClosingPrice = previousPriceChange;
			this.currentPrice = currentPrice;
		}
		
		public double getChangePercent() {
			return (currentPrice - previousClosingPrice ) * 1; 
			
			
		}
	
	
	
	
	
	
}
