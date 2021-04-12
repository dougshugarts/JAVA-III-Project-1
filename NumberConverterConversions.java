// number conversion methods
public class NumberConverterConversions {
		
	private final String hexBase = "0123456789ABCDEF";
	private final Integer [] binaryArray = new Integer [32];
	
	// binary to decimal
	public String binaryToDecimal (String input) {
		
	        Integer decimal = 0;
	        int baseValue = 1;
	 
	        for (int c = input.length() - 1; c >= 0; c--) {
	            if (input.charAt(c) == '1')
	                decimal += baseValue;
	            baseValue = baseValue * 2;
	        }
	 
	        return decimal.toString();
	}
	
	
	// hexadecimal to decimal
	public String hexadecimalToDecimal (String input) {
			
        String hexInput = input.toUpperCase();  
        Integer returnHex = 0;  
        
        for (int c = 0; c < hexInput.length(); c++)  
        {  
            char chr = hexInput.charAt(c);  
            int d = this.hexBase.indexOf(chr);  
            returnHex = 16 * returnHex + d;  
        } 
        
        return returnHex.toString();  
	}
	
	
	//decimal to binary
	
	public String decimalToBinary (String input) {
		
	     int binaryIndex = 0;
	     Integer inputConverted = Integer.parseInt(input);
	     String returnValue = "";
	     
	     while (inputConverted> 0) {
	    	 
	       this.binaryArray[binaryIndex++] = inputConverted % 2;    
	       inputConverted = inputConverted / 2;  
	       
	     } 
		
	     for (int c = 0; c < this.binaryArray.length; c++) {
	    	 
	    	 if (!(this.binaryArray[c] == null)) {
	    	 
	    	returnValue += this.binaryArray[c] + " ";
	    	 }
	     }
	     
		return returnValue;
	}
	
	//decimal to hexadecimal
	public String decimalToHexaDecimal (String input) {
		
	     Integer inputConverted = Integer.parseInt(input);
	     Integer remainder;
	     String hexConverted = "";
	     
	     while (inputConverted > 0)
	     {
	       remainder = inputConverted % 16; 
	       hexConverted = this.hexBase.charAt(remainder) + hexConverted; 
	       inputConverted = inputConverted / 16;
	     }
		
		return hexConverted;
	}
	
}
