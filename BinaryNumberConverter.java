
public class BinaryNumberConverter implements AutoCloseable {
	
	private String convertedBinaryNumber = "0101"; // initialize variable
	
	private NumberConverterConversions converter = new NumberConverterConversions(); // conversion algos class
	
	// parameterless constructor
	BinaryNumberConverter () throws Exception {
		
	}

	public void convertFromHex (String input) throws NumberConverterException {
		
		if (!(input.matches("^[0-9A-Fa-f]+$"))) {
			
			throw new NumberConverterException ("Input is not a hexadecimal number.");
			
			}
		
		else {
			
			String decimal = this.converter.hexadecimalToDecimal(input);
			this.convertedBinaryNumber = this.converter.decimalToBinary(decimal);
			
		}
	}
	
	// methods
	public void convertFromDecimal (String input) throws NumberConverterException {
		
		if (!(input.matches("\\d+"))) {
			
			throw new NumberConverterException ("Input contains non-numbers.");
		}
		
		else {
			
			this.convertedBinaryNumber = this.converter.decimalToBinary(input);
		}
	}
	
	public String getConvertedNumber () {
		
		return this.convertedBinaryNumber;
	}
	
	@Override
	public void close() throws Exception {
		
	}
}
