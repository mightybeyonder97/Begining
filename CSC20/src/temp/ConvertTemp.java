package temp;

public class ConvertTemp {
	
	
	private double celsius;
      
	public ConvertTemp() {
		celsius = 0.0;

	}
	public ConvertTemp(double celsi) {
		celsius  = celsi;
	}
	
	public void setTemp (double cels) {
		celsius = cels;
	}

     public double getTemp() {
	
    	 return celsius;
}

		
	public void convert (double fare) {
		celsius = (double) 5/9* (fare-32);
	
	}


	public String toString() {
		return("C ");
	}
}
