
public class DecimalNumberConverter implements AutoCloseable{
	
	private String convertedDecimalNumber = "123"; // initialize return result variable
	
	private NumberConverterConversions converter = new NumberConverterConversions(); // conversion algos class
	
	// parameterless constructor
	DecimalNumberConverter () throws Exception {
	
	}
	
	// methods
	public void convertFromBinary (String input) throws NumberConverterException {
		
		if (!(input.matches("[01][01]+"))) {
			
			throw new NumberConverterException ("Input is not a binary number.");
		}
		
		else {
			
			this.convertedDecimalNumber = this.converter.binaryToDecimal(input);
		}
		
	}
	
	public void convertFromHex (String input) throws NumberConverterException {
		
		if (!(input.matches("^[0-9A-Fa-f]+$"))) {
			
			throw new NumberConverterException ("Input is not a hexadecimal number.");
			
			}
		
		else {
			
			this.convertedDecimalNumber = this.converter.hexadecimalToDecimal(input);
		}
	}
	
	public String getConvertedNumber () {
		
		return this.convertedDecimalNumber;
	}

	@Override
	public void close() throws Exception {
	
	}
}
