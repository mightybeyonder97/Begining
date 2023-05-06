package temp;

public class refresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ConvertTemp conversion = new ConvertTemp();
    
    
    
  System.out.println("ConvertTemp");
    
    conversion.convert(50.5);
    System.out.println(" = " + conversion.getTemp() + conversion.toString());
	}
	
}
