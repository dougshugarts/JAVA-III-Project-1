
public class HexNumberConverter implements AutoCloseable{
	
	private String convertedHexNumber = "AA"; // initialize variable
	
	private NumberConverterConversions converter = new NumberConverterConversions(); // conversion algos class
	
	// parameterless constructor
	HexNumberConverter () throws Exception {
		
	}
	
	public void convertFromBinary (String input) throws NumberConverterException {
		
		if (!(input.matches("[01][01]+"))) {
			
			throw new NumberConverterException ("Input is not a binary number.");
		}
		
		else {
			
			String decimal = this.converter.binaryToDecimal(input);
			this.convertedHexNumber = this.converter.decimalToHexaDecimal(decimal);
			
		}
	}
	
	// methods
	public void convertFromDecimal (String input) throws NumberConverterException {
		
		if (!(input.matches("\\d+"))) {
			
			throw new NumberConverterException ("Input contains non-numbers.");
		}
		
		else {
			
			this.convertedHexNumber = this.converter.decimalToHexaDecimal(input);
		}
	}
	
	public String getConvertedNumber () {
		
		return this.convertedHexNumber;
	}

	@Override
	public void close() throws Exception {
		
	}
}
